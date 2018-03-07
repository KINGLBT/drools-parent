package com.rebote.drools.chapter1;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import com.rebote.drools.common.model.Producter;


public class FirstRule {
	
	public static void main(String[] args) {
		
		KieServices kss = KieServices.Factory.get();
		KieContainer kieContainer = kss.getKieClasspathContainer();
		KieSession kSession = kieContainer.newKieSession("ksession-rules");
		
		Producter product = new Producter();
        product.setType(Producter.GOLD);

        kSession.insert(product);
        
        int count = kSession.fireAllRules();
        
		System.out.println("命中了 "+count+"条规则!");
		System.out.println("商品" +product.getType() + "的商品折扣为" + product.getDiscount() + "%。");
		kSession.dispose();
		
	}
	
}
