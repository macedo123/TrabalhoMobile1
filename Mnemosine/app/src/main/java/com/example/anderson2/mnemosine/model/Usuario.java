package com.example.anderson2.mnemosine.model;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Anderson2 on 01/10/2017.
 */

public class Usuario implements Serializable{
    private int id;
    private String nome;
    private String login;
    private String senha;
    private Date dataNascimento;

    public Usuario() {
    }

    public Usuario(int id, String nome, String login, String senha, Date dataNascimento) {
        this.id = id;
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.dataNascimento = dataNascimento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
