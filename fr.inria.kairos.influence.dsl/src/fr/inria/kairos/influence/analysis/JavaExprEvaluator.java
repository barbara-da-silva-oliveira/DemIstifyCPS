package fr.inria.kairos.influence.analysis;

import java.util.*;
import java.util.regex.Pattern;

///
//  Tiny expression evaluator: numbers, variables, + - * / ^, parentheses,
// and functions: sin, cos, tan, exp, log, sqrt, abs, min, max.
// Right-assoc exponent (^). Variables are [A-Za-z_][A-Za-z0-9_]*.
//
public final class JavaExprEvaluator {

  // Compile an expression string to an AST.
	public static Expr compile(String expr) {
		return new Parser(expr).parse();
  }

 // Evaluate a compiled expression with the given variable values.
	public static double eval(Expr ast, Map<String,Double> vars) {
		return ast.eval(vars);
  }

 // Find all variable names that appear in the expression.
	public static Set<String> variables(Expr ast) {
	    HashSet<String> vs = new HashSet<>();
	    ast.collectVars(vs);
	    // remove built-in constants if accidentally collected
	    vs.remove("pi");
	    vs.remove("e");
	    return vs;
	  }

	  // ----------------- AST -----------------
	public interface Expr {
	    double eval(Map<String,Double> vars);
	    void collectVars(Set<String> out);
	  }

	static final class Num implements Expr {
	    final double v;
	    Num(double v) {
	    	this.v=v; 
	    	}
	    public double eval(Map<String,Double> vars) {
	    	return v; 
	    	}
	    public void collectVars(Set<String> out) {}
	  }

	static final class Var implements Expr {
	    final String name;
	    Var(String n){
	    	this.name=n; 
	    	}
	    public double eval(Map<String,Double> vars) {
	      if ("pi".equals(name)) return Math.PI;
	      if ("e".equals(name))  return Math.E;
	      Double v = vars.get(name);
	      if (v == null) throw new IllegalArgumentException("Missing variable: "+name);
	      return v.doubleValue();
	    }
	    public void collectVars(Set<String> out) { 
	      if (!"pi".equals(name) && !"e".equals(name)) out.add(name); 
	    }
	  }
	
	static final class Unary implements Expr {
	    final char op; final Expr a;
	    Unary(char op, Expr a){
	    	this.op=op; 
	    	this.a=a; 
	    	}
	    public double eval(Map<String,Double> vars) {
	      double x = a.eval(vars);
	      return (op=='+')? x : -x;
	    }
	    public void collectVars(Set<String> out){ a.collectVars(out); }
	  }

	static final class Binary implements Expr {
	    final Expr a,b; final char op;
	    Binary(Expr a, char op, Expr b){
	    	this.a=a; 
	    	this.op=op; 
	    	this.b=b; 
	    	}
	    public double eval(Map<String,Double> vars){
	      double x=a.eval(vars), y=b.eval(vars);
	      return switch(op) {
	        case '+': yield x+y;
	        case '-': yield x-y;
	        case '*': yield x*y;
	        case '/': yield x/y;
	        case '^': yield Math.pow(x,y); // right-assoc handled in parser
	        default: throw new IllegalStateException("op "+op);
	      };
	    }
	    public void collectVars(Set<String> out){ a.collectVars(out); b.collectVars(out); }
	  }

	static final class Call implements Expr {
	    final String fn; final List<Expr> args;
	    Call(String fn, List<Expr> args){ this.fn=fn; this.args=args; }
	    public double eval(Map<String,Double> vars){
	      if (fn.equals("sin"))  return Math.sin(arg(0,vars));
	      if (fn.equals("cos"))  return Math.cos(arg(0,vars));
	      if (fn.equals("tan"))  return Math.tan(arg(0,vars));
	      if (fn.equals("exp"))  return Math.exp(arg(0,vars));
	      if (fn.equals("log"))  return Math.log(arg(0,vars));
	      if (fn.equals("sqrt")) return Math.sqrt(arg(0,vars));
	      if (fn.equals("abs"))  return Math.abs(arg(0,vars));
	      if (fn.equals("min"))  return Math.min(arg(0,vars), arg(1,vars));
	      if (fn.equals("max"))  return Math.max(arg(0,vars), arg(1,vars));
	      throw new IllegalArgumentException("Unknown function: "+fn);
	    }
	    private double arg(int i, Map<String,Double> vars){
	      if (i>=args.size()) throw new IllegalArgumentException("Function "+fn+" needs more args");
	      return args.get(i).eval(vars);
	    }
	    public void collectVars(Set<String> out){ for (Expr e:args) e.collectVars(out); }
	  }


