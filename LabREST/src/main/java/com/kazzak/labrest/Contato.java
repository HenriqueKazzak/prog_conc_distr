package com.kazzak.labrest;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Contato {
    @JsonProperty("nome")
    private String nome;
    @JsonProperty("telefone")
    private String telefone;
    @JsonProperty("email")
    private String email;

    public Contato() {
    }

    public Contato(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }
}
