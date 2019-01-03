package com.exampleariba.aribasoup.controller;


import com.exampleariba.aribasoup.config.LocalizaClient;
import com.exampleariba.aribasoup.config.WSConfigClient;
import com.localiza.ws.PollingMessage;
import com.localiza.ws.PollingRequest;
import com.localiza.ws.PollingResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Controller;
import org.springframework.ws.client.core.WebServiceTemplate;

import javax.annotation.PostConstruct;
import javax.xml.bind.JAXBElement;
import java.util.List;

@Controller
public class RequestLocaliza {

    @Autowired
    private LocalizaClient localizaClient;

    @PostConstruct
    public void iniciar() throws Exception {
        System.out.println("iniciado");
//        PollingRequest pollingRequest = new PollingRequest();
//        pollingRequest.getPollingRequestDetails();
//        pollingRequest.setMessageHeader();
        List<PollingMessage> response = localizaClient.getLocaliza();
        for(PollingMessage pollingMessage : response){
            System.out.println(pollingMessage.getBusinessPartnerSUITEBulkReplicateRequest()
                    .getBusinessPartnerSUITEReplicateRequestMessage()
                    .get(0).getBusinessPartner().getTaxNumber().get(0).getPartyTaxID().getValue());
        }
    }

}
