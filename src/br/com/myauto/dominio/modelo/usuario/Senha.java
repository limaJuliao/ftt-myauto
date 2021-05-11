/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.myauto.dominio.modelo.usuario;

import br.com.myauto.infra.usuario.CifradorDeSenhaComMD5;

/**
 *
 * @author julio
 */
public class Senha {
    private String senhaValorCifrado;

    public Senha(String senhaValor) {
        this.senhaValorCifrado = senhaValor;
    }

    public String getSenhaValorCifrado() {
        return senhaValorCifrado;
    }    
}
