package org.mavs.ejb.advice;

import javax.ejb.*;

public interface Advice extends EJBObject {
	
	public String getAdvice() throws java.rmi.RemoteException;
	
}
