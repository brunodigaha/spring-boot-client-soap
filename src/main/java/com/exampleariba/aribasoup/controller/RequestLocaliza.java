package com.exampleariba.aribasoup.controller;


import com.exampleariba.aribasoup.config.LocalizaClient;
import com.exampleariba.aribasoup.config.WSConfigClient;
import com.exampleariba.aribasoup.configCXF.CXFService;
import com.exampleariba.aribasoup.configCXF.ClientCxfConfig;
import com.exampleariba.aribasoup.cxfgerado.suppliermanagement.P3StandardMessageFault;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.localiza.ws.PollingMessage;
import com.localiza.ws.PollingRequest;
import com.localiza.ws.PollingResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Controller;
import org.springframework.ws.client.core.WebServiceTemplate;

import javax.annotation.PostConstruct;
import javax.xml.bind.JAXBElement;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class RequestLocaliza {

    @Autowired
    private LocalizaClient localizaClient;

    @Autowired
    private CXFService cxfService;



//    @PostConstruct
    public void iniciar() throws Exception {
        System.out.println("iniciado");
//        PollingRequest pollingRequest = new PollingRequest();
//        pollingRequest.getPollingRequestDetails();
//        pollingRequest.setMessageHeader();
        List<PollingMessage> response = localizaClient.getLocaliza();
        List<Map<String, Object>> map = new ArrayList<Map<String, Object>>();
        for(PollingMessage pollingMessage : response){
            System.out.println(pollingMessage.getBusinessPartnerSUITEBulkReplicateRequest()
                    .getBusinessPartnerSUITEReplicateRequestMessage()
                    .get(0).getBusinessPartner().getTaxNumber().get(0).getPartyTaxID().getValue());

            ObjectMapper oMapper = new ObjectMapper();
            Map<String, Object> mapitem = oMapper.convertValue(pollingMessage, Map.class);
            map.add(mapitem);
        }


        System.out.println("sdf");
    }

    @PostConstruct
    public void buscarAriba() throws P3StandardMessageFault {
        System.out.println("iniciado");

        cxfService.getLocaliza();



    }




}
