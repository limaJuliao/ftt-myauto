/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.myauto.dominio.usuario;

import br.com.myauto.dominio.modelo.usuario.Senha;
import br.com.myauto.dominio.modelo.usuario.Usuario;
import br.com.myauto.dominio.modelo.usuario.Email;

/**
 *
 * @author julio
 */
public class UsuarioDTO {
    
    private String nomeUsuario;
    private String emailUsuario;
    private String senhaUsuario;

    public UsuarioDTO(String nome, String email, String senha) {
        this.nomeUsuario = nome;
        this.emailUsuario = email;
        this.senhaUsuario = senha;
    }
    
    public Usuario criarUsuario(){
        return new Usuario(
                nomeUsuario,
                new Email(emailUsuario), 
                new Senha(senhaUsuario));
    }
    
}
