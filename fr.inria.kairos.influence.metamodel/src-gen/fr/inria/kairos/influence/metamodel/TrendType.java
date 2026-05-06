/**
 */
package fr.inria.kairos.influence.metamodel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Trend Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getTrendType()
 * @model
 * @generated
 */
public enum TrendType implements Enumerator {
	/**
	 * The '<em><b>Increasing</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INCREASING_VALUE
	 * @generated
	 * @ordered
	 */
	INCREASING(0, "Increasing", "Increasing"),

	/**
	 * The '<em><b>Decreasing</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DECREASING_VALUE
	 * @generated
	 * @ordered
	 */
	DECREASING(1, "Decreasing", "Decreasing"),

	/**
	 * The '<em><b>Flat</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLAT_VALUE
	 * @generated
	 * @ordered
	 */
	FLAT(2, "Flat", "Flat"),

	/**
	 * The '<em><b>Not Monotonic</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_MONOTONIC_VALUE
	 * @generated
	 * @ordered
	 */
	NOT_MONOTONIC(3, "NotMonotonic", "NotMonotonic");

	/**
	 * The '<em><b>Increasing</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INCREASING
	 * @model name="Increasing"
	 * @generated
	 * @ordered
	 */
	public static final int INCREASING_VALUE = 0;

	/**
	 * The '<em><b>Decreasing</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DECREASING
	 * @model name="Decreasing"
	 * @generated
	 * @ordered
	 */
	public static final int DECREASING_VALUE = 1;

	/**
	 * The '<em><b>Flat</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLAT
	 * @model name="Flat"
	 * @generated
	 * @ordered
	 */
	public static final int FLAT_VALUE = 2;

	/**
	 * The '<em><b>Not Monotonic</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_MONOTONIC
	 * @model name="NotMonotonic"
	 * @generated
	 * @ordered
	 */
	public static final int NOT_MONOTONIC_VALUE = 3;

	/**
	 * An array of all the '<em><b>Trend Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TrendType[] VALUES_ARRAY = new TrendType[] { INCREASING, DECREASING, FLAT, NOT_MONOTONIC, };

	/**
	 * A public read-only list of all the '<em><b>Trend Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TrendType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Trend Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TrendType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TrendType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Trend Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TrendType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TrendType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Trend Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TrendType get(int value) {
		switch (value) {
		case INCREASING_VALUE:
			return INCREASING;
		case DECREASING_VALUE:
			return DECREASING;
		case FLAT_VALUE:
			return FLAT;
		case NOT_MONOTONIC_VALUE:
			return NOT_MONOTONIC;
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
	private TrendType(int value, String name, String literal) {
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

} //TrendType
