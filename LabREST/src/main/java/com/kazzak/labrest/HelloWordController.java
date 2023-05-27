package com.kazzak.labrest;

import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWordController {


    @GetMapping(path = "/hello", produces = "text/plain")
    public String helloWord() {
        return "Ola Mundo";
    }
    @GetMapping(path = "/hello", produces = "application/xml")
    public String helloWordXml() {
        return "<?xml version=\"1.0\"?><mensagem>Ola Mundo</mensagem>";
    }
    @GetMapping(path = "/hello", produces = "application/json")
    public String helloWordJson() {
        return "{\"mensagem\":\"Ola Mundo\"}";
    }

    @GetMapping(path = "/hello/{nome}", produces = "application/xml")
    public String helloWordXml(@PathParam("nome") String nome) {
        return "<?xml version=\"1.0\"?><mensagem>Ola "+nome+"</mensagem>";
    }

    @PostMapping(path = "/hello/", produces = "application/xml")
    public String helloWordXmlPostForm(@RequestParam("nome") String nome) {
        return "<?xml version=\"1.0\"?><mensagem>Ola "+nome+"</mensagem>";
    }
}