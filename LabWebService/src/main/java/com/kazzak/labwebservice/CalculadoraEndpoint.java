package com.kazzak.labwebservice;

import org.springframework.stereotype.Component;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Component
@Endpoint
public class CalculadoraEndpoint {

    @PayloadRoot(namespace = "http://example.com/calculadora", localPart = "somarRequest")
    @ResponsePayload
    public SomarResponse somar(@RequestPayload SomarRequest request) {
        int resultado = request.getA() + request.getB();

        SomarResponse response = new SomarResponse();
        response.setResultado(resultado);

        return response;
    }

    @PayloadRoot(namespace = "http://example.com/calculadora", localPart = "subtrairRequest")
    @ResponsePayload
    public SubtrairResponse subtrair(@RequestPayload SubtrairRequest request) {
        int resultado = request.getA() - request.getB();

        SubtrairResponse response = new SubtrairResponse();
        response.setResultado(resultado);

        return response;
    }
}
