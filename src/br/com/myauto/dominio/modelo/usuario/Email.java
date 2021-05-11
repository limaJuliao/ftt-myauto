/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.myauto.dominio.modelo.usuario;

/**
 *
 * @author julio
 */
public class Email {
	
    private String endereco;

    public Email(String endereco) {

//        verificaEndereco(endereco);		

        this.endereco = endereco;		
    }

    private void verificaEndereco(String endereco) {
        
        String expressaoRegulaEmail = "^[a-zA-Z0-9._]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        
        if(endereco == null || endereco.matches(expressaoRegulaEmail))
                throw new IllegalArgumentException("Email inválido.");
    }

    public String getEndereco() {
        return endereco;
    }
    
    
}