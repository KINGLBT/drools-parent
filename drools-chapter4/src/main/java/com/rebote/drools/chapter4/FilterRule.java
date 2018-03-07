package com.rebote.drools.chapter4;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.rule.AgendaFilter;

import com.rebote.drools.chapter4.filter.MyAgendaFilter;

public class FilterRule {
	public static void main(String[] args) {
		KieServices ks = KieServices.Factory.get();
		KieContainer kieContainer = ks.getKieClasspathContainer();
		KieSession kSession = kieContainer.newKieSession("ksession-rules");
		AgendaFilter filter = new MyAgendaFilter("filter-rules");
		kSession.fireAllRules(filter);
		kSession.dispose();
	}
}
