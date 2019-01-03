package com.exampleariba.aribasoup.config;

import com.localiza.ws.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import javax.xml.bind.JAXBElement;
import java.util.ArrayList;
import java.util.List;

public class LocalizaClient extends WebServiceGatewaySupport {

    public  List<PollingMessage> getLocaliza() {

        PollingRequest request = new PollingRequest();

        BusinessDocumentMessageHeader businessDocumentMessageHeader = new BusinessDocumentMessageHeader();

        List<PollingRequestDetails> pollingRequestDetailsList = new ArrayList<>();
        PollingRequestDetails pollingRequestDetails = new PollingRequestDetails();
        pollingRequestDetails.setInboundServiceName("BusinessPartnerSUITEBulkReplicateRequest_In");
//        pollingRequestDetails.setInboundServiceName("BusinessPartnerSUITEBulkReplicateConfirmation_In");
        pollingRequestDetails.setTimestamp("");
        pollingRequestDetailsList.add(pollingRequestDetails);

        request.setMessageHeader(businessDocumentMessageHeader);
        request.setPollingRequestDetails(pollingRequestDetailsList);

        JAXBElement<PollingResponse> response = (JAXBElement<PollingResponse>)  getWebServiceTemplate()
                .marshalSendAndReceive("https://s1-2.ariba.com/SM/soap/PollingService",request);

        List<PollingMessage> pollingMessage = response.getValue().getPollingMessage();

        return pollingMessage;
    }
}
