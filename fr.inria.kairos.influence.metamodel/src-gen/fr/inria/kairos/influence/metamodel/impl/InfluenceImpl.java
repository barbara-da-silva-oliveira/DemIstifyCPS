/**
 */
package fr.inria.kairos.influence.metamodel.impl;

import fr.inria.kairos.influence.metamodel.Influence;
import fr.inria.kairos.influence.metamodel.InfluenceFunction;
import fr.inria.kairos.influence.metamodel.MetamodelPackage;
import fr.inria.kairos.influence.metamodel.MetamodelTables;
import fr.inria.kairos.influence.metamodel.Participant;
import fr.inria.kairos.influence.metamodel.SystemResponseProperty;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsKindOfOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.messages.PivotMessages;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Influence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.kairos.influence.metamodel.impl.InfluenceImpl#getOwnedInfluenceFunction <em>Owned Influence Function</em>}</li>
 *   <li>{@link fr.inria.kairos.influence.metamodel.impl.InfluenceImpl#getOwnedParticipants <em>Owned Participants</em>}</li>
 *   <li>{@link fr.inria.kairos.influence.metamodel.impl.InfluenceImpl#getOutputSRP <em>Output SRP</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InfluenceImpl extends AbstractInfluenceImpl implements Influence {
	/**
	 * The cached value of the '{@link #getOwnedInfluenceFunction() <em>Owned Influence Function</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedInfluenceFunction()
	 * @generated
	 * @ordered
	 */
	protected InfluenceFunction ownedInfluenceFunction;

	/**
	 * The cached value of the '{@link #getOwnedParticipants() <em>Owned Participants</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedParticipants()
	 * @generated
	 * @ordered
	 */
	protected EList<Participant> ownedParticipants;
	/**
	 * The cached value of the '{@link #getOutputSRP() <em>Output SRP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputSRP()
	 * @generated
	 * @ordered
	 */
	protected SystemResponseProperty outputSRP;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InfluenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetamodelPackage.Literals.INFLUENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InfluenceFunction getOwnedInfluenceFunction() {
		return ownedInfluenceFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedInfluenceFunction(InfluenceFunction newOwnedInfluenceFunction,
			NotificationChain msgs) {
		InfluenceFunction oldOwnedInfluenceFunction = ownedInfluenceFunction;
		ownedInfluenceFunction = newOwnedInfluenceFunction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MetamodelPackage.INFLUENCE__OWNED_INFLUENCE_FUNCTION, oldOwnedInfluenceFunction,
					newOwnedInfluenceFunction);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwnedInfluenceFunction(InfluenceFunction newOwnedInfluenceFunction) {
		if (newOwnedInfluenceFunction != ownedInfluenceFunction) {
			NotificationChain msgs = null;
			if (ownedInfluenceFunction != null)
				msgs = ((InternalEObject) ownedInfluenceFunction).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - MetamodelPackage.INFLUENCE__OWNED_INFLUENCE_FUNCTION, null, msgs);
			if (newOwnedInfluenceFunction != null)
				msgs = ((InternalEObject) newOwnedInfluenceFunction).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - MetamodelPackage.INFLUENCE__OWNED_INFLUENCE_FUNCTION, null, msgs);
			msgs = basicSetOwnedInfluenceFunction(newOwnedInfluenceFunction, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.INFLUENCE__OWNED_INFLUENCE_FUNCTION,
					newOwnedInfluenceFunction, newOwnedInfluenceFunction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Participant> getOwnedParticipants() {
		if (ownedParticipants == null) {
			ownedParticipants = new EObjectContainmentEList<Participant>(Participant.class, this,
					MetamodelPackage.INFLUENCE__OWNED_PARTICIPANTS);
		}
		return ownedParticipants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SystemResponseProperty getOutputSRP() {
		if (outputSRP != null && outputSRP.eIsProxy()) {
			InternalEObject oldOutputSRP = (InternalEObject) outputSRP;
			outputSRP = (SystemResponseProperty) eResolveProxy(oldOutputSRP);
			if (outputSRP != oldOutputSRP) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetamodelPackage.INFLUENCE__OUTPUT_SRP,
							oldOutputSRP, outputSRP));
			}
		}
		return outputSRP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemResponseProperty basicGetOutputSRP() {
		return outputSRP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOutputSRP(SystemResponseProperty newOutputSRP) {
		SystemResponseProperty oldOutputSRP = outputSRP;
		outputSRP = newOutputSRP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.INFLUENCE__OUTPUT_SRP, oldOutputSRP,
					outputSRP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean ParticipationPattern(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Influence::ParticipationPattern";
		try {
			/**
			 *
			 * inv ParticipationPattern:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = self.ownedParticipants->exists(p |
			 *           p.oclIsKindOf(ArtifactParticipant)) and
			 *         self.ownedParticipants->exists(p |
			 *           p.oclIsKindOf(EnvironmentalFactorParticipant)) or
			 *         self.ownedParticipants->exists(p |
			 *           p.oclIsKindOf(SRPInputParticipant))
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					MetamodelPackage.Literals.INFLUENCE___PARTICIPATION_PATTERN__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, MetamodelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ List<Participant> ownedParticipants_1 = this.getOwnedParticipants();
					final /*@NonInvalid*/ OrderedSetValue BOXED_ownedParticipants_1 = idResolver
							.createOrderedSetOfAll(MetamodelTables.ORD_CLSSid_Participant, ownedParticipants_1);
					/*@Caught*/ Object CAUGHT_and;
					try {
						/*@Thrown*/ Object accumulator = ValueUtil.FALSE_VALUE;
						Iterator<Object> ITERATOR_p = BOXED_ownedParticipants_1.iterator();
						/*@NonInvalid*/ Boolean exists;
						while (true) {
							if (!ITERATOR_p.hasNext()) {
								if (accumulator == ValueUtil.FALSE_VALUE) {
									exists = ValueUtil.FALSE_VALUE;
								} else {
									throw (InvalidValueException) accumulator;
								}
								break;
							}
							/*@NonInvalid*/ Participant p = (Participant) ITERATOR_p.next();
							/**
							 * p.oclIsKindOf(ArtifactParticipant)
							 */
							final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_metamodel_c_c_ArtifactParticipant = idResolver
									.getClass(MetamodelTables.CLSSid_ArtifactParticipant, null);
							final /*@NonInvalid*/ boolean oclIsKindOf = OclAnyOclIsKindOfOperation.INSTANCE
									.evaluate(executor, p, TYP_metamodel_c_c_ArtifactParticipant).booleanValue();
							//
							if (oclIsKindOf) { // Normal successful body evaluation result
								exists = ValueUtil.TRUE_VALUE;
								break; // Stop immediately
							} else if (!oclIsKindOf) { // Normal unsuccessful body evaluation result
								; // Carry on
							} else { // Impossible badly typed result
								accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "exists");
							}
						}
						final /*@Thrown*/ Boolean and;
						if (exists == ValueUtil.FALSE_VALUE) {
							and = ValueUtil.FALSE_VALUE;
						} else {
							/*@Thrown*/ Object accumulator_0 = ValueUtil.FALSE_VALUE;
							Iterator<Object> ITERATOR_p_0 = BOXED_ownedParticipants_1.iterator();
							/*@NonInvalid*/ Boolean exists_0;
							while (true) {
								if (!ITERATOR_p_0.hasNext()) {
									if (accumulator_0 == ValueUtil.FALSE_VALUE) {
										exists_0 = ValueUtil.FALSE_VALUE;
									} else {
										throw (InvalidValueException) accumulator_0;
									}
									break;
								}
								/*@NonInvalid*/ Participant p_0 = (Participant) ITERATOR_p_0.next();
								/**
								 * p.oclIsKindOf(EnvironmentalFactorParticipant)
								 */
								final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_metamodel_c_c_EnvironmentalFactorParticipant = idResolver
										.getClass(MetamodelTables.CLSSid_EnvironmentalFactorParticipant, null);
								final /*@NonInvalid*/ boolean oclIsKindOf_0 = OclAnyOclIsKindOfOperation.INSTANCE
										.evaluate(executor, p_0, TYP_metamodel_c_c_EnvironmentalFactorParticipant)
										.booleanValue();
								//
								if (oclIsKindOf_0) { // Normal successful body evaluation result
									exists_0 = ValueUtil.TRUE_VALUE;
									break; // Stop immediately
								} else if (!oclIsKindOf_0) { // Normal unsuccessful body evaluation result
									; // Carry on
								} else { // Impossible badly typed result
									accumulator_0 = new InvalidValueException(PivotMessages.NonBooleanBody, "exists");
								}
							}
							if (exists_0 == ValueUtil.FALSE_VALUE) {
								and = ValueUtil.FALSE_VALUE;
							} else {
								if ((exists == null) || (exists_0 == null)) {
									and = null;
								} else {
									and = ValueUtil.TRUE_VALUE;
								}
							}
						}
						CAUGHT_and = and;
					} catch (Exception e) {
						CAUGHT_and = ValueUtil.createInvalidValue(e);
					}
					final /*@Thrown*/ Boolean result;
					if (CAUGHT_and == ValueUtil.TRUE_VALUE) {
						result = ValueUtil.TRUE_VALUE;
					} else {
						/*@Thrown*/ Object accumulator_1 = ValueUtil.FALSE_VALUE;
						Iterator<Object> ITERATOR_p_1 = BOXED_ownedParticipants_1.iterator();
						/*@NonInvalid*/ Boolean exists_1;
						while (true) {
							if (!ITERATOR_p_1.hasNext()) {
								if (accumulator_1 == ValueUtil.FALSE_VALUE) {
									exists_1 = ValueUtil.FALSE_VALUE;
								} else {
									throw (InvalidValueException) accumulator_1;
								}
								break;
							}
							/*@NonInvalid*/ Participant p_1 = (Participant) ITERATOR_p_1.next();
							/**
							 * p.oclIsKindOf(SRPInputParticipant)
							 */
							final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_metamodel_c_c_SRPInputParticipant = idResolver
									.getClass(MetamodelTables.CLSSid_SRPInputParticipant, null);
							final /*@NonInvalid*/ boolean oclIsKindOf_1 = OclAnyOclIsKindOfOperation.INSTANCE
									.evaluate(executor, p_1, TYP_metamodel_c_c_SRPInputParticipant).booleanValue();
							//
							if (oclIsKindOf_1) { // Normal successful body evaluation result
								exists_1 = ValueUtil.TRUE_VALUE;
								break; // Stop immediately
							} else if (!oclIsKindOf_1) { // Normal unsuccessful body evaluation result
								; // Carry on
							} else { // Impossible badly typed result
								accumulator_1 = new InvalidValueException(PivotMessages.NonBooleanBody, "exists");
							}
						}
						if (exists_1 == ValueUtil.TRUE_VALUE) {
							result = ValueUtil.TRUE_VALUE;
						} else {
							if (CAUGHT_and instanceof InvalidValueException) {
								throw (InvalidValueException) CAUGHT_and;
							}
							if ((CAUGHT_and == null) || (exists_1 == null)) {
								result = null;
							} else {
								result = ValueUtil.FALSE_VALUE;
							}
						}
					}
					CAUGHT_result = result;
				} catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, CAUGHT_result, MetamodelTables.INT_0)
						.booleanValue();
				IF_le = logDiagnostic;
			}
			return IF_le;
		} catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MetamodelPackage.INFLUENCE__OWNED_INFLUENCE_FUNCTION:
			return basicSetOwnedInfluenceFunction(null, msgs);
		case MetamodelPackage.INFLUENCE__OWNED_PARTICIPANTS:
			return ((InternalEList<?>) getOwnedParticipants()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MetamodelPackage.INFLUENCE__OWNED_INFLUENCE_FUNCTION:
			return getOwnedInfluenceFunction();
		case MetamodelPackage.INFLUENCE__OWNED_PARTICIPANTS:
			return getOwnedParticipants();
		case MetamodelPackage.INFLUENCE__OUTPUT_SRP:
			if (resolve)
				return getOutputSRP();
			return basicGetOutputSRP();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case MetamodelPackage.INFLUENCE__OWNED_INFLUENCE_FUNCTION:
			setOwnedInfluenceFunction((InfluenceFunction) newValue);
			return;
		case MetamodelPackage.INFLUENCE__OWNED_PARTICIPANTS:
			getOwnedParticipants().clear();
			getOwnedParticipants().addAll((Collection<? extends Participant>) newValue);
			return;
		case MetamodelPackage.INFLUENCE__OUTPUT_SRP:
			setOutputSRP((SystemResponseProperty) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case MetamodelPackage.INFLUENCE__OWNED_INFLUENCE_FUNCTION:
			setOwnedInfluenceFunction((InfluenceFunction) null);
			return;
		case MetamodelPackage.INFLUENCE__OWNED_PARTICIPANTS:
			getOwnedParticipants().clear();
			return;
		case MetamodelPackage.INFLUENCE__OUTPUT_SRP:
			setOutputSRP((SystemResponseProperty) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case MetamodelPackage.INFLUENCE__OWNED_INFLUENCE_FUNCTION:
			return ownedInfluenceFunction != null;
		case MetamodelPackage.INFLUENCE__OWNED_PARTICIPANTS:
			return ownedParticipants != null && !ownedParticipants.isEmpty();
		case MetamodelPackage.INFLUENCE__OUTPUT_SRP:
			return outputSRP != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case MetamodelPackage.INFLUENCE___PARTICIPATION_PATTERN__DIAGNOSTICCHAIN_MAP:
			return ParticipationPattern((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //InfluenceImpl
