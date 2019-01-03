package com.exampleariba.aribasoup.config;

import org.apache.catalina.authenticator.BasicAuthenticator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.transport.http.HttpComponentsMessageSender;

@Configuration
public class WSConfigClient {

    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        // this package must match the package in the <generatePackage> specified in
        // pom.xml
        marshaller.setContextPath("com.localiza.ws");
        return marshaller;
    }

    @Bean
    public LocalizaClient getLocalizaClientSoap(Jaxb2Marshaller marshaller) {
        LocalizaClient client = new LocalizaClient();
        client.setDefaultUri("https://s1-2.ariba.com/SM/soap/PollingService");
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        client.setMessageSender(new WebServiceMessageSenderWithAuth("localiza-T", "Localiza@2018"));
        return client;
    }

//    @Bean
//    public HttpComponentsMessageSender httpComponentsMessageSender() {
//        HttpComponentsMessageSender httpComponentsMessageSender = new HttpComponentsMessageSender();
//        // set the basic authorization credentials
//        httpComponentsMessageSender.setCredentials(new BasicAuthenticator.BasicCredentials());
//
//        return httpComponentsMessageSender;
//    }
//
//    @Bean
//    public Credentials usernamePasswordCredentials() {
//        // pass the user name and password to be used
//        return new UsernamePasswordCredentials(userName, userPassword);
//    }


}
