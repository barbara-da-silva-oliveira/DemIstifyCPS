/**
 */
package fr.inria.kairos.influence.metamodel;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Influence Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.kairos.influence.metamodel.InfluenceFunction#getDefinition <em>Definition</em>}</li>
 *   <li>{@link fr.inria.kairos.influence.metamodel.InfluenceFunction#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link fr.inria.kairos.influence.metamodel.InfluenceFunction#getLanguage <em>Language</em>}</li>
 * </ul>
 *
 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getInfluenceFunction()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='LanguageReturn'"
 * @generated
 */
public interface InfluenceFunction extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition</em>' attribute.
	 * @see #setDefinition(String)
	 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getInfluenceFunction_Definition()
	 * @model required="true"
	 * @generated
	 */
	String getDefinition();

	/**
	 * Sets the value of the '{@link fr.inria.kairos.influence.metamodel.InfluenceFunction#getDefinition <em>Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition</em>' attribute.
	 * @see #getDefinition()
	 * @generated
	 */
	void setDefinition(String value);

	/**
	 * Returns the value of the '<em><b>Return Type</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.inria.kairos.influence.metamodel.ValueType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Type</em>' attribute.
	 * @see fr.inria.kairos.influence.metamodel.ValueType
	 * @see #setReturnType(ValueType)
	 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getInfluenceFunction_ReturnType()
	 * @model required="true"
	 * @generated
	 */
	ValueType getReturnType();

	/**
	 * Sets the value of the '{@link fr.inria.kairos.influence.metamodel.InfluenceFunction#getReturnType <em>Return Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Type</em>' attribute.
	 * @see fr.inria.kairos.influence.metamodel.ValueType
	 * @see #getReturnType()
	 * @generated
	 */
	void setReturnType(ValueType value);

	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.inria.kairos.influence.metamodel.LanguageType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see fr.inria.kairos.influence.metamodel.LanguageType
	 * @see #setLanguage(LanguageType)
	 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getInfluenceFunction_Language()
	 * @model required="true"
	 * @generated
	 */
	LanguageType getLanguage();

	/**
	 * Sets the value of the '{@link fr.inria.kairos.influence.metamodel.InfluenceFunction#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see fr.inria.kairos.influence.metamodel.LanguageType
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(LanguageType value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\tif self.language = LanguageType::JavaNumericExpression then\n\t        \tself.returnType = ValueType::Real\n\t        else \n\t        \tself.returnType = ValueType::Text\n\t        endif\n        '"
	 * @generated
	 */
	boolean LanguageReturn(DiagnosticChain diagnostics, Map<Object, Object> context);

} // InfluenceFunction
