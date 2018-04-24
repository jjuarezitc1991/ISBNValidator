package com.jjuarez.isbnclient;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import com.jjuarez.wsdl.IsValidISBN13;
import com.jjuarez.wsdl.IsValidISBN13Response;

public class ISBNClient extends WebServiceGatewaySupport {
	
	private static final Logger log = LoggerFactory.getLogger(ISBNClient.class);
	
	public IsValidISBN13Response validateISBN(String isbn) {
		
		IsValidISBN13 request = new IsValidISBN13();
		request.setSISBN(isbn);
		
		log.info("Validating isbn: " + isbn);
		
		IsValidISBN13Response response = (IsValidISBN13Response) getWebServiceTemplate()
									.marshalSendAndReceive("http://webservices.daehosting.com/services/isbnservice.wso", 
											request, 
											new SoapActionCallback("http://webservices.daehosting.com/services/isbnservice.wso"));
		return response;
	}
}
