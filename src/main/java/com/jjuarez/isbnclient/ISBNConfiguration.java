package com.jjuarez.isbnclient;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class ISBNConfiguration {
	
	@Bean
	public Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPath("com.jjuarez.wsdl");
		return marshaller;
	}
	
	@Bean
	  public ISBNClient webServiceTemplate(Jaxb2Marshaller marshaller) {
		ISBNClient client = new ISBNClient();
	    client.setMarshaller(marshaller);
	    client.setUnmarshaller(marshaller);
	    client.setDefaultUri("");

	    return client;
	  }
}
