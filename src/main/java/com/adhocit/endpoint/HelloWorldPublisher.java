package com.adhocit.endpoint;

import javax.xml.ws.Endpoint;

import com.adhocit.ws.CorrelationIDWebServiceImpl;

public class HelloWorldPublisher {

	public static void main(String[] args) {
		Endpoint endpoint = Endpoint.create(new CorrelationIDWebServiceImpl());
		endpoint.publish("http://localhost:8888/ws/soapHandler");
	}
}
	
