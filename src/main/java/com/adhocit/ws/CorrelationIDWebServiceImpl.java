package com.adhocit.ws;

import javax.jws.HandlerChain;
import javax.jws.WebService;

@WebService(endpointInterface="com.adhocit.ws.CorrelationIDWebService")
@HandlerChain(file="../handler/handler-chain.xml")
public class CorrelationIDWebServiceImpl implements CorrelationIDWebService {

	@Override
	public String sayHello() {
		// TODO Auto-generated method stub
		return "tulling";
	}

}
