package com.rebote.drools.chapter4;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;


public class RuleFire {
	public static void main(String[] args) {
		KieServices ks = KieServices.Factory.get();
		KieContainer kieContainer = ks.getKieClasspathContainer();
		KieSession kSession = kieContainer.newKieSession("ksession-rules");
		//如果不设置指定AgendaGroup获得焦点，则该AgendaGroup下的规则将不会被执行。
		kSession.getAgenda().getAgendaGroup("abc").setFocus();
		kSession.fireAllRules();
		kSession.dispose();
	}
}
