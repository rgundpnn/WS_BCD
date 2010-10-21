package org.mavs.ejb.advice;

import javax.ejb.*;

public class AdviceBean implements SessionBean {

	private String[] advices = {"Become the change you seek in the world",
								"Would the child you were respect the person you have become?",
								"The only victory that counts is one over yourself",
								"Stength does not come from physical capacity but from the" +
								"indomitable will"};
	
	public void ejbActivate() {
		System.out.println("advice bean activated");
	}
	
	public void ejbPassivate() {
		System.out.println("advice bean passivated");
	}
	
	public void ejbRemove() {
		System.out.println("advice bean removed");
	}
	
	public void setSessionContext(SessionContext context) {
		System.out.println("advice sessioncontext is set");
	}
	
	public String getAdvice() {
		
		int random = (int)(Math.random() * this.advices.length);
		
		return this.advices[random];
	}
	
	public void ejbCreate() {
		System.out.println("advice bean created");
	}
}
