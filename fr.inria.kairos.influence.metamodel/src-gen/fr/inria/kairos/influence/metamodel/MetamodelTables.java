/*******************************************************************************
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /fr.inria.kairos.influence.metamodel/model/metamodel.ecore
 * using:
 *   /fr.inria.kairos.influence.metamodel/model/metamodel.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package fr.inria.kairos.influence.metamodel;

// import fr.inria.kairos.influence.metamodel.MetamodelPackage;
// import fr.inria.kairos.influence.metamodel.MetamodelTables;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.ocl.pivot.ids.ClassId;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.DataTypeId;
import org.eclipse.ocl.pivot.ids.EnumerationId;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.NsURIPackageId;
import org.eclipse.ocl.pivot.ids.RootPackageId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumeration;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumerationLiteral;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreLibraryOppositeProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorPropertyWithImplementation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorType;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.AbstractTables;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;

/**
 * MetamodelTables provides the dispatch tables for the metamodel for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class MetamodelTables extends AbstractTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(MetamodelPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ RootPackageId PACKid_$metamodel$ = IdManager.getRootPackageId("$metamodel$");
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_kairos_inria_fr_s_influences = IdManager.getNsURIPackageId("http://kairos.inria.fr/influences", null, MetamodelPackage.eINSTANCE);
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore = IdManager.getNsURIPackageId("http://www.eclipse.org/emf/2002/Ecore", null, EcorePackage.eINSTANCE);
	public static final /*@NonInvalid*/ ClassId CLSSid_AbstractInfluence = MetamodelTables.PACKid_http_c_s_s_kairos_inria_fr_s_influences.getClassId("AbstractInfluence", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_ArtifactParticipant = MetamodelTables.PACKid_http_c_s_s_kairos_inria_fr_s_influences.getClassId("ArtifactParticipant", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Class = MetamodelTables.PACKid_$metamodel$.getClassId("Class", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_CompositeInfluence = MetamodelTables.PACKid_http_c_s_s_kairos_inria_fr_s_influences.getClassId("CompositeInfluence", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_DesignArtifact = MetamodelTables.PACKid_http_c_s_s_kairos_inria_fr_s_influences.getClassId("DesignArtifact", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_EObject = MetamodelTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getClassId("EObject", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_EnvironmentalFactor = MetamodelTables.PACKid_http_c_s_s_kairos_inria_fr_s_influences.getClassId("EnvironmentalFactor", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_EnvironmentalFactorParticipant = MetamodelTables.PACKid_http_c_s_s_kairos_inria_fr_s_influences.getClassId("EnvironmentalFactorParticipant", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_FunctionRepresentation = MetamodelTables.PACKid_http_c_s_s_kairos_inria_fr_s_influences.getClassId("FunctionRepresentation", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Influence = MetamodelTables.PACKid_http_c_s_s_kairos_inria_fr_s_influences.getClassId("Influence", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_InfluenceFunction = MetamodelTables.PACKid_http_c_s_s_kairos_inria_fr_s_influences.getClassId("InfluenceFunction", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_InfluenceModel = MetamodelTables.PACKid_http_c_s_s_kairos_inria_fr_s_influences.getClassId("InfluenceModel", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_MonotonicityRow = MetamodelTables.PACKid_http_c_s_s_kairos_inria_fr_s_influences.getClassId("MonotonicityRow", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_MonotonicityTable = MetamodelTables.PACKid_http_c_s_s_kairos_inria_fr_s_influences.getClassId("MonotonicityTable", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Participant = MetamodelTables.PACKid_http_c_s_s_kairos_inria_fr_s_influences.getClassId("Participant", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_ParticipantImpactFunction = MetamodelTables.PACKid_http_c_s_s_kairos_inria_fr_s_influences.getClassId("ParticipantImpactFunction", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_ParticipantRange = MetamodelTables.PACKid_http_c_s_s_kairos_inria_fr_s_influences.getClassId("ParticipantRange", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_ParticipantRelativeImpact = MetamodelTables.PACKid_http_c_s_s_kairos_inria_fr_s_influences.getClassId("ParticipantRelativeImpact", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_SRPInputParticipant = MetamodelTables.PACKid_http_c_s_s_kairos_inria_fr_s_influences.getClassId("SRPInputParticipant", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_SatisfactionCriterion = MetamodelTables.PACKid_http_c_s_s_kairos_inria_fr_s_influences.getClassId("SatisfactionCriterion", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_SystemResponseProperty = MetamodelTables.PACKid_http_c_s_s_kairos_inria_fr_s_influences.getClassId("SystemResponseProperty", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_ValueSpec = MetamodelTables.PACKid_http_c_s_s_kairos_inria_fr_s_influences.getClassId("ValueSpec", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EDouble = MetamodelTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EDouble", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EInt = MetamodelTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EInt", 0);
	public static final /*@NonInvalid*/ EnumerationId ENUMid_LanguageType = MetamodelTables.PACKid_http_c_s_s_kairos_inria_fr_s_influences.getEnumerationId("LanguageType");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_TrendType = MetamodelTables.PACKid_http_c_s_s_kairos_inria_fr_s_influences.getEnumerationId("TrendType");
	public static final /*@NonInvalid*/ IntegerValue INT_0 = ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_ArtifactParticipant = TypeId.BAG.getSpecializedId(MetamodelTables.CLSSid_ArtifactParticipant, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_CompositeInfluence = TypeId.BAG.getSpecializedId(MetamodelTables.CLSSid_CompositeInfluence, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_EnvironmentalFactorParticipant = TypeId.BAG.getSpecializedId(MetamodelTables.CLSSid_EnvironmentalFactorParticipant, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Influence = TypeId.BAG.getSpecializedId(MetamodelTables.CLSSid_Influence, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_MonotonicityRow = TypeId.BAG.getSpecializedId(MetamodelTables.CLSSid_MonotonicityRow, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_ParticipantRange = TypeId.BAG.getSpecializedId(MetamodelTables.CLSSid_ParticipantRange, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_ParticipantRelativeImpact = TypeId.BAG.getSpecializedId(MetamodelTables.CLSSid_ParticipantRelativeImpact, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_SRPInputParticipant = TypeId.BAG.getSpecializedId(MetamodelTables.CLSSid_SRPInputParticipant, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_SatisfactionCriterion = TypeId.BAG.getSpecializedId(MetamodelTables.CLSSid_SatisfactionCriterion, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_AbstractInfluence = TypeId.ORDERED_SET.getSpecializedId(MetamodelTables.CLSSid_AbstractInfluence, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_AbstractInfluence_0 = TypeId.ORDERED_SET.getSpecializedId(MetamodelTables.CLSSid_AbstractInfluence, true, ValueUtil.integerValueOf(2), ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_DesignArtifact = TypeId.ORDERED_SET.getSpecializedId(MetamodelTables.CLSSid_DesignArtifact, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_EnvironmentalFactor = TypeId.ORDERED_SET.getSpecializedId(MetamodelTables.CLSSid_EnvironmentalFactor, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_FunctionRepresentation = TypeId.ORDERED_SET.getSpecializedId(MetamodelTables.CLSSid_FunctionRepresentation, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_MonotonicityRow = TypeId.ORDERED_SET.getSpecializedId(MetamodelTables.CLSSid_MonotonicityRow, true, ValueUtil.ONE_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Participant = TypeId.ORDERED_SET.getSpecializedId(MetamodelTables.CLSSid_Participant, true, ValueUtil.ONE_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_ParticipantRange = TypeId.ORDERED_SET.getSpecializedId(MetamodelTables.CLSSid_ParticipantRange, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_ParticipantRelativeImpact = TypeId.ORDERED_SET.getSpecializedId(MetamodelTables.CLSSid_ParticipantRelativeImpact, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_SatisfactionCriterion = TypeId.ORDERED_SET.getSpecializedId(MetamodelTables.CLSSid_SatisfactionCriterion, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_SystemResponseProperty = TypeId.ORDERED_SET.getSpecializedId(MetamodelTables.CLSSid_SystemResponseProperty, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			MetamodelTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of MetamodelTables::TypeParameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		static {
			Init.initStart();
			TypeParameters.init();
		}

		public static final EcoreExecutorType _AbstractInfluence = new EcoreExecutorType(MetamodelPackage.Literals.ABSTRACT_INFLUENCE, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _AnalyticExpressionFunction = new EcoreExecutorType(MetamodelPackage.Literals.ANALYTIC_EXPRESSION_FUNCTION, PACKAGE, 0);
		public static final EcoreExecutorType _ArtifactParticipant = new EcoreExecutorType(MetamodelPackage.Literals.ARTIFACT_PARTICIPANT, PACKAGE, 0);
		public static final EcoreExecutorType _CompositeInfluence = new EcoreExecutorType(MetamodelPackage.Literals.COMPOSITE_INFLUENCE, PACKAGE, 0);
		public static final EcoreExecutorType _DesignArtifact = new EcoreExecutorType(MetamodelPackage.Literals.DESIGN_ARTIFACT, PACKAGE, 0);
		public static final EcoreExecutorType _EnvironmentalFactor = new EcoreExecutorType(MetamodelPackage.Literals.ENVIRONMENTAL_FACTOR, PACKAGE, 0);
		public static final EcoreExecutorType _EnvironmentalFactorParticipant = new EcoreExecutorType(MetamodelPackage.Literals.ENVIRONMENTAL_FACTOR_PARTICIPANT, PACKAGE, 0);
		public static final EcoreExecutorType _FunctionRepresentation = new EcoreExecutorType(MetamodelPackage.Literals.FUNCTION_REPRESENTATION, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _Influence = new EcoreExecutorType(MetamodelPackage.Literals.INFLUENCE, PACKAGE, 0);
		public static final EcoreExecutorType _InfluenceFunction = new EcoreExecutorType(MetamodelPackage.Literals.INFLUENCE_FUNCTION, PACKAGE, 0);
		public static final EcoreExecutorType _InfluenceModel = new EcoreExecutorType(MetamodelPackage.Literals.INFLUENCE_MODEL, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _LanguageType = new EcoreExecutorEnumeration(MetamodelPackage.Literals.LANGUAGE_TYPE, PACKAGE, 0);
		public static final EcoreExecutorType _MonotonicityRow = new EcoreExecutorType(MetamodelPackage.Literals.MONOTONICITY_ROW, PACKAGE, 0);
		public static final EcoreExecutorType _MonotonicityTable = new EcoreExecutorType(MetamodelPackage.Literals.MONOTONICITY_TABLE, PACKAGE, 0);
		public static final EcoreExecutorType _NamedElement = new EcoreExecutorType(MetamodelPackage.Literals.NAMED_ELEMENT, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _NaturalLanguageFunction = new EcoreExecutorType(MetamodelPackage.Literals.NATURAL_LANGUAGE_FUNCTION, PACKAGE, 0);
		public static final EcoreExecutorType _Participant = new EcoreExecutorType(MetamodelPackage.Literals.PARTICIPANT, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _ParticipantImpactFunction = new EcoreExecutorType(MetamodelPackage.Literals.PARTICIPANT_IMPACT_FUNCTION, PACKAGE, 0);
		public static final EcoreExecutorType _ParticipantRange = new EcoreExecutorType(MetamodelPackage.Literals.PARTICIPANT_RANGE, PACKAGE, 0);
		public static final EcoreExecutorType _ParticipantRelativeImpact = new EcoreExecutorType(MetamodelPackage.Literals.PARTICIPANT_RELATIVE_IMPACT, PACKAGE, 0);
		public static final EcoreExecutorType _RangeValue = new EcoreExecutorType(MetamodelPackage.Literals.RANGE_VALUE, PACKAGE, 0);
		public static final EcoreExecutorType _SRPInputParticipant = new EcoreExecutorType(MetamodelPackage.Literals.SRP_INPUT_PARTICIPANT, PACKAGE, 0);
		public static final EcoreExecutorType _SatisfactionCriterion = new EcoreExecutorType(MetamodelPackage.Literals.SATISFACTION_CRITERION, PACKAGE, 0);
		public static final EcoreExecutorType _ScalarValue = new EcoreExecutorType(MetamodelPackage.Literals.SCALAR_VALUE, PACKAGE, 0);
		public static final EcoreExecutorType _SystemResponseProperty = new EcoreExecutorType(MetamodelPackage.Literals.SYSTEM_RESPONSE_PROPERTY, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _TrendType = new EcoreExecutorEnumeration(MetamodelPackage.Literals.TREND_TYPE, PACKAGE, 0);
		public static final EcoreExecutorType _ValueSpec = new EcoreExecutorType(MetamodelPackage.Literals.VALUE_SPEC, PACKAGE, 0 | ExecutorType.ABSTRACT);

		private static final EcoreExecutorType /*@NonNull*/ [] types = {
			_AbstractInfluence,
			_AnalyticExpressionFunction,
			_ArtifactParticipant,
			_CompositeInfluence,
			_DesignArtifact,
			_EnvironmentalFactor,
			_EnvironmentalFactorParticipant,
			_FunctionRepresentation,
			_Influence,
			_InfluenceFunction,
			_InfluenceModel,
			_LanguageType,
			_MonotonicityRow,
			_MonotonicityTable,
			_NamedElement,
			_NaturalLanguageFunction,
			_Participant,
			_ParticipantImpactFunction,
			_ParticipantRange,
			_ParticipantRelativeImpact,
			_RangeValue,
			_SRPInputParticipant,
			_SatisfactionCriterion,
			_ScalarValue,
			_SystemResponseProperty,
			_TrendType,
			_ValueSpec
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of MetamodelTables::Types and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		static {
			Init.initStart();
			Types.init();
		}

		private static final ExecutorFragment _AbstractInfluence__AbstractInfluence = new ExecutorFragment(Types._AbstractInfluence, MetamodelTables.Types._AbstractInfluence);
		private static final ExecutorFragment _AbstractInfluence__NamedElement = new ExecutorFragment(Types._AbstractInfluence, MetamodelTables.Types._NamedElement);
		private static final ExecutorFragment _AbstractInfluence__OclAny = new ExecutorFragment(Types._AbstractInfluence, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _AbstractInfluence__OclElement = new ExecutorFragment(Types._AbstractInfluence, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _AnalyticExpressionFunction__AnalyticExpressionFunction = new ExecutorFragment(Types._AnalyticExpressionFunction, MetamodelTables.Types._AnalyticExpressionFunction);
		private static final ExecutorFragment _AnalyticExpressionFunction__FunctionRepresentation = new ExecutorFragment(Types._AnalyticExpressionFunction, MetamodelTables.Types._FunctionRepresentation);
		private static final ExecutorFragment _AnalyticExpressionFunction__NamedElement = new ExecutorFragment(Types._AnalyticExpressionFunction, MetamodelTables.Types._NamedElement);
		private static final ExecutorFragment _AnalyticExpressionFunction__OclAny = new ExecutorFragment(Types._AnalyticExpressionFunction, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _AnalyticExpressionFunction__OclElement = new ExecutorFragment(Types._AnalyticExpressionFunction, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _ArtifactParticipant__ArtifactParticipant = new ExecutorFragment(Types._ArtifactParticipant, MetamodelTables.Types._ArtifactParticipant);
		private static final ExecutorFragment _ArtifactParticipant__NamedElement = new ExecutorFragment(Types._ArtifactParticipant, MetamodelTables.Types._NamedElement);
		private static final ExecutorFragment _ArtifactParticipant__OclAny = new ExecutorFragment(Types._ArtifactParticipant, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ArtifactParticipant__OclElement = new ExecutorFragment(Types._ArtifactParticipant, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _ArtifactParticipant__Participant = new ExecutorFragment(Types._ArtifactParticipant, MetamodelTables.Types._Participant);

		private static final ExecutorFragment _CompositeInfluence__AbstractInfluence = new ExecutorFragment(Types._CompositeInfluence, MetamodelTables.Types._AbstractInfluence);
		private static final ExecutorFragment _CompositeInfluence__CompositeInfluence = new ExecutorFragment(Types._CompositeInfluence, MetamodelTables.Types._CompositeInfluence);
		private static final ExecutorFragment _CompositeInfluence__NamedElement = new ExecutorFragment(Types._CompositeInfluence, MetamodelTables.Types._NamedElement);
		private static final ExecutorFragment _CompositeInfluence__OclAny = new ExecutorFragment(Types._CompositeInfluence, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _CompositeInfluence__OclElement = new ExecutorFragment(Types._CompositeInfluence, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _DesignArtifact__DesignArtifact = new ExecutorFragment(Types._DesignArtifact, MetamodelTables.Types._DesignArtifact);
		private static final ExecutorFragment _DesignArtifact__NamedElement = new ExecutorFragment(Types._DesignArtifact, MetamodelTables.Types._NamedElement);
		private static final ExecutorFragment _DesignArtifact__OclAny = new ExecutorFragment(Types._DesignArtifact, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _DesignArtifact__OclElement = new ExecutorFragment(Types._DesignArtifact, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _EnvironmentalFactor__EnvironmentalFactor = new ExecutorFragment(Types._EnvironmentalFactor, MetamodelTables.Types._EnvironmentalFactor);
		private static final ExecutorFragment _EnvironmentalFactor__NamedElement = new ExecutorFragment(Types._EnvironmentalFactor, MetamodelTables.Types._NamedElement);
		private static final ExecutorFragment _EnvironmentalFactor__OclAny = new ExecutorFragment(Types._EnvironmentalFactor, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _EnvironmentalFactor__OclElement = new ExecutorFragment(Types._EnvironmentalFactor, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _EnvironmentalFactorParticipant__EnvironmentalFactorParticipant = new ExecutorFragment(Types._EnvironmentalFactorParticipant, MetamodelTables.Types._EnvironmentalFactorParticipant);
		private static final ExecutorFragment _EnvironmentalFactorParticipant__NamedElement = new ExecutorFragment(Types._EnvironmentalFactorParticipant, MetamodelTables.Types._NamedElement);
		private static final ExecutorFragment _EnvironmentalFactorParticipant__OclAny = new ExecutorFragment(Types._EnvironmentalFactorParticipant, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _EnvironmentalFactorParticipant__OclElement = new ExecutorFragment(Types._EnvironmentalFactorParticipant, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _EnvironmentalFactorParticipant__Participant = new ExecutorFragment(Types._EnvironmentalFactorParticipant, MetamodelTables.Types._Participant);

		private static final ExecutorFragment _FunctionRepresentation__FunctionRepresentation = new ExecutorFragment(Types._FunctionRepresentation, MetamodelTables.Types._FunctionRepresentation);
		private static final ExecutorFragment _FunctionRepresentation__OclAny = new ExecutorFragment(Types._FunctionRepresentation, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _FunctionRepresentation__OclElement = new ExecutorFragment(Types._FunctionRepresentation, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Influence__AbstractInfluence = new ExecutorFragment(Types._Influence, MetamodelTables.Types._AbstractInfluence);
		private static final ExecutorFragment _Influence__Influence = new ExecutorFragment(Types._Influence, MetamodelTables.Types._Influence);
		private static final ExecutorFragment _Influence__NamedElement = new ExecutorFragment(Types._Influence, MetamodelTables.Types._NamedElement);
		private static final ExecutorFragment _Influence__OclAny = new ExecutorFragment(Types._Influence, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Influence__OclElement = new ExecutorFragment(Types._Influence, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _InfluenceFunction__InfluenceFunction = new ExecutorFragment(Types._InfluenceFunction, MetamodelTables.Types._InfluenceFunction);
		private static final ExecutorFragment _InfluenceFunction__NamedElement = new ExecutorFragment(Types._InfluenceFunction, MetamodelTables.Types._NamedElement);
		private static final ExecutorFragment _InfluenceFunction__OclAny = new ExecutorFragment(Types._InfluenceFunction, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _InfluenceFunction__OclElement = new ExecutorFragment(Types._InfluenceFunction, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _InfluenceModel__InfluenceModel = new ExecutorFragment(Types._InfluenceModel, MetamodelTables.Types._InfluenceModel);
		private static final ExecutorFragment _InfluenceModel__NamedElement = new ExecutorFragment(Types._InfluenceModel, MetamodelTables.Types._NamedElement);
		private static final ExecutorFragment _InfluenceModel__OclAny = new ExecutorFragment(Types._InfluenceModel, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _InfluenceModel__OclElement = new ExecutorFragment(Types._InfluenceModel, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _LanguageType__LanguageType = new ExecutorFragment(Types._LanguageType, MetamodelTables.Types._LanguageType);
		private static final ExecutorFragment _LanguageType__OclAny = new ExecutorFragment(Types._LanguageType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _LanguageType__OclElement = new ExecutorFragment(Types._LanguageType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _LanguageType__OclEnumeration = new ExecutorFragment(Types._LanguageType, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _LanguageType__OclType = new ExecutorFragment(Types._LanguageType, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _MonotonicityRow__MonotonicityRow = new ExecutorFragment(Types._MonotonicityRow, MetamodelTables.Types._MonotonicityRow);
		private static final ExecutorFragment _MonotonicityRow__NamedElement = new ExecutorFragment(Types._MonotonicityRow, MetamodelTables.Types._NamedElement);
		private static final ExecutorFragment _MonotonicityRow__OclAny = new ExecutorFragment(Types._MonotonicityRow, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _MonotonicityRow__OclElement = new ExecutorFragment(Types._MonotonicityRow, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _MonotonicityTable__FunctionRepresentation = new ExecutorFragment(Types._MonotonicityTable, MetamodelTables.Types._FunctionRepresentation);
		private static final ExecutorFragment _MonotonicityTable__MonotonicityTable = new ExecutorFragment(Types._MonotonicityTable, MetamodelTables.Types._MonotonicityTable);
		private static final ExecutorFragment _MonotonicityTable__NamedElement = new ExecutorFragment(Types._MonotonicityTable, MetamodelTables.Types._NamedElement);
		private static final ExecutorFragment _MonotonicityTable__OclAny = new ExecutorFragment(Types._MonotonicityTable, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _MonotonicityTable__OclElement = new ExecutorFragment(Types._MonotonicityTable, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _NamedElement__NamedElement = new ExecutorFragment(Types._NamedElement, MetamodelTables.Types._NamedElement);
		private static final ExecutorFragment _NamedElement__OclAny = new ExecutorFragment(Types._NamedElement, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _NamedElement__OclElement = new ExecutorFragment(Types._NamedElement, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _NaturalLanguageFunction__FunctionRepresentation = new ExecutorFragment(Types._NaturalLanguageFunction, MetamodelTables.Types._FunctionRepresentation);
		private static final ExecutorFragment _NaturalLanguageFunction__NamedElement = new ExecutorFragment(Types._NaturalLanguageFunction, MetamodelTables.Types._NamedElement);
		private static final ExecutorFragment _NaturalLanguageFunction__NaturalLanguageFunction = new ExecutorFragment(Types._NaturalLanguageFunction, MetamodelTables.Types._NaturalLanguageFunction);
		private static final ExecutorFragment _NaturalLanguageFunction__OclAny = new ExecutorFragment(Types._NaturalLanguageFunction, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _NaturalLanguageFunction__OclElement = new ExecutorFragment(Types._NaturalLanguageFunction, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Participant__NamedElement = new ExecutorFragment(Types._Participant, MetamodelTables.Types._NamedElement);
		private static final ExecutorFragment _Participant__OclAny = new ExecutorFragment(Types._Participant, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Participant__OclElement = new ExecutorFragment(Types._Participant, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Participant__Participant = new ExecutorFragment(Types._Participant, MetamodelTables.Types._Participant);

		private static final ExecutorFragment _ParticipantImpactFunction__FunctionRepresentation = new ExecutorFragment(Types._ParticipantImpactFunction, MetamodelTables.Types._FunctionRepresentation);
		private static final ExecutorFragment _ParticipantImpactFunction__NamedElement = new ExecutorFragment(Types._ParticipantImpactFunction, MetamodelTables.Types._NamedElement);
		private static final ExecutorFragment _ParticipantImpactFunction__OclAny = new ExecutorFragment(Types._ParticipantImpactFunction, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ParticipantImpactFunction__OclElement = new ExecutorFragment(Types._ParticipantImpactFunction, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _ParticipantImpactFunction__ParticipantImpactFunction = new ExecutorFragment(Types._ParticipantImpactFunction, MetamodelTables.Types._ParticipantImpactFunction);

		private static final ExecutorFragment _ParticipantRange__NamedElement = new ExecutorFragment(Types._ParticipantRange, MetamodelTables.Types._NamedElement);
		private static final ExecutorFragment _ParticipantRange__OclAny = new ExecutorFragment(Types._ParticipantRange, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ParticipantRange__OclElement = new ExecutorFragment(Types._ParticipantRange, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _ParticipantRange__ParticipantRange = new ExecutorFragment(Types._ParticipantRange, MetamodelTables.Types._ParticipantRange);

		private static final ExecutorFragment _ParticipantRelativeImpact__OclAny = new ExecutorFragment(Types._ParticipantRelativeImpact, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ParticipantRelativeImpact__OclElement = new ExecutorFragment(Types._ParticipantRelativeImpact, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _ParticipantRelativeImpact__ParticipantRelativeImpact = new ExecutorFragment(Types._ParticipantRelativeImpact, MetamodelTables.Types._ParticipantRelativeImpact);

		private static final ExecutorFragment _RangeValue__OclAny = new ExecutorFragment(Types._RangeValue, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _RangeValue__OclElement = new ExecutorFragment(Types._RangeValue, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _RangeValue__RangeValue = new ExecutorFragment(Types._RangeValue, MetamodelTables.Types._RangeValue);
		private static final ExecutorFragment _RangeValue__ValueSpec = new ExecutorFragment(Types._RangeValue, MetamodelTables.Types._ValueSpec);

		private static final ExecutorFragment _SRPInputParticipant__NamedElement = new ExecutorFragment(Types._SRPInputParticipant, MetamodelTables.Types._NamedElement);
		private static final ExecutorFragment _SRPInputParticipant__OclAny = new ExecutorFragment(Types._SRPInputParticipant, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _SRPInputParticipant__OclElement = new ExecutorFragment(Types._SRPInputParticipant, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _SRPInputParticipant__Participant = new ExecutorFragment(Types._SRPInputParticipant, MetamodelTables.Types._Participant);
		private static final ExecutorFragment _SRPInputParticipant__SRPInputParticipant = new ExecutorFragment(Types._SRPInputParticipant, MetamodelTables.Types._SRPInputParticipant);

		private static final ExecutorFragment _SatisfactionCriterion__NamedElement = new ExecutorFragment(Types._SatisfactionCriterion, MetamodelTables.Types._NamedElement);
		private static final ExecutorFragment _SatisfactionCriterion__OclAny = new ExecutorFragment(Types._SatisfactionCriterion, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _SatisfactionCriterion__OclElement = new ExecutorFragment(Types._SatisfactionCriterion, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _SatisfactionCriterion__SatisfactionCriterion = new ExecutorFragment(Types._SatisfactionCriterion, MetamodelTables.Types._SatisfactionCriterion);

		private static final ExecutorFragment _ScalarValue__OclAny = new ExecutorFragment(Types._ScalarValue, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ScalarValue__OclElement = new ExecutorFragment(Types._ScalarValue, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _ScalarValue__ScalarValue = new ExecutorFragment(Types._ScalarValue, MetamodelTables.Types._ScalarValue);
		private static final ExecutorFragment _ScalarValue__ValueSpec = new ExecutorFragment(Types._ScalarValue, MetamodelTables.Types._ValueSpec);

		private static final ExecutorFragment _SystemResponseProperty__NamedElement = new ExecutorFragment(Types._SystemResponseProperty, MetamodelTables.Types._NamedElement);
		private static final ExecutorFragment _SystemResponseProperty__OclAny = new ExecutorFragment(Types._SystemResponseProperty, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _SystemResponseProperty__OclElement = new ExecutorFragment(Types._SystemResponseProperty, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _SystemResponseProperty__SystemResponseProperty = new ExecutorFragment(Types._SystemResponseProperty, MetamodelTables.Types._SystemResponseProperty);

		private static final ExecutorFragment _TrendType__OclAny = new ExecutorFragment(Types._TrendType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _TrendType__OclElement = new ExecutorFragment(Types._TrendType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _TrendType__OclEnumeration = new ExecutorFragment(Types._TrendType, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _TrendType__OclType = new ExecutorFragment(Types._TrendType, OCLstdlibTables.Types._OclType);
		private static final ExecutorFragment _TrendType__TrendType = new ExecutorFragment(Types._TrendType, MetamodelTables.Types._TrendType);

		private static final ExecutorFragment _ValueSpec__OclAny = new ExecutorFragment(Types._ValueSpec, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ValueSpec__OclElement = new ExecutorFragment(Types._ValueSpec, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _ValueSpec__ValueSpec = new ExecutorFragment(Types._ValueSpec, MetamodelTables.Types._ValueSpec);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of MetamodelTables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Parameters {
		static {
			Init.initStart();
			Fragments.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of MetamodelTables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of MetamodelTables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}

		public static final ExecutorProperty _AbstractInfluence__description = new EcoreExecutorProperty(MetamodelPackage.Literals.ABSTRACT_INFLUENCE__DESCRIPTION, Types._AbstractInfluence, 0);
		public static final ExecutorProperty _AbstractInfluence__ownedInfluenceFunction = new EcoreExecutorProperty(MetamodelPackage.Literals.ABSTRACT_INFLUENCE__OWNED_INFLUENCE_FUNCTION, Types._AbstractInfluence, 1);
		public static final ExecutorProperty _AbstractInfluence__CompositeInfluence__internalInfluences = new ExecutorPropertyWithImplementation("CompositeInfluence", Types._AbstractInfluence, 2, new EcoreLibraryOppositeProperty(MetamodelPackage.Literals.COMPOSITE_INFLUENCE__INTERNAL_INFLUENCES));
		public static final ExecutorProperty _AbstractInfluence__InfluenceModel__ownedInfluences = new ExecutorPropertyWithImplementation("InfluenceModel", Types._AbstractInfluence, 3, new EcoreLibraryOppositeProperty(MetamodelPackage.Literals.INFLUENCE_MODEL__OWNED_INFLUENCES));

		public static final ExecutorProperty _AnalyticExpressionFunction__expression = new EcoreExecutorProperty(MetamodelPackage.Literals.ANALYTIC_EXPRESSION_FUNCTION__EXPRESSION, Types._AnalyticExpressionFunction, 0);
		public static final ExecutorProperty _AnalyticExpressionFunction__expressionLanguage = new EcoreExecutorProperty(MetamodelPackage.Literals.ANALYTIC_EXPRESSION_FUNCTION__EXPRESSION_LANGUAGE, Types._AnalyticExpressionFunction, 1);

		public static final ExecutorProperty _ArtifactParticipant__target = new EcoreExecutorProperty(MetamodelPackage.Literals.ARTIFACT_PARTICIPANT__TARGET, Types._ArtifactParticipant, 0);

		public static final ExecutorProperty _CompositeInfluence__internalInfluences = new EcoreExecutorProperty(MetamodelPackage.Literals.COMPOSITE_INFLUENCE__INTERNAL_INFLUENCES, Types._CompositeInfluence, 0);

		public static final ExecutorProperty _DesignArtifact__changeability = new EcoreExecutorProperty(MetamodelPackage.Literals.DESIGN_ARTIFACT__CHANGEABILITY, Types._DesignArtifact, 0);
		public static final ExecutorProperty _DesignArtifact__ref = new EcoreExecutorProperty(MetamodelPackage.Literals.DESIGN_ARTIFACT__REF, Types._DesignArtifact, 1);
		public static final ExecutorProperty _DesignArtifact__ArtifactParticipant__target = new ExecutorPropertyWithImplementation("ArtifactParticipant", Types._DesignArtifact, 2, new EcoreLibraryOppositeProperty(MetamodelPackage.Literals.ARTIFACT_PARTICIPANT__TARGET));
		public static final ExecutorProperty _DesignArtifact__InfluenceModel__ownedArtifacts = new ExecutorPropertyWithImplementation("InfluenceModel", Types._DesignArtifact, 3, new EcoreLibraryOppositeProperty(MetamodelPackage.Literals.INFLUENCE_MODEL__OWNED_ARTIFACTS));

		public static final ExecutorProperty _EnvironmentalFactor__description = new EcoreExecutorProperty(MetamodelPackage.Literals.ENVIRONMENTAL_FACTOR__DESCRIPTION, Types._EnvironmentalFactor, 0);
		public static final ExecutorProperty _EnvironmentalFactor__flexibility = new EcoreExecutorProperty(MetamodelPackage.Literals.ENVIRONMENTAL_FACTOR__FLEXIBILITY, Types._EnvironmentalFactor, 1);
		public static final ExecutorProperty _EnvironmentalFactor__EnvironmentalFactorParticipant__target = new ExecutorPropertyWithImplementation("EnvironmentalFactorParticipant", Types._EnvironmentalFactor, 2, new EcoreLibraryOppositeProperty(MetamodelPackage.Literals.ENVIRONMENTAL_FACTOR_PARTICIPANT__TARGET));
		public static final ExecutorProperty _EnvironmentalFactor__InfluenceModel__ownedEnvironmentalFactors = new ExecutorPropertyWithImplementation("InfluenceModel", Types._EnvironmentalFactor, 3, new EcoreLibraryOppositeProperty(MetamodelPackage.Literals.INFLUENCE_MODEL__OWNED_ENVIRONMENTAL_FACTORS));

		public static final ExecutorProperty _EnvironmentalFactorParticipant__admissibleSpace = new EcoreExecutorProperty(MetamodelPackage.Literals.ENVIRONMENTAL_FACTOR_PARTICIPANT__ADMISSIBLE_SPACE, Types._EnvironmentalFactorParticipant, 0);
		public static final ExecutorProperty _EnvironmentalFactorParticipant__target = new EcoreExecutorProperty(MetamodelPackage.Literals.ENVIRONMENTAL_FACTOR_PARTICIPANT__TARGET, Types._EnvironmentalFactorParticipant, 1);

		public static final ExecutorProperty _FunctionRepresentation__applicabilityDomain = new EcoreExecutorProperty(MetamodelPackage.Literals.FUNCTION_REPRESENTATION__APPLICABILITY_DOMAIN, Types._FunctionRepresentation, 0);
		public static final ExecutorProperty _FunctionRepresentation__confidence = new EcoreExecutorProperty(MetamodelPackage.Literals.FUNCTION_REPRESENTATION__CONFIDENCE, Types._FunctionRepresentation, 1);
		public static final ExecutorProperty _FunctionRepresentation__sourceUri = new EcoreExecutorProperty(MetamodelPackage.Literals.FUNCTION_REPRESENTATION__SOURCE_URI, Types._FunctionRepresentation, 2);
		public static final ExecutorProperty _FunctionRepresentation__InfluenceFunction__representations = new ExecutorPropertyWithImplementation("InfluenceFunction", Types._FunctionRepresentation, 3, new EcoreLibraryOppositeProperty(MetamodelPackage.Literals.INFLUENCE_FUNCTION__REPRESENTATIONS));

		public static final ExecutorProperty _Influence__outputSRP = new EcoreExecutorProperty(MetamodelPackage.Literals.INFLUENCE__OUTPUT_SRP, Types._Influence, 0);
		public static final ExecutorProperty _Influence__ownedParticipants = new EcoreExecutorProperty(MetamodelPackage.Literals.INFLUENCE__OWNED_PARTICIPANTS, Types._Influence, 1);

		public static final ExecutorProperty _InfluenceFunction__representations = new EcoreExecutorProperty(MetamodelPackage.Literals.INFLUENCE_FUNCTION__REPRESENTATIONS, Types._InfluenceFunction, 0);
		public static final ExecutorProperty _InfluenceFunction__AbstractInfluence__ownedInfluenceFunction = new ExecutorPropertyWithImplementation("AbstractInfluence", Types._InfluenceFunction, 1, new EcoreLibraryOppositeProperty(MetamodelPackage.Literals.ABSTRACT_INFLUENCE__OWNED_INFLUENCE_FUNCTION));

		public static final ExecutorProperty _InfluenceModel__ownedArtifacts = new EcoreExecutorProperty(MetamodelPackage.Literals.INFLUENCE_MODEL__OWNED_ARTIFACTS, Types._InfluenceModel, 0);
		public static final ExecutorProperty _InfluenceModel__ownedEnvironmentalFactors = new EcoreExecutorProperty(MetamodelPackage.Literals.INFLUENCE_MODEL__OWNED_ENVIRONMENTAL_FACTORS, Types._InfluenceModel, 1);
		public static final ExecutorProperty _InfluenceModel__ownedInfluences = new EcoreExecutorProperty(MetamodelPackage.Literals.INFLUENCE_MODEL__OWNED_INFLUENCES, Types._InfluenceModel, 2);
		public static final ExecutorProperty _InfluenceModel__ownedSRPs = new EcoreExecutorProperty(MetamodelPackage.Literals.INFLUENCE_MODEL__OWNED_SR_PS, Types._InfluenceModel, 3);
		public static final ExecutorProperty _InfluenceModel__ownedSatisfactionCriteria = new EcoreExecutorProperty(MetamodelPackage.Literals.INFLUENCE_MODEL__OWNED_SATISFACTION_CRITERIA, Types._InfluenceModel, 4);

		public static final ExecutorProperty _MonotonicityRow__condition = new EcoreExecutorProperty(MetamodelPackage.Literals.MONOTONICITY_ROW__CONDITION, Types._MonotonicityRow, 0);
		public static final ExecutorProperty _MonotonicityRow__localSlope = new EcoreExecutorProperty(MetamodelPackage.Literals.MONOTONICITY_ROW__LOCAL_SLOPE, Types._MonotonicityRow, 1);
		public static final ExecutorProperty _MonotonicityRow__nLevels = new EcoreExecutorProperty(MetamodelPackage.Literals.MONOTONICITY_ROW__NLEVELS, Types._MonotonicityRow, 2);
		public static final ExecutorProperty _MonotonicityRow__output = new EcoreExecutorProperty(MetamodelPackage.Literals.MONOTONICITY_ROW__OUTPUT, Types._MonotonicityRow, 3);
		public static final ExecutorProperty _MonotonicityRow__rationale = new EcoreExecutorProperty(MetamodelPackage.Literals.MONOTONICITY_ROW__RATIONALE, Types._MonotonicityRow, 4);
		public static final ExecutorProperty _MonotonicityRow__trend = new EcoreExecutorProperty(MetamodelPackage.Literals.MONOTONICITY_ROW__TREND, Types._MonotonicityRow, 5);
		public static final ExecutorProperty _MonotonicityRow__variedParticipant = new EcoreExecutorProperty(MetamodelPackage.Literals.MONOTONICITY_ROW__VARIED_PARTICIPANT, Types._MonotonicityRow, 6);
		public static final ExecutorProperty _MonotonicityRow__MonotonicityTable__tableRows = new ExecutorPropertyWithImplementation("MonotonicityTable", Types._MonotonicityRow, 7, new EcoreLibraryOppositeProperty(MetamodelPackage.Literals.MONOTONICITY_TABLE__TABLE_ROWS));

		public static final ExecutorProperty _MonotonicityTable__tableRows = new EcoreExecutorProperty(MetamodelPackage.Literals.MONOTONICITY_TABLE__TABLE_ROWS, Types._MonotonicityTable, 0);

		public static final ExecutorProperty _NamedElement__name = new EcoreExecutorProperty(MetamodelPackage.Literals.NAMED_ELEMENT__NAME, Types._NamedElement, 0);

		public static final ExecutorProperty _NaturalLanguageFunction__definition = new EcoreExecutorProperty(MetamodelPackage.Literals.NATURAL_LANGUAGE_FUNCTION__DEFINITION, Types._NaturalLanguageFunction, 0);

		public static final ExecutorProperty _Participant__confidence = new EcoreExecutorProperty(MetamodelPackage.Literals.PARTICIPANT__CONFIDENCE, Types._Participant, 0);
		public static final ExecutorProperty _Participant__Influence__ownedParticipants = new ExecutorPropertyWithImplementation("Influence", Types._Participant, 1, new EcoreLibraryOppositeProperty(MetamodelPackage.Literals.INFLUENCE__OWNED_PARTICIPANTS));
		public static final ExecutorProperty _Participant__MonotonicityRow__variedParticipant = new ExecutorPropertyWithImplementation("MonotonicityRow", Types._Participant, 2, new EcoreLibraryOppositeProperty(MetamodelPackage.Literals.MONOTONICITY_ROW__VARIED_PARTICIPANT));
		public static final ExecutorProperty _Participant__ParticipantRange__participant = new ExecutorPropertyWithImplementation("ParticipantRange", Types._Participant, 3, new EcoreLibraryOppositeProperty(MetamodelPackage.Literals.PARTICIPANT_RANGE__PARTICIPANT));
		public static final ExecutorProperty _Participant__ParticipantRelativeImpact__participant = new ExecutorPropertyWithImplementation("ParticipantRelativeImpact", Types._Participant, 4, new EcoreLibraryOppositeProperty(MetamodelPackage.Literals.PARTICIPANT_RELATIVE_IMPACT__PARTICIPANT));

		public static final ExecutorProperty _ParticipantImpactFunction__participantContribution = new EcoreExecutorProperty(MetamodelPackage.Literals.PARTICIPANT_IMPACT_FUNCTION__PARTICIPANT_CONTRIBUTION, Types._ParticipantImpactFunction, 0);

		public static final ExecutorProperty _ParticipantRange__participant = new EcoreExecutorProperty(MetamodelPackage.Literals.PARTICIPANT_RANGE__PARTICIPANT, Types._ParticipantRange, 0);
		public static final ExecutorProperty _ParticipantRange__value = new EcoreExecutorProperty(MetamodelPackage.Literals.PARTICIPANT_RANGE__VALUE, Types._ParticipantRange, 1);
		public static final ExecutorProperty _ParticipantRange__FunctionRepresentation__applicabilityDomain = new ExecutorPropertyWithImplementation("FunctionRepresentation", Types._ParticipantRange, 2, new EcoreLibraryOppositeProperty(MetamodelPackage.Literals.FUNCTION_REPRESENTATION__APPLICABILITY_DOMAIN));
		public static final ExecutorProperty _ParticipantRange__MonotonicityRow__condition = new ExecutorPropertyWithImplementation("MonotonicityRow", Types._ParticipantRange, 3, new EcoreLibraryOppositeProperty(MetamodelPackage.Literals.MONOTONICITY_ROW__CONDITION));

		public static final ExecutorProperty _ParticipantRelativeImpact__direction = new EcoreExecutorProperty(MetamodelPackage.Literals.PARTICIPANT_RELATIVE_IMPACT__DIRECTION, Types._ParticipantRelativeImpact, 0);
		public static final ExecutorProperty _ParticipantRelativeImpact__importance = new EcoreExecutorProperty(MetamodelPackage.Literals.PARTICIPANT_RELATIVE_IMPACT__IMPORTANCE, Types._ParticipantRelativeImpact, 1);
		public static final ExecutorProperty _ParticipantRelativeImpact__participant = new EcoreExecutorProperty(MetamodelPackage.Literals.PARTICIPANT_RELATIVE_IMPACT__PARTICIPANT, Types._ParticipantRelativeImpact, 2);
		public static final ExecutorProperty _ParticipantRelativeImpact__rationale = new EcoreExecutorProperty(MetamodelPackage.Literals.PARTICIPANT_RELATIVE_IMPACT__RATIONALE, Types._ParticipantRelativeImpact, 3);
		public static final ExecutorProperty _ParticipantRelativeImpact__ParticipantImpactFunction__participantContribution = new ExecutorPropertyWithImplementation("ParticipantImpactFunction", Types._ParticipantRelativeImpact, 4, new EcoreLibraryOppositeProperty(MetamodelPackage.Literals.PARTICIPANT_IMPACT_FUNCTION__PARTICIPANT_CONTRIBUTION));

		public static final ExecutorProperty _RangeValue__inclusiveLower = new EcoreExecutorProperty(MetamodelPackage.Literals.RANGE_VALUE__INCLUSIVE_LOWER, Types._RangeValue, 0);
		public static final ExecutorProperty _RangeValue__inclusiveUpper = new EcoreExecutorProperty(MetamodelPackage.Literals.RANGE_VALUE__INCLUSIVE_UPPER, Types._RangeValue, 1);
		public static final ExecutorProperty _RangeValue__lower = new EcoreExecutorProperty(MetamodelPackage.Literals.RANGE_VALUE__LOWER, Types._RangeValue, 2);
		public static final ExecutorProperty _RangeValue__nominal = new EcoreExecutorProperty(MetamodelPackage.Literals.RANGE_VALUE__NOMINAL, Types._RangeValue, 3);
		public static final ExecutorProperty _RangeValue__step = new EcoreExecutorProperty(MetamodelPackage.Literals.RANGE_VALUE__STEP, Types._RangeValue, 4);
		public static final ExecutorProperty _RangeValue__upper = new EcoreExecutorProperty(MetamodelPackage.Literals.RANGE_VALUE__UPPER, Types._RangeValue, 5);

		public static final ExecutorProperty _SRPInputParticipant__target = new EcoreExecutorProperty(MetamodelPackage.Literals.SRP_INPUT_PARTICIPANT__TARGET, Types._SRPInputParticipant, 0);

		public static final ExecutorProperty _SatisfactionCriterion__constrainedSRPs = new EcoreExecutorProperty(MetamodelPackage.Literals.SATISFACTION_CRITERION__CONSTRAINED_SR_PS, Types._SatisfactionCriterion, 0);
		public static final ExecutorProperty _SatisfactionCriterion__criterionDefinition = new EcoreExecutorProperty(MetamodelPackage.Literals.SATISFACTION_CRITERION__CRITERION_DEFINITION, Types._SatisfactionCriterion, 1);
		public static final ExecutorProperty _SatisfactionCriterion__language = new EcoreExecutorProperty(MetamodelPackage.Literals.SATISFACTION_CRITERION__LANGUAGE, Types._SatisfactionCriterion, 2);
		public static final ExecutorProperty _SatisfactionCriterion__requirementRef = new EcoreExecutorProperty(MetamodelPackage.Literals.SATISFACTION_CRITERION__REQUIREMENT_REF, Types._SatisfactionCriterion, 3);
		public static final ExecutorProperty _SatisfactionCriterion__InfluenceModel__ownedSatisfactionCriteria = new ExecutorPropertyWithImplementation("InfluenceModel", Types._SatisfactionCriterion, 4, new EcoreLibraryOppositeProperty(MetamodelPackage.Literals.INFLUENCE_MODEL__OWNED_SATISFACTION_CRITERIA));

		public static final ExecutorProperty _ScalarValue__value = new EcoreExecutorProperty(MetamodelPackage.Literals.SCALAR_VALUE__VALUE, Types._ScalarValue, 0);

		public static final ExecutorProperty _SystemResponseProperty__description = new EcoreExecutorProperty(MetamodelPackage.Literals.SYSTEM_RESPONSE_PROPERTY__DESCRIPTION, Types._SystemResponseProperty, 0);
		public static final ExecutorProperty _SystemResponseProperty__Influence__outputSRP = new ExecutorPropertyWithImplementation("Influence", Types._SystemResponseProperty, 1, new EcoreLibraryOppositeProperty(MetamodelPackage.Literals.INFLUENCE__OUTPUT_SRP));
		public static final ExecutorProperty _SystemResponseProperty__InfluenceModel__ownedSRPs = new ExecutorPropertyWithImplementation("InfluenceModel", Types._SystemResponseProperty, 2, new EcoreLibraryOppositeProperty(MetamodelPackage.Literals.INFLUENCE_MODEL__OWNED_SR_PS));
		public static final ExecutorProperty _SystemResponseProperty__MonotonicityRow__output = new ExecutorPropertyWithImplementation("MonotonicityRow", Types._SystemResponseProperty, 3, new EcoreLibraryOppositeProperty(MetamodelPackage.Literals.MONOTONICITY_ROW__OUTPUT));
		public static final ExecutorProperty _SystemResponseProperty__SRPInputParticipant__target = new ExecutorPropertyWithImplementation("SRPInputParticipant", Types._SystemResponseProperty, 4, new EcoreLibraryOppositeProperty(MetamodelPackage.Literals.SRP_INPUT_PARTICIPANT__TARGET));
		public static final ExecutorProperty _SystemResponseProperty__SatisfactionCriterion__constrainedSRPs = new ExecutorPropertyWithImplementation("SatisfactionCriterion", Types._SystemResponseProperty, 5, new EcoreLibraryOppositeProperty(MetamodelPackage.Literals.SATISFACTION_CRITERION__CONSTRAINED_SR_PS));

		public static final ExecutorProperty _ValueSpec__unit = new EcoreExecutorProperty(MetamodelPackage.Literals.VALUE_SPEC__UNIT, Types._ValueSpec, 0);
		public static final ExecutorProperty _ValueSpec__EnvironmentalFactorParticipant__admissibleSpace = new ExecutorPropertyWithImplementation("EnvironmentalFactorParticipant", Types._ValueSpec, 1, new EcoreLibraryOppositeProperty(MetamodelPackage.Literals.ENVIRONMENTAL_FACTOR_PARTICIPANT__ADMISSIBLE_SPACE));
		public static final ExecutorProperty _ValueSpec__ParticipantRange__value = new ExecutorPropertyWithImplementation("ParticipantRange", Types._ValueSpec, 2, new EcoreLibraryOppositeProperty(MetamodelPackage.Literals.PARTICIPANT_RANGE__VALUE));
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of MetamodelTables::Properties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		static {
			Init.initStart();
			Properties.init();
		}

		private static final ExecutorFragment /*@NonNull*/ [] _AbstractInfluence =
			{
				Fragments._AbstractInfluence__OclAny /* 0 */,
				Fragments._AbstractInfluence__OclElement /* 1 */,
				Fragments._AbstractInfluence__NamedElement /* 2 */,
				Fragments._AbstractInfluence__AbstractInfluence /* 3 */
			};
		private static final int /*@NonNull*/ [] __AbstractInfluence = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _AnalyticExpressionFunction =
			{
				Fragments._AnalyticExpressionFunction__OclAny /* 0 */,
				Fragments._AnalyticExpressionFunction__OclElement /* 1 */,
				Fragments._AnalyticExpressionFunction__FunctionRepresentation /* 2 */,
				Fragments._AnalyticExpressionFunction__NamedElement /* 2 */,
				Fragments._AnalyticExpressionFunction__AnalyticExpressionFunction /* 3 */
			};
		private static final int /*@NonNull*/ [] __AnalyticExpressionFunction = { 1,1,2,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ArtifactParticipant =
			{
				Fragments._ArtifactParticipant__OclAny /* 0 */,
				Fragments._ArtifactParticipant__OclElement /* 1 */,
				Fragments._ArtifactParticipant__NamedElement /* 2 */,
				Fragments._ArtifactParticipant__Participant /* 3 */,
				Fragments._ArtifactParticipant__ArtifactParticipant /* 4 */
			};
		private static final int /*@NonNull*/ [] __ArtifactParticipant = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _CompositeInfluence =
			{
				Fragments._CompositeInfluence__OclAny /* 0 */,
				Fragments._CompositeInfluence__OclElement /* 1 */,
				Fragments._CompositeInfluence__NamedElement /* 2 */,
				Fragments._CompositeInfluence__AbstractInfluence /* 3 */,
				Fragments._CompositeInfluence__CompositeInfluence /* 4 */
			};
		private static final int /*@NonNull*/ [] __CompositeInfluence = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _DesignArtifact =
			{
				Fragments._DesignArtifact__OclAny /* 0 */,
				Fragments._DesignArtifact__OclElement /* 1 */,
				Fragments._DesignArtifact__NamedElement /* 2 */,
				Fragments._DesignArtifact__DesignArtifact /* 3 */
			};
		private static final int /*@NonNull*/ [] __DesignArtifact = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _EnvironmentalFactor =
			{
				Fragments._EnvironmentalFactor__OclAny /* 0 */,
				Fragments._EnvironmentalFactor__OclElement /* 1 */,
				Fragments._EnvironmentalFactor__NamedElement /* 2 */,
				Fragments._EnvironmentalFactor__EnvironmentalFactor /* 3 */
			};
		private static final int /*@NonNull*/ [] __EnvironmentalFactor = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _EnvironmentalFactorParticipant =
			{
				Fragments._EnvironmentalFactorParticipant__OclAny /* 0 */,
				Fragments._EnvironmentalFactorParticipant__OclElement /* 1 */,
				Fragments._EnvironmentalFactorParticipant__NamedElement /* 2 */,
				Fragments._EnvironmentalFactorParticipant__Participant /* 3 */,
				Fragments._EnvironmentalFactorParticipant__EnvironmentalFactorParticipant /* 4 */
			};
		private static final int /*@NonNull*/ [] __EnvironmentalFactorParticipant = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _FunctionRepresentation =
			{
				Fragments._FunctionRepresentation__OclAny /* 0 */,
				Fragments._FunctionRepresentation__OclElement /* 1 */,
				Fragments._FunctionRepresentation__FunctionRepresentation /* 2 */
			};
		private static final int /*@NonNull*/ [] __FunctionRepresentation = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Influence =
			{
				Fragments._Influence__OclAny /* 0 */,
				Fragments._Influence__OclElement /* 1 */,
				Fragments._Influence__NamedElement /* 2 */,
				Fragments._Influence__AbstractInfluence /* 3 */,
				Fragments._Influence__Influence /* 4 */
			};
		private static final int /*@NonNull*/ [] __Influence = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _InfluenceFunction =
			{
				Fragments._InfluenceFunction__OclAny /* 0 */,
				Fragments._InfluenceFunction__OclElement /* 1 */,
				Fragments._InfluenceFunction__NamedElement /* 2 */,
				Fragments._InfluenceFunction__InfluenceFunction /* 3 */
			};
		private static final int /*@NonNull*/ [] __InfluenceFunction = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _InfluenceModel =
			{
				Fragments._InfluenceModel__OclAny /* 0 */,
				Fragments._InfluenceModel__OclElement /* 1 */,
				Fragments._InfluenceModel__NamedElement /* 2 */,
				Fragments._InfluenceModel__InfluenceModel /* 3 */
			};
		private static final int /*@NonNull*/ [] __InfluenceModel = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _LanguageType =
			{
				Fragments._LanguageType__OclAny /* 0 */,
				Fragments._LanguageType__OclElement /* 1 */,
				Fragments._LanguageType__OclType /* 2 */,
				Fragments._LanguageType__OclEnumeration /* 3 */,
				Fragments._LanguageType__LanguageType /* 4 */
			};
		private static final int /*@NonNull*/ [] __LanguageType = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _MonotonicityRow =
			{
				Fragments._MonotonicityRow__OclAny /* 0 */,
				Fragments._MonotonicityRow__OclElement /* 1 */,
				Fragments._MonotonicityRow__NamedElement /* 2 */,
				Fragments._MonotonicityRow__MonotonicityRow /* 3 */
			};
		private static final int /*@NonNull*/ [] __MonotonicityRow = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _MonotonicityTable =
			{
				Fragments._MonotonicityTable__OclAny /* 0 */,
				Fragments._MonotonicityTable__OclElement /* 1 */,
				Fragments._MonotonicityTable__FunctionRepresentation /* 2 */,
				Fragments._MonotonicityTable__NamedElement /* 2 */,
				Fragments._MonotonicityTable__MonotonicityTable /* 3 */
			};
		private static final int /*@NonNull*/ [] __MonotonicityTable = { 1,1,2,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _NamedElement =
			{
				Fragments._NamedElement__OclAny /* 0 */,
				Fragments._NamedElement__OclElement /* 1 */,
				Fragments._NamedElement__NamedElement /* 2 */
			};
		private static final int /*@NonNull*/ [] __NamedElement = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _NaturalLanguageFunction =
			{
				Fragments._NaturalLanguageFunction__OclAny /* 0 */,
				Fragments._NaturalLanguageFunction__OclElement /* 1 */,
				Fragments._NaturalLanguageFunction__FunctionRepresentation /* 2 */,
				Fragments._NaturalLanguageFunction__NamedElement /* 2 */,
				Fragments._NaturalLanguageFunction__NaturalLanguageFunction /* 3 */
			};
		private static final int /*@NonNull*/ [] __NaturalLanguageFunction = { 1,1,2,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Participant =
			{
				Fragments._Participant__OclAny /* 0 */,
				Fragments._Participant__OclElement /* 1 */,
				Fragments._Participant__NamedElement /* 2 */,
				Fragments._Participant__Participant /* 3 */
			};
		private static final int /*@NonNull*/ [] __Participant = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ParticipantImpactFunction =
			{
				Fragments._ParticipantImpactFunction__OclAny /* 0 */,
				Fragments._ParticipantImpactFunction__OclElement /* 1 */,
				Fragments._ParticipantImpactFunction__FunctionRepresentation /* 2 */,
				Fragments._ParticipantImpactFunction__NamedElement /* 2 */,
				Fragments._ParticipantImpactFunction__ParticipantImpactFunction /* 3 */
			};
		private static final int /*@NonNull*/ [] __ParticipantImpactFunction = { 1,1,2,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ParticipantRange =
			{
				Fragments._ParticipantRange__OclAny /* 0 */,
				Fragments._ParticipantRange__OclElement /* 1 */,
				Fragments._ParticipantRange__NamedElement /* 2 */,
				Fragments._ParticipantRange__ParticipantRange /* 3 */
			};
		private static final int /*@NonNull*/ [] __ParticipantRange = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ParticipantRelativeImpact =
			{
				Fragments._ParticipantRelativeImpact__OclAny /* 0 */,
				Fragments._ParticipantRelativeImpact__OclElement /* 1 */,
				Fragments._ParticipantRelativeImpact__ParticipantRelativeImpact /* 2 */
			};
		private static final int /*@NonNull*/ [] __ParticipantRelativeImpact = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _RangeValue =
			{
				Fragments._RangeValue__OclAny /* 0 */,
				Fragments._RangeValue__OclElement /* 1 */,
				Fragments._RangeValue__ValueSpec /* 2 */,
				Fragments._RangeValue__RangeValue /* 3 */
			};
		private static final int /*@NonNull*/ [] __RangeValue = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _SRPInputParticipant =
			{
				Fragments._SRPInputParticipant__OclAny /* 0 */,
				Fragments._SRPInputParticipant__OclElement /* 1 */,
				Fragments._SRPInputParticipant__NamedElement /* 2 */,
				Fragments._SRPInputParticipant__Participant /* 3 */,
				Fragments._SRPInputParticipant__SRPInputParticipant /* 4 */
			};
		private static final int /*@NonNull*/ [] __SRPInputParticipant = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _SatisfactionCriterion =
			{
				Fragments._SatisfactionCriterion__OclAny /* 0 */,
				Fragments._SatisfactionCriterion__OclElement /* 1 */,
				Fragments._SatisfactionCriterion__NamedElement /* 2 */,
				Fragments._SatisfactionCriterion__SatisfactionCriterion /* 3 */
			};
		private static final int /*@NonNull*/ [] __SatisfactionCriterion = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ScalarValue =
			{
				Fragments._ScalarValue__OclAny /* 0 */,
				Fragments._ScalarValue__OclElement /* 1 */,
				Fragments._ScalarValue__ValueSpec /* 2 */,
				Fragments._ScalarValue__ScalarValue /* 3 */
			};
		private static final int /*@NonNull*/ [] __ScalarValue = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _SystemResponseProperty =
			{
				Fragments._SystemResponseProperty__OclAny /* 0 */,
				Fragments._SystemResponseProperty__OclElement /* 1 */,
				Fragments._SystemResponseProperty__NamedElement /* 2 */,
				Fragments._SystemResponseProperty__SystemResponseProperty /* 3 */
			};
		private static final int /*@NonNull*/ [] __SystemResponseProperty = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _TrendType =
			{
				Fragments._TrendType__OclAny /* 0 */,
				Fragments._TrendType__OclElement /* 1 */,
				Fragments._TrendType__OclType /* 2 */,
				Fragments._TrendType__OclEnumeration /* 3 */,
				Fragments._TrendType__TrendType /* 4 */
			};
		private static final int /*@NonNull*/ [] __TrendType = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ValueSpec =
			{
				Fragments._ValueSpec__OclAny /* 0 */,
				Fragments._ValueSpec__OclElement /* 1 */,
				Fragments._ValueSpec__ValueSpec /* 2 */
			};
		private static final int /*@NonNull*/ [] __ValueSpec = { 1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._AbstractInfluence.initFragments(_AbstractInfluence, __AbstractInfluence);
			Types._AnalyticExpressionFunction.initFragments(_AnalyticExpressionFunction, __AnalyticExpressionFunction);
			Types._ArtifactParticipant.initFragments(_ArtifactParticipant, __ArtifactParticipant);
			Types._CompositeInfluence.initFragments(_CompositeInfluence, __CompositeInfluence);
			Types._DesignArtifact.initFragments(_DesignArtifact, __DesignArtifact);
			Types._EnvironmentalFactor.initFragments(_EnvironmentalFactor, __EnvironmentalFactor);
			Types._EnvironmentalFactorParticipant.initFragments(_EnvironmentalFactorParticipant, __EnvironmentalFactorParticipant);
			Types._FunctionRepresentation.initFragments(_FunctionRepresentation, __FunctionRepresentation);
			Types._Influence.initFragments(_Influence, __Influence);
			Types._InfluenceFunction.initFragments(_InfluenceFunction, __InfluenceFunction);
			Types._InfluenceModel.initFragments(_InfluenceModel, __InfluenceModel);
			Types._LanguageType.initFragments(_LanguageType, __LanguageType);
			Types._MonotonicityRow.initFragments(_MonotonicityRow, __MonotonicityRow);
			Types._MonotonicityTable.initFragments(_MonotonicityTable, __MonotonicityTable);
			Types._NamedElement.initFragments(_NamedElement, __NamedElement);
			Types._NaturalLanguageFunction.initFragments(_NaturalLanguageFunction, __NaturalLanguageFunction);
			Types._Participant.initFragments(_Participant, __Participant);
			Types._ParticipantImpactFunction.initFragments(_ParticipantImpactFunction, __ParticipantImpactFunction);
			Types._ParticipantRange.initFragments(_ParticipantRange, __ParticipantRange);
			Types._ParticipantRelativeImpact.initFragments(_ParticipantRelativeImpact, __ParticipantRelativeImpact);
			Types._RangeValue.initFragments(_RangeValue, __RangeValue);
			Types._SRPInputParticipant.initFragments(_SRPInputParticipant, __SRPInputParticipant);
			Types._SatisfactionCriterion.initFragments(_SatisfactionCriterion, __SatisfactionCriterion);
			Types._ScalarValue.initFragments(_ScalarValue, __ScalarValue);
			Types._SystemResponseProperty.initFragments(_SystemResponseProperty, __SystemResponseProperty);
			Types._TrendType.initFragments(_TrendType, __TrendType);
			Types._ValueSpec.initFragments(_ValueSpec, __ValueSpec);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of MetamodelTables::TypeFragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		static {
			Init.initStart();
			TypeFragments.init();
		}

		private static final ExecutorOperation /*@NonNull*/ [] _AbstractInfluence__AbstractInfluence = {};
		private static final ExecutorOperation /*@NonNull*/ [] _AbstractInfluence__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _AbstractInfluence__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _AbstractInfluence__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _AnalyticExpressionFunction__AnalyticExpressionFunction = {};
		private static final ExecutorOperation /*@NonNull*/ [] _AnalyticExpressionFunction__FunctionRepresentation = {};
		private static final ExecutorOperation /*@NonNull*/ [] _AnalyticExpressionFunction__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _AnalyticExpressionFunction__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _AnalyticExpressionFunction__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ArtifactParticipant__ArtifactParticipant = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ArtifactParticipant__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ArtifactParticipant__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ArtifactParticipant__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ArtifactParticipant__Participant = {};

		private static final ExecutorOperation /*@NonNull*/ [] _CompositeInfluence__CompositeInfluence = {};
		private static final ExecutorOperation /*@NonNull*/ [] _CompositeInfluence__AbstractInfluence = {};
		private static final ExecutorOperation /*@NonNull*/ [] _CompositeInfluence__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _CompositeInfluence__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _CompositeInfluence__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _DesignArtifact__DesignArtifact = {};
		private static final ExecutorOperation /*@NonNull*/ [] _DesignArtifact__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _DesignArtifact__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _DesignArtifact__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _EnvironmentalFactor__EnvironmentalFactor = {};
		private static final ExecutorOperation /*@NonNull*/ [] _EnvironmentalFactor__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _EnvironmentalFactor__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EnvironmentalFactor__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _EnvironmentalFactorParticipant__EnvironmentalFactorParticipant = {};
		private static final ExecutorOperation /*@NonNull*/ [] _EnvironmentalFactorParticipant__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _EnvironmentalFactorParticipant__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EnvironmentalFactorParticipant__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EnvironmentalFactorParticipant__Participant = {};

		private static final ExecutorOperation /*@NonNull*/ [] _FunctionRepresentation__FunctionRepresentation = {};
		private static final ExecutorOperation /*@NonNull*/ [] _FunctionRepresentation__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _FunctionRepresentation__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Influence__Influence = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Influence__AbstractInfluence = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Influence__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Influence__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Influence__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _InfluenceFunction__InfluenceFunction = {};
		private static final ExecutorOperation /*@NonNull*/ [] _InfluenceFunction__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _InfluenceFunction__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _InfluenceFunction__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _InfluenceModel__InfluenceModel = {};
		private static final ExecutorOperation /*@NonNull*/ [] _InfluenceModel__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _InfluenceModel__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _InfluenceModel__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _LanguageType__LanguageType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _LanguageType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _LanguageType__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _LanguageType__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _LanguageType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _MonotonicityRow__MonotonicityRow = {};
		private static final ExecutorOperation /*@NonNull*/ [] _MonotonicityRow__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _MonotonicityRow__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _MonotonicityRow__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _MonotonicityTable__MonotonicityTable = {};
		private static final ExecutorOperation /*@NonNull*/ [] _MonotonicityTable__FunctionRepresentation = {};
		private static final ExecutorOperation /*@NonNull*/ [] _MonotonicityTable__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _MonotonicityTable__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _MonotonicityTable__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _NamedElement__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _NamedElement__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _NamedElement__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _NaturalLanguageFunction__NaturalLanguageFunction = {};
		private static final ExecutorOperation /*@NonNull*/ [] _NaturalLanguageFunction__FunctionRepresentation = {};
		private static final ExecutorOperation /*@NonNull*/ [] _NaturalLanguageFunction__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _NaturalLanguageFunction__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _NaturalLanguageFunction__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Participant__Participant = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Participant__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Participant__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Participant__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ParticipantImpactFunction__ParticipantImpactFunction = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ParticipantImpactFunction__FunctionRepresentation = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ParticipantImpactFunction__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ParticipantImpactFunction__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ParticipantImpactFunction__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ParticipantRange__ParticipantRange = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ParticipantRange__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ParticipantRange__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ParticipantRange__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ParticipantRelativeImpact__ParticipantRelativeImpact = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ParticipantRelativeImpact__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ParticipantRelativeImpact__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _RangeValue__RangeValue = {};
		private static final ExecutorOperation /*@NonNull*/ [] _RangeValue__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _RangeValue__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _RangeValue__ValueSpec = {};

		private static final ExecutorOperation /*@NonNull*/ [] _SRPInputParticipant__SRPInputParticipant = {};
		private static final ExecutorOperation /*@NonNull*/ [] _SRPInputParticipant__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _SRPInputParticipant__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _SRPInputParticipant__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _SRPInputParticipant__Participant = {};

		private static final ExecutorOperation /*@NonNull*/ [] _SatisfactionCriterion__SatisfactionCriterion = {};
		private static final ExecutorOperation /*@NonNull*/ [] _SatisfactionCriterion__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _SatisfactionCriterion__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _SatisfactionCriterion__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ScalarValue__ScalarValue = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ScalarValue__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ScalarValue__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ScalarValue__ValueSpec = {};

		private static final ExecutorOperation /*@NonNull*/ [] _SystemResponseProperty__SystemResponseProperty = {};
		private static final ExecutorOperation /*@NonNull*/ [] _SystemResponseProperty__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _SystemResponseProperty__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _SystemResponseProperty__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _TrendType__TrendType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _TrendType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _TrendType__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _TrendType__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _TrendType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ValueSpec__ValueSpec = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ValueSpec__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ValueSpec__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._AbstractInfluence__AbstractInfluence.initOperations(_AbstractInfluence__AbstractInfluence);
			Fragments._AbstractInfluence__NamedElement.initOperations(_AbstractInfluence__NamedElement);
			Fragments._AbstractInfluence__OclAny.initOperations(_AbstractInfluence__OclAny);
			Fragments._AbstractInfluence__OclElement.initOperations(_AbstractInfluence__OclElement);

			Fragments._AnalyticExpressionFunction__AnalyticExpressionFunction.initOperations(_AnalyticExpressionFunction__AnalyticExpressionFunction);
			Fragments._AnalyticExpressionFunction__FunctionRepresentation.initOperations(_AnalyticExpressionFunction__FunctionRepresentation);
			Fragments._AnalyticExpressionFunction__NamedElement.initOperations(_AnalyticExpressionFunction__NamedElement);
			Fragments._AnalyticExpressionFunction__OclAny.initOperations(_AnalyticExpressionFunction__OclAny);
			Fragments._AnalyticExpressionFunction__OclElement.initOperations(_AnalyticExpressionFunction__OclElement);

			Fragments._ArtifactParticipant__ArtifactParticipant.initOperations(_ArtifactParticipant__ArtifactParticipant);
			Fragments._ArtifactParticipant__NamedElement.initOperations(_ArtifactParticipant__NamedElement);
			Fragments._ArtifactParticipant__OclAny.initOperations(_ArtifactParticipant__OclAny);
			Fragments._ArtifactParticipant__OclElement.initOperations(_ArtifactParticipant__OclElement);
			Fragments._ArtifactParticipant__Participant.initOperations(_ArtifactParticipant__Participant);

			Fragments._CompositeInfluence__AbstractInfluence.initOperations(_CompositeInfluence__AbstractInfluence);
			Fragments._CompositeInfluence__CompositeInfluence.initOperations(_CompositeInfluence__CompositeInfluence);
			Fragments._CompositeInfluence__NamedElement.initOperations(_CompositeInfluence__NamedElement);
			Fragments._CompositeInfluence__OclAny.initOperations(_CompositeInfluence__OclAny);
			Fragments._CompositeInfluence__OclElement.initOperations(_CompositeInfluence__OclElement);

			Fragments._DesignArtifact__DesignArtifact.initOperations(_DesignArtifact__DesignArtifact);
			Fragments._DesignArtifact__NamedElement.initOperations(_DesignArtifact__NamedElement);
			Fragments._DesignArtifact__OclAny.initOperations(_DesignArtifact__OclAny);
			Fragments._DesignArtifact__OclElement.initOperations(_DesignArtifact__OclElement);

			Fragments._EnvironmentalFactor__EnvironmentalFactor.initOperations(_EnvironmentalFactor__EnvironmentalFactor);
			Fragments._EnvironmentalFactor__NamedElement.initOperations(_EnvironmentalFactor__NamedElement);
			Fragments._EnvironmentalFactor__OclAny.initOperations(_EnvironmentalFactor__OclAny);
			Fragments._EnvironmentalFactor__OclElement.initOperations(_EnvironmentalFactor__OclElement);

			Fragments._EnvironmentalFactorParticipant__EnvironmentalFactorParticipant.initOperations(_EnvironmentalFactorParticipant__EnvironmentalFactorParticipant);
			Fragments._EnvironmentalFactorParticipant__NamedElement.initOperations(_EnvironmentalFactorParticipant__NamedElement);
			Fragments._EnvironmentalFactorParticipant__OclAny.initOperations(_EnvironmentalFactorParticipant__OclAny);
			Fragments._EnvironmentalFactorParticipant__OclElement.initOperations(_EnvironmentalFactorParticipant__OclElement);
			Fragments._EnvironmentalFactorParticipant__Participant.initOperations(_EnvironmentalFactorParticipant__Participant);

			Fragments._FunctionRepresentation__FunctionRepresentation.initOperations(_FunctionRepresentation__FunctionRepresentation);
			Fragments._FunctionRepresentation__OclAny.initOperations(_FunctionRepresentation__OclAny);
			Fragments._FunctionRepresentation__OclElement.initOperations(_FunctionRepresentation__OclElement);

			Fragments._Influence__AbstractInfluence.initOperations(_Influence__AbstractInfluence);
			Fragments._Influence__Influence.initOperations(_Influence__Influence);
			Fragments._Influence__NamedElement.initOperations(_Influence__NamedElement);
			Fragments._Influence__OclAny.initOperations(_Influence__OclAny);
			Fragments._Influence__OclElement.initOperations(_Influence__OclElement);

			Fragments._InfluenceFunction__InfluenceFunction.initOperations(_InfluenceFunction__InfluenceFunction);
			Fragments._InfluenceFunction__NamedElement.initOperations(_InfluenceFunction__NamedElement);
			Fragments._InfluenceFunction__OclAny.initOperations(_InfluenceFunction__OclAny);
			Fragments._InfluenceFunction__OclElement.initOperations(_InfluenceFunction__OclElement);

			Fragments._InfluenceModel__InfluenceModel.initOperations(_InfluenceModel__InfluenceModel);
			Fragments._InfluenceModel__NamedElement.initOperations(_InfluenceModel__NamedElement);
			Fragments._InfluenceModel__OclAny.initOperations(_InfluenceModel__OclAny);
			Fragments._InfluenceModel__OclElement.initOperations(_InfluenceModel__OclElement);

			Fragments._LanguageType__LanguageType.initOperations(_LanguageType__LanguageType);
			Fragments._LanguageType__OclAny.initOperations(_LanguageType__OclAny);
			Fragments._LanguageType__OclElement.initOperations(_LanguageType__OclElement);
			Fragments._LanguageType__OclEnumeration.initOperations(_LanguageType__OclEnumeration);
			Fragments._LanguageType__OclType.initOperations(_LanguageType__OclType);

			Fragments._MonotonicityRow__MonotonicityRow.initOperations(_MonotonicityRow__MonotonicityRow);
			Fragments._MonotonicityRow__NamedElement.initOperations(_MonotonicityRow__NamedElement);
			Fragments._MonotonicityRow__OclAny.initOperations(_MonotonicityRow__OclAny);
			Fragments._MonotonicityRow__OclElement.initOperations(_MonotonicityRow__OclElement);

			Fragments._MonotonicityTable__FunctionRepresentation.initOperations(_MonotonicityTable__FunctionRepresentation);
			Fragments._MonotonicityTable__MonotonicityTable.initOperations(_MonotonicityTable__MonotonicityTable);
			Fragments._MonotonicityTable__NamedElement.initOperations(_MonotonicityTable__NamedElement);
			Fragments._MonotonicityTable__OclAny.initOperations(_MonotonicityTable__OclAny);
			Fragments._MonotonicityTable__OclElement.initOperations(_MonotonicityTable__OclElement);

			Fragments._NamedElement__NamedElement.initOperations(_NamedElement__NamedElement);
			Fragments._NamedElement__OclAny.initOperations(_NamedElement__OclAny);
			Fragments._NamedElement__OclElement.initOperations(_NamedElement__OclElement);

			Fragments._NaturalLanguageFunction__FunctionRepresentation.initOperations(_NaturalLanguageFunction__FunctionRepresentation);
			Fragments._NaturalLanguageFunction__NamedElement.initOperations(_NaturalLanguageFunction__NamedElement);
			Fragments._NaturalLanguageFunction__NaturalLanguageFunction.initOperations(_NaturalLanguageFunction__NaturalLanguageFunction);
			Fragments._NaturalLanguageFunction__OclAny.initOperations(_NaturalLanguageFunction__OclAny);
			Fragments._NaturalLanguageFunction__OclElement.initOperations(_NaturalLanguageFunction__OclElement);

			Fragments._Participant__NamedElement.initOperations(_Participant__NamedElement);
			Fragments._Participant__OclAny.initOperations(_Participant__OclAny);
			Fragments._Participant__OclElement.initOperations(_Participant__OclElement);
			Fragments._Participant__Participant.initOperations(_Participant__Participant);

			Fragments._ParticipantImpactFunction__FunctionRepresentation.initOperations(_ParticipantImpactFunction__FunctionRepresentation);
			Fragments._ParticipantImpactFunction__NamedElement.initOperations(_ParticipantImpactFunction__NamedElement);
			Fragments._ParticipantImpactFunction__OclAny.initOperations(_ParticipantImpactFunction__OclAny);
			Fragments._ParticipantImpactFunction__OclElement.initOperations(_ParticipantImpactFunction__OclElement);
			Fragments._ParticipantImpactFunction__ParticipantImpactFunction.initOperations(_ParticipantImpactFunction__ParticipantImpactFunction);

			Fragments._ParticipantRange__NamedElement.initOperations(_ParticipantRange__NamedElement);
			Fragments._ParticipantRange__OclAny.initOperations(_ParticipantRange__OclAny);
			Fragments._ParticipantRange__OclElement.initOperations(_ParticipantRange__OclElement);
			Fragments._ParticipantRange__ParticipantRange.initOperations(_ParticipantRange__ParticipantRange);

			Fragments._ParticipantRelativeImpact__OclAny.initOperations(_ParticipantRelativeImpact__OclAny);
			Fragments._ParticipantRelativeImpact__OclElement.initOperations(_ParticipantRelativeImpact__OclElement);
			Fragments._ParticipantRelativeImpact__ParticipantRelativeImpact.initOperations(_ParticipantRelativeImpact__ParticipantRelativeImpact);

			Fragments._RangeValue__OclAny.initOperations(_RangeValue__OclAny);
			Fragments._RangeValue__OclElement.initOperations(_RangeValue__OclElement);
			Fragments._RangeValue__RangeValue.initOperations(_RangeValue__RangeValue);
			Fragments._RangeValue__ValueSpec.initOperations(_RangeValue__ValueSpec);

			Fragments._SRPInputParticipant__NamedElement.initOperations(_SRPInputParticipant__NamedElement);
			Fragments._SRPInputParticipant__OclAny.initOperations(_SRPInputParticipant__OclAny);
			Fragments._SRPInputParticipant__OclElement.initOperations(_SRPInputParticipant__OclElement);
			Fragments._SRPInputParticipant__Participant.initOperations(_SRPInputParticipant__Participant);
			Fragments._SRPInputParticipant__SRPInputParticipant.initOperations(_SRPInputParticipant__SRPInputParticipant);

			Fragments._SatisfactionCriterion__NamedElement.initOperations(_SatisfactionCriterion__NamedElement);
			Fragments._SatisfactionCriterion__OclAny.initOperations(_SatisfactionCriterion__OclAny);
			Fragments._SatisfactionCriterion__OclElement.initOperations(_SatisfactionCriterion__OclElement);
			Fragments._SatisfactionCriterion__SatisfactionCriterion.initOperations(_SatisfactionCriterion__SatisfactionCriterion);

			Fragments._ScalarValue__OclAny.initOperations(_ScalarValue__OclAny);
			Fragments._ScalarValue__OclElement.initOperations(_ScalarValue__OclElement);
			Fragments._ScalarValue__ScalarValue.initOperations(_ScalarValue__ScalarValue);
			Fragments._ScalarValue__ValueSpec.initOperations(_ScalarValue__ValueSpec);

			Fragments._SystemResponseProperty__NamedElement.initOperations(_SystemResponseProperty__NamedElement);
			Fragments._SystemResponseProperty__OclAny.initOperations(_SystemResponseProperty__OclAny);
			Fragments._SystemResponseProperty__OclElement.initOperations(_SystemResponseProperty__OclElement);
			Fragments._SystemResponseProperty__SystemResponseProperty.initOperations(_SystemResponseProperty__SystemResponseProperty);

			Fragments._TrendType__OclAny.initOperations(_TrendType__OclAny);
			Fragments._TrendType__OclElement.initOperations(_TrendType__OclElement);
			Fragments._TrendType__OclEnumeration.initOperations(_TrendType__OclEnumeration);
			Fragments._TrendType__OclType.initOperations(_TrendType__OclType);
			Fragments._TrendType__TrendType.initOperations(_TrendType__TrendType);

			Fragments._ValueSpec__OclAny.initOperations(_ValueSpec__OclAny);
			Fragments._ValueSpec__OclElement.initOperations(_ValueSpec__OclElement);
			Fragments._ValueSpec__ValueSpec.initOperations(_ValueSpec__ValueSpec);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of MetamodelTables::FragmentOperations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		static {
			Init.initStart();
			FragmentOperations.init();
		}

		private static final ExecutorProperty /*@NonNull*/ [] _AbstractInfluence = {
			MetamodelTables.Properties._AbstractInfluence__description,
			MetamodelTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			MetamodelTables.Properties._AbstractInfluence__ownedInfluenceFunction
		};

		private static final ExecutorProperty /*@NonNull*/ [] _AnalyticExpressionFunction = {
			MetamodelTables.Properties._FunctionRepresentation__applicabilityDomain,
			MetamodelTables.Properties._FunctionRepresentation__confidence,
			MetamodelTables.Properties._AnalyticExpressionFunction__expression,
			MetamodelTables.Properties._AnalyticExpressionFunction__expressionLanguage,
			MetamodelTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			MetamodelTables.Properties._FunctionRepresentation__sourceUri
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ArtifactParticipant = {
			MetamodelTables.Properties._Participant__confidence,
			MetamodelTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			MetamodelTables.Properties._ArtifactParticipant__target
		};

		private static final ExecutorProperty /*@NonNull*/ [] _CompositeInfluence = {
			MetamodelTables.Properties._AbstractInfluence__description,
			MetamodelTables.Properties._CompositeInfluence__internalInfluences,
			MetamodelTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			MetamodelTables.Properties._AbstractInfluence__ownedInfluenceFunction
		};

		private static final ExecutorProperty /*@NonNull*/ [] _DesignArtifact = {
			MetamodelTables.Properties._DesignArtifact__changeability,
			MetamodelTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			MetamodelTables.Properties._DesignArtifact__ref
		};

		private static final ExecutorProperty /*@NonNull*/ [] _EnvironmentalFactor = {
			MetamodelTables.Properties._EnvironmentalFactor__description,
			MetamodelTables.Properties._EnvironmentalFactor__flexibility,
			MetamodelTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _EnvironmentalFactorParticipant = {
			MetamodelTables.Properties._EnvironmentalFactorParticipant__admissibleSpace,
			MetamodelTables.Properties._Participant__confidence,
			MetamodelTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			MetamodelTables.Properties._EnvironmentalFactorParticipant__target
		};

		private static final ExecutorProperty /*@NonNull*/ [] _FunctionRepresentation = {
			MetamodelTables.Properties._FunctionRepresentation__applicabilityDomain,
			MetamodelTables.Properties._FunctionRepresentation__confidence,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			MetamodelTables.Properties._FunctionRepresentation__sourceUri
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Influence = {
			MetamodelTables.Properties._AbstractInfluence__description,
			MetamodelTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			MetamodelTables.Properties._Influence__outputSRP,
			MetamodelTables.Properties._AbstractInfluence__ownedInfluenceFunction,
			MetamodelTables.Properties._Influence__ownedParticipants
		};

		private static final ExecutorProperty /*@NonNull*/ [] _InfluenceFunction = {
			MetamodelTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			MetamodelTables.Properties._InfluenceFunction__representations
		};

		private static final ExecutorProperty /*@NonNull*/ [] _InfluenceModel = {
			MetamodelTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			MetamodelTables.Properties._InfluenceModel__ownedArtifacts,
			MetamodelTables.Properties._InfluenceModel__ownedEnvironmentalFactors,
			MetamodelTables.Properties._InfluenceModel__ownedInfluences,
			MetamodelTables.Properties._InfluenceModel__ownedSRPs,
			MetamodelTables.Properties._InfluenceModel__ownedSatisfactionCriteria
		};

		private static final ExecutorProperty /*@NonNull*/ [] _LanguageType = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _MonotonicityRow = {
			MetamodelTables.Properties._MonotonicityRow__condition,
			MetamodelTables.Properties._MonotonicityRow__localSlope,
			MetamodelTables.Properties._MonotonicityRow__nLevels,
			MetamodelTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			MetamodelTables.Properties._MonotonicityRow__output,
			MetamodelTables.Properties._MonotonicityRow__rationale,
			MetamodelTables.Properties._MonotonicityRow__trend,
			MetamodelTables.Properties._MonotonicityRow__variedParticipant
		};

		private static final ExecutorProperty /*@NonNull*/ [] _MonotonicityTable = {
			MetamodelTables.Properties._FunctionRepresentation__applicabilityDomain,
			MetamodelTables.Properties._FunctionRepresentation__confidence,
			MetamodelTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			MetamodelTables.Properties._FunctionRepresentation__sourceUri,
			MetamodelTables.Properties._MonotonicityTable__tableRows
		};

		private static final ExecutorProperty /*@NonNull*/ [] _NamedElement = {
			MetamodelTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _NaturalLanguageFunction = {
			MetamodelTables.Properties._FunctionRepresentation__applicabilityDomain,
			MetamodelTables.Properties._FunctionRepresentation__confidence,
			MetamodelTables.Properties._NaturalLanguageFunction__definition,
			MetamodelTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			MetamodelTables.Properties._FunctionRepresentation__sourceUri
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Participant = {
			MetamodelTables.Properties._Participant__confidence,
			MetamodelTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ParticipantImpactFunction = {
			MetamodelTables.Properties._FunctionRepresentation__applicabilityDomain,
			MetamodelTables.Properties._FunctionRepresentation__confidence,
			MetamodelTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			MetamodelTables.Properties._ParticipantImpactFunction__participantContribution,
			MetamodelTables.Properties._FunctionRepresentation__sourceUri
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ParticipantRange = {
			MetamodelTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			MetamodelTables.Properties._ParticipantRange__participant,
			MetamodelTables.Properties._ParticipantRange__value
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ParticipantRelativeImpact = {
			MetamodelTables.Properties._ParticipantRelativeImpact__direction,
			MetamodelTables.Properties._ParticipantRelativeImpact__importance,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			MetamodelTables.Properties._ParticipantRelativeImpact__participant,
			MetamodelTables.Properties._ParticipantRelativeImpact__rationale
		};

		private static final ExecutorProperty /*@NonNull*/ [] _RangeValue = {
			MetamodelTables.Properties._RangeValue__inclusiveLower,
			MetamodelTables.Properties._RangeValue__inclusiveUpper,
			MetamodelTables.Properties._RangeValue__lower,
			MetamodelTables.Properties._RangeValue__nominal,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			MetamodelTables.Properties._RangeValue__step,
			MetamodelTables.Properties._ValueSpec__unit,
			MetamodelTables.Properties._RangeValue__upper
		};

		private static final ExecutorProperty /*@NonNull*/ [] _SRPInputParticipant = {
			MetamodelTables.Properties._Participant__confidence,
			MetamodelTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			MetamodelTables.Properties._SRPInputParticipant__target
		};

		private static final ExecutorProperty /*@NonNull*/ [] _SatisfactionCriterion = {
			MetamodelTables.Properties._SatisfactionCriterion__constrainedSRPs,
			MetamodelTables.Properties._SatisfactionCriterion__criterionDefinition,
			MetamodelTables.Properties._SatisfactionCriterion__language,
			MetamodelTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			MetamodelTables.Properties._SatisfactionCriterion__requirementRef
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ScalarValue = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			MetamodelTables.Properties._ValueSpec__unit,
			MetamodelTables.Properties._ScalarValue__value
		};

		private static final ExecutorProperty /*@NonNull*/ [] _SystemResponseProperty = {
			MetamodelTables.Properties._SystemResponseProperty__description,
			MetamodelTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _TrendType = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ValueSpec = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			MetamodelTables.Properties._ValueSpec__unit
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._AbstractInfluence__AbstractInfluence.initProperties(_AbstractInfluence);
			Fragments._AnalyticExpressionFunction__AnalyticExpressionFunction.initProperties(_AnalyticExpressionFunction);
			Fragments._ArtifactParticipant__ArtifactParticipant.initProperties(_ArtifactParticipant);
			Fragments._CompositeInfluence__CompositeInfluence.initProperties(_CompositeInfluence);
			Fragments._DesignArtifact__DesignArtifact.initProperties(_DesignArtifact);
			Fragments._EnvironmentalFactor__EnvironmentalFactor.initProperties(_EnvironmentalFactor);
			Fragments._EnvironmentalFactorParticipant__EnvironmentalFactorParticipant.initProperties(_EnvironmentalFactorParticipant);
			Fragments._FunctionRepresentation__FunctionRepresentation.initProperties(_FunctionRepresentation);
			Fragments._Influence__Influence.initProperties(_Influence);
			Fragments._InfluenceFunction__InfluenceFunction.initProperties(_InfluenceFunction);
			Fragments._InfluenceModel__InfluenceModel.initProperties(_InfluenceModel);
			Fragments._LanguageType__LanguageType.initProperties(_LanguageType);
			Fragments._MonotonicityRow__MonotonicityRow.initProperties(_MonotonicityRow);
			Fragments._MonotonicityTable__MonotonicityTable.initProperties(_MonotonicityTable);
			Fragments._NamedElement__NamedElement.initProperties(_NamedElement);
			Fragments._NaturalLanguageFunction__NaturalLanguageFunction.initProperties(_NaturalLanguageFunction);
			Fragments._Participant__Participant.initProperties(_Participant);
			Fragments._ParticipantImpactFunction__ParticipantImpactFunction.initProperties(_ParticipantImpactFunction);
			Fragments._ParticipantRange__ParticipantRange.initProperties(_ParticipantRange);
			Fragments._ParticipantRelativeImpact__ParticipantRelativeImpact.initProperties(_ParticipantRelativeImpact);
			Fragments._RangeValue__RangeValue.initProperties(_RangeValue);
			Fragments._SRPInputParticipant__SRPInputParticipant.initProperties(_SRPInputParticipant);
			Fragments._SatisfactionCriterion__SatisfactionCriterion.initProperties(_SatisfactionCriterion);
			Fragments._ScalarValue__ScalarValue.initProperties(_ScalarValue);
			Fragments._SystemResponseProperty__SystemResponseProperty.initProperties(_SystemResponseProperty);
			Fragments._TrendType__TrendType.initProperties(_TrendType);
			Fragments._ValueSpec__ValueSpec.initProperties(_ValueSpec);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of MetamodelTables::FragmentProperties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		static {
			Init.initStart();
			FragmentProperties.init();
		}

		public static final EcoreExecutorEnumerationLiteral _LanguageType__JavaNumericExpression = new EcoreExecutorEnumerationLiteral(MetamodelPackage.Literals.LANGUAGE_TYPE.getEEnumLiteral("JavaNumericExpression"), Types._LanguageType, 0);
		public static final EcoreExecutorEnumerationLiteral _LanguageType__OCL = new EcoreExecutorEnumerationLiteral(MetamodelPackage.Literals.LANGUAGE_TYPE.getEEnumLiteral("OCL"), Types._LanguageType, 1);
		public static final EcoreExecutorEnumerationLiteral _LanguageType__NaturalLanguage = new EcoreExecutorEnumerationLiteral(MetamodelPackage.Literals.LANGUAGE_TYPE.getEEnumLiteral("NaturalLanguage"), Types._LanguageType, 2);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _LanguageType = {
			_LanguageType__JavaNumericExpression,
			_LanguageType__OCL,
			_LanguageType__NaturalLanguage
		};

		public static final EcoreExecutorEnumerationLiteral _TrendType__Increasing = new EcoreExecutorEnumerationLiteral(MetamodelPackage.Literals.TREND_TYPE.getEEnumLiteral("Increasing"), Types._TrendType, 0);
		public static final EcoreExecutorEnumerationLiteral _TrendType__Decreasing = new EcoreExecutorEnumerationLiteral(MetamodelPackage.Literals.TREND_TYPE.getEEnumLiteral("Decreasing"), Types._TrendType, 1);
		public static final EcoreExecutorEnumerationLiteral _TrendType__Flat = new EcoreExecutorEnumerationLiteral(MetamodelPackage.Literals.TREND_TYPE.getEEnumLiteral("Flat"), Types._TrendType, 2);
		public static final EcoreExecutorEnumerationLiteral _TrendType__NotMonotonic = new EcoreExecutorEnumerationLiteral(MetamodelPackage.Literals.TREND_TYPE.getEEnumLiteral("NotMonotonic"), Types._TrendType, 3);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _TrendType = {
			_TrendType__Increasing,
			_TrendType__Decreasing,
			_TrendType__Flat,
			_TrendType__NotMonotonic
		};

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {
			Types._LanguageType.initLiterals(_LanguageType);
			Types._TrendType.initLiterals(_TrendType);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of MetamodelTables::EnumerationLiterals and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 * The multiple packages above avoid problems with the Java 65536 byte limit but introduce a difficulty in ensuring that
	 * static construction occurs in the disciplined order of the packages when construction may start in any of the packages.
	 * The problem is resolved by ensuring that the static construction of each package first initializes its immediate predecessor.
	 * On completion of predecessor initialization, the residual packages are initialized by starting an initialization in the last package.
	 * This class maintains a count so that the various predecessors can distinguish whether they are the starting point and so
	 * ensure that residual construction occurs just once after all predecessors.
	 */
	private static class Init {
		/**
		 * Counter of nested static constructions. On return to zero residual construction starts. -ve once residual construction started.
		 */
		private static int initCount = 0;

		/**
		 * Invoked at the start of a static construction to defer residual construction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual construction once primary constructions complete.
		 */
		private static void initEnd() {
			if (initCount > 0) {
				if (--initCount == 0) {
					initCount = -1;
					EnumerationLiterals.init();
				}
			}
		}
	}

	static {
		Init.initEnd();
	}

	/*
	 * Force initialization of outer fields. Inner fields are lazily initialized.
	 */
	public static void init() {
		new MetamodelTables();
	}

	private MetamodelTables() {
		super(MetamodelPackage.eNS_URI);
	}
}
