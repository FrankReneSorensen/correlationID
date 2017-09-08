package com.adhocit.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;



/**
 * @author Frank
 *Interface som definerer web tjeneste som skal returnerer innhold i Context
 */
@WebService
public interface CorrelationIDWebService {
	
	@WebMethod
	public String sayHello ();

}
