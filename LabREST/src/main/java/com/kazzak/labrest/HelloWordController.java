package com.kazzak.labrest;

import jakarta.websocket.server.PathParam;
import org.springframework.http.ResponseEntity;
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
        Contato c = new  Contato("Joao", "123456789", "123@1123.com");
        return "<?xml version=\"1.0\"?><nome>"+ c.getNome() +"</nome><telefone>"+c.getTelefone()+"</telefone><email>"+c.getEmail()+"</email>";
    }
    @GetMapping(path = "/hello", produces = "application/json")
    public ResponseEntity<Contato> helloWordJson() {
        return ResponseEntity.ok(new Contato("Joao", "123456789", "123@1123.com"));
    }

    @GetMapping(path = "/hello/{nome}", produces = "application/xml")
    public String helloWordXml(@PathParam("nome") String nome) {
        Contato contato = new Contato(nome, "123456789", "123@123.com");
        return "<?xml version=\"1.0\"?><nome>Ola "+nome+"</nome><telefone>"+contato.getTelefone()+"</telefone><email>"+contato.getEmail()+"</email>";
    }

    @PostMapping(path = "/hello/", produces = "application/xml")
    public String helloWordXmlPostForm(@RequestParam("nome") String nome) {
        return "<?xml version=\"1.0\"?><mensagem>Ola "+nome+"</mensagem>";
    }
}