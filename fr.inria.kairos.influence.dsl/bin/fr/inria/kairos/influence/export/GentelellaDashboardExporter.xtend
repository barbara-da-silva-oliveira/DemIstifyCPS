package fr.inria.kairos.influence.export

import org.eclipse.xtext.generator.IFileSystemAccess2

class GentelellaDashboardExporter {

	def void export(IFileSystemAccess2 fsa, String basePath) {
		val base = normalizeBasePath(basePath)

		fsa.generateFile(base + "/index.html", page("Influence Dashboard", "overview"))
		fsa.generateFile(base + "/influences.html", page("Influences", "influences"))
		fsa.generateFile(base + "/requirements.html", page("Requirements", "requirements"))
		fsa.generateFile(base + "/developers.html", page("Developer Views", "developers"))
		fsa.generateFile(base + "/tradeoffs.html", page("Trade-offs", "tradeoffs"))
		fsa.generateFile(base + "/graph.html", page("Influence Graph", "graph"))

		fsa.generateFile(base + "/assets/influence-dashboard.css", css())
		fsa.generateFile(base + "/assets/influence-dashboard.js", javascript())	}

	private def String normalizeBasePath(String basePath) {
		if (basePath === null || basePath.trim.empty) {
			return "dashboard/site"
		}

		if (basePath.endsWith("/")) {
			return basePath.substring(0, basePath.length - 1)
		}

		return basePath
	}

	private def String page(String title, String activePage) '''
		<!doctype html>
		<html lang="en">
		<head>
		  <meta charset="utf-8">
		  <meta name="viewport" content="width=device-width, initial-scale=1">
		  <title>«title»</title>

		  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
		  <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.css" rel="stylesheet">
		  <link href="assets/influence-dashboard.css" rel="stylesheet">
		</head>

		<body data-page="«activePage»">
		  <div class="app-shell">

		    <aside class="sidebar">
		      <div class="brand">
		        <div class="brand-icon">
		          <i class="bi bi-diagram-3"></i>
		        </div>
		        <div>
		          <div class="brand-title">Influence DSL</div>
		          <div class="brand-subtitle">analysis dashboard</div>
		        </div>
		      </div>

		      <nav class="nav flex-column sidebar-nav">
		        <a class="nav-link" data-nav="overview" href="index.html">
		          <i class="bi bi-speedometer2"></i>
		          Overview
		        </a>
		        <a class="nav-link" data-nav="influences" href="influences.html">
		          <i class="bi bi-share"></i>
		          Influences
		        </a>
		        <a class="nav-link" data-nav="requirements" href="requirements.html">
		          <i class="bi bi-check2-square"></i>
		          Requirements
		        </a>
		        <a class="nav-link" data-nav="developers" href="developers.html">
		          <i class="bi bi-person-workspace"></i>
		          Developer Views
		        </a>
		        <a class="nav-link" data-nav="tradeoffs" href="tradeoffs.html">
		          <i class="bi bi-exclamation-triangle"></i>
		          Trade-offs
		        </a>
		        <a class="nav-link" data-nav="graph" href="graph.html">
		          <i class="bi bi-node-plus"></i>
		          Graph
		        </a>
		      </nav>
		    </aside>

		    <main class="main-content">
		      <header class="topbar">
		        <div>
		          <h1 id="page-title">«title»</h1>
		          <p id="page-subtitle">Generated from Influence DSL analysis results.</p>
		        </div>
		        <div class="status-pill">
		          <span class="status-dot"></span>
		          Static report
		        </div>
		      </header>

		      <section id="dashboard-root">
		        <div class="loading-card">
		          <div class="spinner-border text-primary" role="status"></div>
		          <p>Loading dashboard data...</p>
		        </div>
		      </section>
		    </main>
		  </div>

		  <script src="https://cdn.jsdelivr.net/npm/chart.js@4.4.1/dist/chart.umd.min.js"></script>
		  <script src="assets/influence-dashboard.js"></script>
		</body>
		</html>
	'''

