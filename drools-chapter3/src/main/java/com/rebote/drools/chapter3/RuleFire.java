package com.rebote.drools.chapter3;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import com.rebote.drools.common.model.Producter;

public class RuleFire {
	public static void main(String[] args) {
		KieServices ks = KieServices.Factory.get();
		KieContainer kieContainer = ks.getKieClasspathContainer();
		KieSession kSession = kieContainer.newKieSession("ksession-rules");
		
		Producter producter = new Producter();
		producter.setDiscount(1);
		kSession.insert(producter);
		
		kSession.fireAllRules();
		kSession.dispose();
	}
}
