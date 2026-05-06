/**
 */
package fr.inria.kairos.influence.metamodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Analytic Expression Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.kairos.influence.metamodel.AnalyticExpressionFunction#getExpression <em>Expression</em>}</li>
 *   <li>{@link fr.inria.kairos.influence.metamodel.AnalyticExpressionFunction#getExpressionLanguage <em>Expression Language</em>}</li>
 * </ul>
 *
 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getAnalyticExpressionFunction()
 * @model
 * @generated
 */
public interface AnalyticExpressionFunction extends FunctionRepresentation, NamedElement {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' attribute.
	 * @see #setExpression(String)
	 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getAnalyticExpressionFunction_Expression()
	 * @model
	 * @generated
	 */
	String getExpression();

	/**
	 * Sets the value of the '{@link fr.inria.kairos.influence.metamodel.AnalyticExpressionFunction#getExpression <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' attribute.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(String value);

	/**
	 * Returns the value of the '<em><b>Expression Language</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.inria.kairos.influence.metamodel.LanguageType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression Language</em>' attribute.
	 * @see fr.inria.kairos.influence.metamodel.LanguageType
	 * @see #setExpressionLanguage(LanguageType)
	 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getAnalyticExpressionFunction_ExpressionLanguage()
	 * @model
	 * @generated
	 */
	LanguageType getExpressionLanguage();

	/**
	 * Sets the value of the '{@link fr.inria.kairos.influence.metamodel.AnalyticExpressionFunction#getExpressionLanguage <em>Expression Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression Language</em>' attribute.
	 * @see fr.inria.kairos.influence.metamodel.LanguageType
	 * @see #getExpressionLanguage()
	 * @generated
	 */
	void setExpressionLanguage(LanguageType value);

} // AnalyticExpressionFunction
