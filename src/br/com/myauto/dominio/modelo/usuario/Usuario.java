/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.myauto.dominio.modelo.usuario;

import br.com.myauto.dominio.modelo.usuario.Email;

/**
 *
 * @author julio
 */
public class Usuario {
	
    private Integer usuario_Id;
    private String nome;
    private Email email;
    private Senha senha;

    public Usuario(Integer usuario_Id, String nome, Email email, Senha senha) {
        this.usuario_Id = usuario_Id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }
    
    public Usuario(String nome, Email email, Senha senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public Integer getUsuario_Id() {
        return usuario_Id;
    }

    public String getNome() {
        return nome;
    }

    public Email getEmail() {
        return email;
    }

    public Senha getSenha() {
        return senha;
    }
    
    
    
}