	private def String css() '''
		:root {
		  --sidebar-bg: #263238;
		  --sidebar-bg-2: #1f2a30;
		  --sidebar-text: #d9e3e7;
		  --sidebar-muted: #8fa3ad;
		  --accent: #26b99a;
		  --main-bg: #f5f7fa;
		  --card-bg: #ffffff;
		  --text-main: #263238;
		  --text-muted: #6c757d;
		  --border: #e3e8ee;
		}

		* {
		  box-sizing: border-box;
		}

		body {
		  margin: 0;
		  background: var(--main-bg);
		  color: var(--text-main);
		  font-family: system-ui, -apple-system, BlinkMacSystemFont, "Segoe UI", sans-serif;
		}

		.app-shell {
		  display: flex;
		  min-height: 100vh;
		}

		.sidebar {
		  width: 280px;
		  background: linear-gradient(180deg, var(--sidebar-bg), var(--sidebar-bg-2));
		  color: var(--sidebar-text);
		  padding: 22px 18px;
		  position: fixed;
		  top: 0;
		  bottom: 0;
		  left: 0;
		  overflow-y: auto;
		}

		.brand {
		  display: flex;
		  gap: 12px;
		  align-items: center;
		  margin-bottom: 28px;
		  padding-bottom: 20px;
		  border-bottom: 1px solid rgba(255, 255, 255, 0.1);
		}

		.brand-icon {
		  width: 44px;
		  height: 44px;
		  border-radius: 12px;
		  background: var(--accent);
		  display: flex;
		  align-items: center;
		  justify-content: center;
		  font-size: 22px;
		  color: white;
		}

		.brand-title {
		  font-weight: 700;
		  font-size: 18px;
		}

		.brand-subtitle {
		  color: var(--sidebar-muted);
		  font-size: 12px;
		  text-transform: uppercase;
		  letter-spacing: 0.06em;
		}

		.sidebar-nav {
		  gap: 6px;
		}

		.sidebar-nav .nav-link {
		  color: var(--sidebar-text);
		  border-radius: 10px;
		  padding: 11px 12px;
		  display: flex;
		  gap: 10px;
		  align-items: center;
		}

		.sidebar-nav .nav-link:hover,
		.sidebar-nav .nav-link.active {
		  background: rgba(255, 255, 255, 0.1);
		  color: #ffffff;
		}

		.sidebar-nav .nav-link.active {
		  border-left: 4px solid var(--accent);
		}

		.main-content {
		  margin-left: 280px;
		  padding: 28px;
		  width: calc(100% - 280px);
		}

		.topbar {
		  display: flex;
		  justify-content: space-between;
		  align-items: center;
		  margin-bottom: 24px;
		}

		.topbar h1 {
		  margin: 0;
		  font-size: 28px;
		  font-weight: 700;
		}

		.topbar p {
		  margin: 6px 0 0;
		  color: var(--text-muted);
		}

		.status-pill {
		  background: white;
		  border: 1px solid var(--border);
		  border-radius: 999px;
		  padding: 8px 14px;
		  font-size: 13px;
		  color: var(--text-muted);
		  display: flex;
		  align-items: center;
		  gap: 8px;
		}

		.status-dot {
		  width: 8px;
		  height: 8px;
		  border-radius: 999px;
		  background: var(--accent);
		}

		.card-box {
		  background: var(--card-bg);
		  border: 1px solid var(--border);
		  border-radius: 16px;
		  padding: 20px;
		  box-shadow: 0 8px 24px rgba(20, 35, 50, 0.05);
		}

		.metric-card {
		  background: var(--card-bg);
		  border: 1px solid var(--border);
		  border-radius: 16px;
		  padding: 18px;
		  box-shadow: 0 8px 24px rgba(20, 35, 50, 0.05);
		}

		.metric-label {
		  color: var(--text-muted);
		  font-size: 13px;
		  text-transform: uppercase;
		  letter-spacing: 0.06em;
		}

		.metric-value {
		  font-size: 30px;
		  font-weight: 750;
		  margin-top: 8px;
		}

		.table {
		  margin-bottom: 0;
		}

		.table thead th {
		  color: var(--text-muted);
		  font-size: 12px;
		  text-transform: uppercase;
		  letter-spacing: 0.05em;
		}

		.badge-soft {
		  border-radius: 999px;
		  padding: 5px 9px;
		  font-weight: 600;
		  background: #eef8f5;
		  color: #12856d;
		}

		.badge-warning-soft {
		  background: #fff6e5;
		  color: #9a6500;
		}

		.badge-danger-soft {
		  background: #fdecec;
		  color: #a73838;
		}

		.loading-card {
		  background: white;
		  border: 1px solid var(--border);
		  border-radius: 16px;
		  padding: 40px;
		  text-align: center;
		  color: var(--text-muted);
		}

		.graph-list {
		  max-height: 700px;
		  overflow: auto;
		}

		code {
		  color: #c7254e;
		}
	'''

