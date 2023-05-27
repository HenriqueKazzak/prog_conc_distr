package com.kazzak.clientewebservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.WebServiceTemplate;

@Component
public class SoapClient {

    private final WebServiceTemplate webServiceTemplate;

    @Autowired
    public SoapClient(WebServiceTemplate webServiceTemplate) {
        this.webServiceTemplate = webServiceTemplate;
    }

    public int somar(int a, int b) {
        SomarRequest request = new SomarRequest();
        request.setA(a);
        request.setB(b);

        SomarResponse response = (SomarResponse) webServiceTemplate.marshalSendAndReceive(request);
        return response.getResultado();
    }

    public int subtrair(int a, int b) {
        SubtrairRequest request = new SubtrairRequest();
        request.setA(a);
        request.setB(b);

        SubtrairResponse response = (SubtrairResponse) webServiceTemplate.marshalSendAndReceive(request);
        return response.getResultado();
    }
}

