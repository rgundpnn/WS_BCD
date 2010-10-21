package org.mavs.ejb.advice;

import javax.ejb.*;

public interface AdviceHome extends EJBHome {

	public Advice create() throws java.rmi.RemoteException, CreateException;
	
}
