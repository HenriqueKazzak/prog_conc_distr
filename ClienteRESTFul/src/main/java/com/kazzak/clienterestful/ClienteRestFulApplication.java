package com.kazzak.clienterestful;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ClienteRestFulApplication {

    private RestTemplate restTemplate = new RestTemplate();
    public static void main(String[] args) {
        SpringApplication.run(ClienteRestFulApplication.class, args);
        String hello = new RestTemplate()
                .getForObject("http://localhost:8080/hello", String.class);
        System.out.println(hello);e
    }

}
