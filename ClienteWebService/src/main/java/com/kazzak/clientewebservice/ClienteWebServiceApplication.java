package com.kazzak.clientewebservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ClienteWebServiceApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(ClienteWebServiceApplication.class, args);

        SoapClient soapClient = context.getBean(SoapClient.class);

        int resultadoSoma = soapClient.somar(2, 3);
        System.out.println("Resultado da soma: " + resultadoSoma);

        int resultadoSubtracao = soapClient.subtrair(5, 2);
        System.out.println("Resultado da subtração: " + resultadoSubtracao);
    }
}

