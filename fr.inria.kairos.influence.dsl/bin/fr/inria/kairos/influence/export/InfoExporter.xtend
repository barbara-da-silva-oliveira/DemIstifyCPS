package fr.inria.kairos.influence.export

class InfoExporter {

	def void appendSortedIntMap(StringBuilder sb, java.util.HashMap<String,Integer> map) {
		val list = new java.util.ArrayList<java.util.Map$Entry<String,Integer>>(map.entrySet)
    	list.sort [ a, b | 
    		val c = Integer.compare(b.value, a.value); 
    		if (c != 0) c 
    		else a.key.compareTo(b.key)
    		]
		for (e : list) sb.append("  ").append(e.key).append(" -> ").append(e.value).append("\n")
  	}

	def void appendSortedDoubleMap(StringBuilder sb, java.util.HashMap<String,Double> map) {
		val list = new java.util.ArrayList<java.util.Map$Entry<String,Double>>(map.entrySet)
		list.sort [ a, b | 
	    	val c = Double.compare(b.value, a.value); 
	    	if (c != 0) c 
	    	else a.key.compareTo(b.key)
    		]
		for (e : list) sb.append("  ").append(e.key).append(" -> ").append(e.value).append("\n")
  	}
}