	private def String javascript() '''
		const DATA_PATH = "../data/dashboard-data.json";
		const GRAPH_PATH = "../data/graph.json";

		document.addEventListener("DOMContentLoaded", () => {
		  const page = document.body.dataset.page || "overview";
		  activateNav(page);

		  loadData()
		    .then(({ data, graph }) => renderPage(page, data, graph))
		    .catch(error => renderError(error));
		});

		function activateNav(page) {
		  document.querySelectorAll("[data-nav]").forEach(link => {
		    if (link.dataset.nav === page) {
		      link.classList.add("active");
		    }
		  });
		}

		async function loadData() {
		  const dataResponse = await fetch(DATA_PATH);
		  if (!dataResponse.ok) {
		    throw new Error("Could not load " + DATA_PATH);
		  }

		  const data = await dataResponse.json();

		  let graph = null;
		  try {
		    const graphResponse = await fetch(GRAPH_PATH);
		    if (graphResponse.ok) {
		      graph = await graphResponse.json();
		    }
		  } catch (error) {
		    graph = null;
		  }

		  return { data, graph };
		}

		function renderPage(page, data, graph) {
		  if (page === "overview") {
		    renderOverview(data);
		  } else if (page === "influences") {
		    renderInfluences(data);
		  } else if (page === "requirements") {
		    renderRequirements(data);
		  } else if (page === "developers") {
		    renderDevelopers(data);
		  } else if (page === "tradeoffs") {
		    renderTradeoffs(data);
		  } else if (page === "graph") {
		    renderGraph(graph);
		  } else {
		    renderOverview(data);
		  }
		}

		function renderOverview(data) {
		  const root = rootElement();
		  const counts = data.model?.counts || {};

		  root.innerHTML = `
		    <div class="row g-3 mb-4">
		      ${metricCard("Artifacts", counts.artifacts)}
		      ${metricCard("Environmental Factors", counts.environmentalFactors)}
		      ${metricCard("SRPs", counts.systemResponseProperties)}
		      ${metricCard("Satisfaction Criteria", counts.satisfactionCriteria)}
		      ${metricCard("Influences", counts.influences)}
		      ${metricCard("Analytic Influences", counts.analyticInfluences)}
		    </div>

		    <div class="row g-4">
		      <div class="col-lg-6">
		        <div class="card-box">
		          <h5>Artifact propagated impact</h5>
		          <canvas id="artifactImpactChart" height="220"></canvas>
		        </div>
		      </div>
		      <div class="col-lg-6">
		        <div class="card-box">
		          <h5>Environmental factor propagated impact</h5>
		          <canvas id="factorImpactChart" height="220"></canvas>
		        </div>
		      </div>
		    </div>
		  `;

		  renderBarChart(
		    "artifactImpactChart",
		    data.metrics?.impactArtifactsPropagatedWeighted || data.metrics?.impactArtifactsPropagated || {}
		  );

		  renderBarChart(
		    "factorImpactChart",
		    data.metrics?.impactEnvironmentalFactorsPropagatedWeighted || data.metrics?.impactEnvironmentalFactorsPropagated || {}
		  );
		}

		function renderInfluences(data) {
		  const rows = (data.influences || []).map(inf => {
		    const participantNames = (inf.participants || []).map(p => p.name).join(", ");
		    const functionTypes = ((inf.function || {}).representations || []).map(r => r.type).join(", ");
		    const requirements = (inf.linkedRequirements || []).join(", ");

		    return `
		      <tr>
		        <td><strong>${escapeHtml(inf.name)}</strong></td>
		        <td>${escapeHtml(inf.outputSRP)}</td>
		        <td>${escapeHtml(participantNames)}</td>
		        <td>${escapeHtml(functionTypes)}</td>
		        <td>${escapeHtml(requirements)}</td>
		      </tr>
		    `;
		  }).join("");

		  rootElement().innerHTML = `
		    <div class="card-box">
		      <h5 class="mb-3">Influence list</h5>
		      <div class="table-responsive">
		        <table class="table table-hover align-middle">
		          <thead>
		            <tr>
		              <th>Influence</th>
		              <th>Output SRP</th>
		              <th>Participants</th>
		              <th>Function representations</th>
		              <th>Linked requirements</th>
		            </tr>
		          </thead>
		          <tbody>${rows}</tbody>
		        </table>
		      </div>
		    </div>
		  `;
		}

		function renderRequirements(data) {
		  const rows = (data.satisfactionCriteria || []).map(c => {
		    return `
		      <tr>
		        <td><strong>${escapeHtml(c.requirement)}</strong></td>
		        <td>${escapeHtml(c.name)}</td>
		        <td>${escapeHtml((c.constrainedSRPs || []).join(", "))}</td>
		        <td><code>${escapeHtml(c.marginDefinition)}</code></td>
		        <td><span class="badge-soft">${escapeHtml(c.language)}</span></td>
		      </tr>
		    `;
		  }).join("");

		  rootElement().innerHTML = `
		    <div class="card-box">
		      <h5 class="mb-3">Requirements and satisfaction criteria</h5>
		      <div class="table-responsive">
		        <table class="table table-hover align-middle">
		          <thead>
		            <tr>
		              <th>Requirement</th>
		              <th>Criterion</th>
		              <th>Constrained SRPs</th>
		              <th>Margin definition</th>
		              <th>Language</th>
		            </tr>
		          </thead>
		          <tbody>${rows}</tbody>
		        </table>
		      </div>
		    </div>
		  `;
		}

		function renderDevelopers(data) {
		  const cards = (data.developerViews || []).map(view => {
		    return `
		      <div class="col-lg-6">
		        <div class="card-box h-100">
		          <h5>${escapeHtml(view.displayName || view.id)}</h5>
		          <p class="text-muted mb-3">Developer or subsystem-specific impact view.</p>

		          ${listBlock("Owned artifacts", view.ownedArtifacts)}
		          ${listBlock("Influences", view.influences)}
		          ${listBlock("System response properties", view.systemResponseProperties)}
		          ${listBlock("Requirements", view.requirements)}
		        </div>
		      </div>
		    `;
		  }).join("");

		  rootElement().innerHTML = `
		    <div class="row g-4">
		      ${cards || emptyState("No developer views were generated.")}
		    </div>
		  `;
		}

		function renderTradeoffs(data) {
		  const variables = collectTradeoffCandidates(data);
		  const rows = variables.map(v => {
		    const status = v.hasConflict
		      ? `<span class="badge-soft badge-danger-soft">Trade-off</span>`
		      : `<span class="badge-soft">No conflict</span>`;

		    return `
		      <tr>
		        <td><strong>${escapeHtml(v.variable)}</strong></td>
		        <td>${escapeHtml(Array.from(v.benefits).join(", "))}</td>
		        <td>${escapeHtml(Array.from(v.prejudices).join(", "))}</td>
		        <td>${status}</td>
		      </tr>
		    `;
		  }).join("");

		  rootElement().innerHTML = `
		    <div class="card-box">
		      <h5 class="mb-3">Cross-requirement trade-off candidates</h5>
		      <p class="text-muted">
		        This first version uses generated dashboard data. Later we can connect it directly
		        to analytic sensitivity results.
		      </p>
		      <div class="table-responsive">
		        <table class="table table-hover align-middle">
		          <thead>
		            <tr>
		              <th>Variable</th>
		              <th>Benefits</th>
		              <th>Prejudices</th>
		              <th>Status</th>
		            </tr>
		          </thead>
		          <tbody>${rows || `<tr><td colspan="4">No trade-off candidates available.</td></tr>`}</tbody>
		        </table>
		      </div>
		    </div>
		  `;
		}

		function renderGraph(graph) {
		  if (!graph) {
		    rootElement().innerHTML = emptyState("No graph data available.");
		    return;
		  }

		  const nodeRows = (graph.nodes || []).map(n => `
		    <tr>
		      <td><strong>${escapeHtml(n.id)}</strong></td>
		      <td>${escapeHtml(n.label)}</td>
		      <td><span class="badge-soft">${escapeHtml(n.type)}</span></td>
		      <td>${escapeHtml(n.sourceModel || "")}</td>
		    </tr>
		  `).join("");

		  const edgeRows = (graph.edges || []).map(e => `
		    <tr>
		      <td>${escapeHtml(e.source)}</td>
		      <td>${escapeHtml(e.target)}</td>
		      <td>${escapeHtml(e.label || "")}</td>
		      <td>${escapeHtml(e.weight)}</td>
		    </tr>
		  `).join("");

		  rootElement().innerHTML = `
		    <div class="row g-4">
		      <div class="col-lg-6">
		        <div class="card-box graph-list">
		          <h5 class="mb-3">Nodes</h5>
		          <table class="table table-hover align-middle">
		            <thead>
		              <tr>
		                <th>ID</th>
		                <th>Label</th>
		                <th>Type</th>
		                <th>Source model</th>
		              </tr>
		            </thead>
		            <tbody>${nodeRows}</tbody>
		          </table>
		        </div>
		      </div>

		      <div class="col-lg-6">
		        <div class="card-box graph-list">
		          <h5 class="mb-3">Edges</h5>
		          <table class="table table-hover align-middle">
		            <thead>
		              <tr>
		                <th>Source</th>
		                <th>Target</th>
		                <th>Label</th>
		                <th>Weight</th>
		              </tr>
		            </thead>
		            <tbody>${edgeRows}</tbody>
		          </table>
		        </div>
		      </div>
		    </div>
		  `;
		}

		function metricCard(label, value) {
		  return `
		    <div class="col-xl-2 col-md-4 col-sm-6">
		      <div class="metric-card">
		        <div class="metric-label">${escapeHtml(label)}</div>
		        <div class="metric-value">${value ?? 0}</div>
		      </div>
		    </div>
		  `;
		}

		function listBlock(title, values) {
		  const items = (values || []).map(v => `<li>${escapeHtml(v)}</li>`).join("");
		  return `
		    <div class="mb-3">
		      <div class="fw-semibold">${escapeHtml(title)}</div>
		      <ul class="mb-0">${items || "<li class='text-muted'>None</li>"}</ul>
		    </div>
		  `;
		}

		function renderBarChart(canvasId, map) {
		  const canvas = document.getElementById(canvasId);
		  if (!canvas || typeof Chart === "undefined") {
		    return;
		  }

		  const labels = Object.keys(map || {});
		  const values = labels.map(k => map[k]);

		  new Chart(canvas, {
		    type: "bar",
		    data: {
		      labels,
		      datasets: [{
		        label: "Impact",
		        data: values
		      }]
		    },
		    options: {
		      responsive: true,
		      plugins: {
		        legend: {
		          display: false
		        }
		      },
		      scales: {
		        y: {
		          beginAtZero: true
		        }
		      }
		    }
		  });
		}

		function collectTradeoffCandidates(data) {
		  const result = [];

		  const artifactMetrics = data.metrics?.impactArtifactsPropagatedWeighted || {};
		  const directMetrics = data.metrics?.impactArtifactsWeighted || {};

		  Object.keys(artifactMetrics).forEach(variable => {
		    const propagated = artifactMetrics[variable] || 0;
		    const direct = directMetrics[variable] || 0;

		    const item = {
		      variable,
		      benefits: new Set(),
		      prejudices: new Set(),
		      hasConflict: false
		    };

		    if (propagated > 0) {
		      item.benefits.add("Potential propagated impact");
		    }

		    if (direct > 0 && propagated > direct) {
		      item.prejudices.add("Potential indirect impact to inspect");
		      item.hasConflict = true;
		    }

		    result.push(item);
		  });

		  return result;
		}

		function emptyState(message) {
		  return `
		    <div class="card-box">
		      <p class="text-muted mb-0">${escapeHtml(message)}</p>
		    </div>
		  `;
		}

		function renderError(error) {
		  rootElement().innerHTML = `
		    <div class="card-box">
		      <h5>Dashboard loading error</h5>
		      <p class="text-danger">${escapeHtml(error.message || String(error))}</p>
		      <p class="text-muted mb-0">
		        Check that dashboard/data/dashboard-data.json was generated.
		      </p>
		    </div>
		  `;
		}

		function rootElement() {
		  return document.getElementById("dashboard-root");
		}

		function escapeHtml(value) {
		  if (value === null || value === undefined) {
		    return "";
		  }

		  return String(value)
		    .replaceAll("&", "&amp;")
		    .replaceAll("<", "&lt;")
		    .replaceAll(">", "&gt;")
		    .replaceAll('"', "&quot;")
		    .replaceAll("'", "&#039;");
		}
	'''
}