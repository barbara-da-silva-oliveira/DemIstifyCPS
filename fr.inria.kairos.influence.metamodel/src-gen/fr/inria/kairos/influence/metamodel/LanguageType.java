/**
 */
package fr.inria.kairos.influence.metamodel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Language Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getLanguageType()
 * @model
 * @generated
 */
public enum LanguageType implements Enumerator {
	/**
	 * The '<em><b>Natural Language</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NATURAL_LANGUAGE_VALUE
	 * @generated
	 * @ordered
	 */
	NATURAL_LANGUAGE(0, "NaturalLanguage", "NaturalLanguage"),

	/**
	 * The '<em><b>Java Numeric Expression</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JAVA_NUMERIC_EXPRESSION_VALUE
	 * @generated
	 * @ordered
	 */
	JAVA_NUMERIC_EXPRESSION(1, "JavaNumericExpression", "JavaNumericExpression");

	/**
	 * The '<em><b>Natural Language</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NATURAL_LANGUAGE
	 * @model name="NaturalLanguage"
	 * @generated
	 * @ordered
	 */
	public static final int NATURAL_LANGUAGE_VALUE = 0;

	/**
	 * The '<em><b>Java Numeric Expression</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JAVA_NUMERIC_EXPRESSION
	 * @model name="JavaNumericExpression"
	 * @generated
	 * @ordered
	 */
	public static final int JAVA_NUMERIC_EXPRESSION_VALUE = 1;

	/**
	 * An array of all the '<em><b>Language Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final LanguageType[] VALUES_ARRAY = new LanguageType[] { NATURAL_LANGUAGE,
			JAVA_NUMERIC_EXPRESSION, };

	/**
	 * A public read-only list of all the '<em><b>Language Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<LanguageType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Language Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LanguageType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LanguageType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Language Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LanguageType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LanguageType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Language Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LanguageType get(int value) {
		switch (value) {
		case NATURAL_LANGUAGE_VALUE:
			return NATURAL_LANGUAGE;
		case JAVA_NUMERIC_EXPRESSION_VALUE:
			return JAVA_NUMERIC_EXPRESSION;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private LanguageType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //LanguageType