	static final class Lexer {
	    final String s; int i=0; Token t=Token.EOF; String text; double num;
	    Lexer(String s){
	    	this.s=s; next(); 
	    	}
	
	    static final Pattern NUM = Pattern.compile("[0-9]+(\\.[0-9]*)?|\\.[0-9]+");
	    static boolean isIdStart(char c){ return Character.isLetter(c) || c=='_'; }
	    static boolean isIdPart(char c){ return Character.isLetterOrDigit(c) || c=='_'; }
	
	    void next(){
	      skipWs();
	      if (i>=s.length()){ t=Token.EOF; text=null; return; }
	      char c=s.charAt(i);
	      switch(c){
	        case '+': case '-': case '*': case '/': case '^':
	        case '(': case ')': case ',': 
	          t=Token.OP; text=String.valueOf(c); i++; return;
	        default:
	          if (isIdStart(c)){
	            int j=i+1; while (j<s.length() && isIdPart(s.charAt(j))) j++;
	            text=s.substring(i,j); i=j; t=Token.ID; return;
	          }
	          // number?
	          int j=i;
	          while (j<s.length() && (Character.isDigit(s.charAt(j)) || s.charAt(j)=='.')) j++;
	          if (j>i && NUM.matcher(s.substring(i,j)).matches()){
	            text=s.substring(i,j); num=Double.parseDouble(text); i=j; t=Token.NUM; return;
	          }
	          throw new IllegalArgumentException("Unexpected '"+c+"' at "+i+" in "+s);
	      }
	    }
	    void skipWs(){ while (i<s.length() && Character.isWhitespace(s.charAt(i))) i++; }
	  }

	enum Token { OP, ID, NUM, EOF }

	static final class Parser {
	    final Lexer L;
	    Parser(String s){ this.L=new Lexer(s); 
	    }

	    Expr parse(){
	      Expr e = expr();
	      if (L.t!=Token.EOF) throw new IllegalArgumentException("Trailing input near '"+L.text+"'");
	      return e;
	    }
	
	    // expr := term (('+'|'-') term)*
	    Expr expr(){
	      Expr e = term();
	      while (L.t==Token.OP && (L.text.equals("+")||L.text.equals("-"))){
	        char op=L.text.charAt(0); L.next();
	        Expr r = term();
	        e = new Binary(e,op,r);
	      }
	      return e;
	    }
	
	    // term := power (('*'|'/') power)*
	    Expr term(){
	      Expr e = power();
	      while (L.t==Token.OP && (L.text.equals("*")||L.text.equals("/"))){
	        char op=L.text.charAt(0); L.next();
	        Expr r = power();
	        e = new Binary(e,op,r);
	      }
	      return e;
	    }
	
	    // power := unary ('^' power)?  (right-assoc)
	    Expr power(){
	      Expr a = unary();
	      if (L.t==Token.OP && L.text.equals("^")){
	        L.next();
	        Expr b = power();
	        return new Binary(a,'^',b);
	      }
	      return a;
	    }
	
	    // unary := ('+'|'-') unary | primary
	    Expr unary(){
	      if (L.t==Token.OP && (L.text.equals("+")||L.text.equals("-"))){
	        char op=L.text.charAt(0); L.next();
	        return new Unary(op, unary());
	      }
	      return primary();
	    }
	
	    // primary := NUM | ID | ID '(' args ')' | '(' expr ')'
	    Expr primary(){
	    	if (L.t==Token.NUM){
	        double v=L.num; L.next(); return new Num(v);
		    }
		      if (L.t==Token.ID){
		        String id=L.text; L.next();
		        if (L.t==Token.OP && L.text.equals("(")){
		          L.next();
		          List<Expr> args=new ArrayList<>();
		          if (!(L.t==Token.OP && L.text.equals(")"))){
		            args.add(expr());
		            while (L.t==Token.OP && L.text.equals(",")){ L.next(); args.add(expr()); }
		          }
		          expect(")");
		          return new Call(id,args);
		        }
		        return new Var(id);
		      }
		      	if (L.t==Token.OP && L.text.equals("(")){
		        L.next(); Expr e=expr(); expect(")"); return e;
		      }
		      	throw new IllegalArgumentException("Unexpected token near '"+L.text+"'");
		    }
	
		void expect(String op){
	    	if (L.t==Token.OP && L.text.equals(op)){ L.next(); return; }
	    	throw new IllegalArgumentException("Expected '"+op+"'");
    }
  }
}

