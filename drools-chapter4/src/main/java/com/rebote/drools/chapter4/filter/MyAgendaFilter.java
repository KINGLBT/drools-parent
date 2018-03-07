package com.rebote.drools.chapter4.filter;

import org.kie.api.runtime.rule.AgendaFilter;
import org.kie.api.runtime.rule.Match;

public class MyAgendaFilter implements AgendaFilter{
	
	private String ruleName;

    public MyAgendaFilter(String ruleName) {
        this.ruleName = ruleName;
    }
	
	public boolean accept(Match match) {
		System.out.println(match.getRule().getName());
		return match.getRule().getName().equals(ruleName) ? true : false;
	}

	public String getRuleName() {
		return ruleName;
	}

	public void setRuleName(String ruleName) {
		this.ruleName = ruleName;
	}
	
	
	
}
