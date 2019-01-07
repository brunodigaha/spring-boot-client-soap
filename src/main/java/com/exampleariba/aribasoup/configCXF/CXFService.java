package com.exampleariba.aribasoup.configCXF;


import com.exampleariba.aribasoup.cxfgerado.suppliermanagement.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CXFService {

    @Autowired
    private ClientCxfConfig aribaService;

    public List<PollingMessage> getLocaliza() throws P3StandardMessageFault {

        ObjectFactory factory = new ObjectFactory();
        PollingRequest pollingRequest = factory.createPollingRequest();

        BusinessDocumentMessageHeader businessDocumentMessageHeader = new BusinessDocumentMessageHeader();

        List<PollingRequestDetails> pollingRequestDetailsList = new ArrayList<>();
        PollingRequestDetails pollingRequestDetails = new PollingRequestDetails();
        pollingRequestDetails.setInboundServiceName("BusinessPartnerSUITEBulkReplicateRequest_In");
//        pollingRequestDetails.setInboundServiceName("BusinessPartnerSUITEBulkReplicateConfirmation_In");
        pollingRequestDetails.setTimestamp("");
        pollingRequestDetailsList.add(pollingRequestDetails);

        pollingRequest.setMessageHeader(businessDocumentMessageHeader);
        pollingRequest.setPollingRequestDetails(pollingRequestDetailsList);

        PollingClientRequestResponseOut  pollingClientRequestResponseOut = aribaService.aribaService();
        PollingResponse pollingResponse = pollingClientRequestResponseOut.pollingClientRequestResponseOut(pollingRequest);



        return pollingResponse.getPollingMessage();
    }
}
