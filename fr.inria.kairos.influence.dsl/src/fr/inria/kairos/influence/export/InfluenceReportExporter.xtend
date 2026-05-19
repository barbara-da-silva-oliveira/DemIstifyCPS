package fr.inria.kairos.influence.export

import fr.inria.kairos.influence.metamodel.AnalyticExpressionFunction
import fr.inria.kairos.influence.metamodel.ArtifactParticipant
import fr.inria.kairos.influence.metamodel.EnvironmentalFactorParticipant
import fr.inria.kairos.influence.metamodel.Influence
import fr.inria.kairos.influence.metamodel.InfluenceModel
import fr.inria.kairos.influence.metamodel.MonotonicityTable
import fr.inria.kairos.influence.metamodel.NaturalLanguageFunction
import fr.inria.kairos.influence.metamodel.ParticipantImpactFunction
import fr.inria.kairos.influence.metamodel.SRPInputParticipant
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2

class InfluenceReportExporter {

	def void export(Resource resource, IFileSystemAccess2 fsa, String outPath) {
		val model = resource.contents.head as InfluenceModel
		val sb = new StringBuilder("Influence Knowledge Report\n\n")

		for (inf : model.ownedInfluences.filter(Influence)) {
			appendInfluence(model, inf, sb)
		}

		fsa.generateFile(outPath, sb.toString)
	}

	private def void appendInfluence(InfluenceModel model, Influence inf, StringBuilder sb) {
		sb.append("## ").append(inf.name).append("\n")

		if (inf.outputSRP !== null) {
			sb.append("Output SRP: ").append(inf.outputSRP.name).append("\n")
		}

		sb.append("Participants:\n")

		for (p : inf.ownedParticipants) {
			switch p {
				ArtifactParticipant: {
					sb.append(" - ArtifactParticipant ")
						.append(p.name)
						.append(" -> ")
						.append(p.target?.name)
						.append("\n")
				}
				EnvironmentalFactorParticipant: {
					sb.append(" - EnvironmentalFactorParticipant ")
						.append(p.name)
						.append(" -> ")
						.append(p.target?.name)

					if (p.admissibleSpace !== null) {
						sb.append(" admissibleSpace=")
							.append(ValueSpecPrinter.label(p.admissibleSpace))
					}

					sb.append("\n")
				}
				SRPInputParticipant: {
					sb.append(" - SRPInputParticipant ")
						.append(p.name)
						.append(" -> ")
						.append(p.target?.name)
						.append("\n")
				}
			}
		}

		appendFunctionRepresentations(inf, sb)
		sb.append("\n")
	}

	private def void appendFunctionRepresentations(Influence inf, StringBuilder sb) {
		val fn = inf.ownedInfluenceFunction

		if (fn === null || fn.representations.empty) {
			sb.append("No function representations.\n")
			return
		}

		sb.append("Function representations:\n")

		for (rep : fn.representations) {
			switch rep {
				NaturalLanguageFunction: {
					sb.append(" - NaturalLanguageFunction: ")
						.append(rep.definition)
						.append("\n")
				}

				ParticipantImpactFunction: {
					sb.append(" - ParticipantImpactFunction\n")

					for (impact : rep.participantContribution) {
						sb.append("    ")
							.append(impact.participant?.name)
							.append(" importance=")
							.append(impact.importance)

						if (impact.direction !== null) {
							sb.append(" direction=").append(impact.direction)
						}

						if (impact.rationale !== null) {
							sb.append(" rationale=").append(impact.rationale)
						}

						sb.append("\n")
					}
				}

				AnalyticExpressionFunction: {
					sb.append(" - AnalyticExpressionFunction: ")
						.append(rep.expression)
						.append(" [")
						.append(rep.expressionLanguage)
						.append("]\n")
				}

				MonotonicityTable: {
					sb.append(" - MonotonicityTable\n")

					for (row : rep.tableRows) {
						sb.append("    varied=")
							.append(row.variedParticipant?.name)
							.append(" trend=")
							.append(row.trend)

						if (row.output !== null) {
							sb.append(" output=").append(row.output.name)
						}

						sb.append("\n")
					}
				}

				default: {
					sb.append(" - ").append(rep.eClass.name).append("\n")
				}
			}
		}
	}
}