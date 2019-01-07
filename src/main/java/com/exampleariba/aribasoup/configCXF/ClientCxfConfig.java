package com.exampleariba.aribasoup.configCXF;

import com.exampleariba.aribasoup.cxfgerado.suppliermanagement.PollingClientRequestResponseOut;
import com.exampleariba.aribasoup.cxfgerado.suppliermanagement.PollingClientRequestResponseOut_Service;
import com.exampleariba.aribasoup.cxfgerado.suppliermanagement.PollingResponse;
import org.apache.cxf.configuration.security.AuthorizationPolicy;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.cxf.transport.http.HTTPConduit;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class ClientCxfConfig {

//    @Value("${client.ticketagent.address}")
//    private String address;

    @Bean
    public PollingClientRequestResponseOut aribaService() {
        JaxWsProxyFactoryBean jaxWsProxyFactoryBean =
                new JaxWsProxyFactoryBean();
        jaxWsProxyFactoryBean.setServiceClass(PollingClientRequestResponseOut.class);
        jaxWsProxyFactoryBean.setAddress("https://s1-2.ariba.com/SM/soap/PollingService");
        jaxWsProxyFactoryBean.setUsername("localiza-T");
        jaxWsProxyFactoryBean.setPassword("Localiza@2018");

        return (PollingClientRequestResponseOut) jaxWsProxyFactoryBean.create();
    }


//    @Bean
//    public Client ticketAgentClientProxy() {
//        return ClientProxy.getClient(aribaService());
//    }
//
//    @Bean
//    public HTTPConduit ticketAgentConduit() {
//        HTTPConduit httpConduit =
//                (HTTPConduit) ticketAgentClientProxy().getConduit();
//        httpConduit.setAuthorization(basicAuthorization());
//
//        return httpConduit;
//    }
//
//    @Bean
//    public AuthorizationPolicy basicAuthorization() {
//        AuthorizationPolicy authorizationPolicy =
//                new AuthorizationPolicy();
//        authorizationPolicy.setUserName("localiza-T");
//        authorizationPolicy.setPassword("Localiza@2018");
//        authorizationPolicy.setAuthorizationType("Basic");
//
//        return authorizationPolicy;
//    }
}
