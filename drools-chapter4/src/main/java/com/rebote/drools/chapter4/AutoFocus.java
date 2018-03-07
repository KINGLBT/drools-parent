package com.rebote.drools.chapter4;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class AutoFocus {
	public static void main(String[] args) {
		KieServices ks = KieServices.Factory.get();
		KieContainer kieContainer = ks.getKieClasspathContainer();
		KieSession kSession = kieContainer.newKieSession("ksession-rules");
		kSession.fireAllRules();
		kSession.dispose();
	}
}
