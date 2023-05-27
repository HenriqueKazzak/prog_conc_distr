package com.kazzak.labwebservice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@EnableWs
@Configuration
public class SoapWebServiceConfig extends WsConfigurerAdapter {

    @Bean
    public XsdSchema calculadoraSchema() {
        return new SimpleXsdSchema(new ClassPathResource("/calculadora.xsd"));
    }

    @Bean
    public DefaultWsdl11Definition calculadoraWsdl(XsdSchema calculadoraSchema) {
        DefaultWsdl11Definition wsdlDefinition = new DefaultWsdl11Definition();
        wsdlDefinition.setPortTypeName("CalculadoraPort");
        wsdlDefinition.setLocationUri("/calculadora");
        wsdlDefinition.setTargetNamespace("http://example.com/calculadora");
        wsdlDefinition.setSchema(calculadoraSchema);
        return wsdlDefinition;
    }
}

