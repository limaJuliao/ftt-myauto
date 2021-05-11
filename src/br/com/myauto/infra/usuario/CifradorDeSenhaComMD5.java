/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.myauto.infra.usuario;

import br.com.myauto.dominio.servico.usuario.CifradorDeSenha;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author julio
 */
public class CifradorDeSenhaComMD5 implements CifradorDeSenha{

    @Override
    public String cifrarSenha(String senha) {
		
        try {

            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(senha.getBytes());
            byte[] bytes = md.digest();
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < bytes.length; i++) {
                    sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
            }

            return sb.toString();

        } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException("Erro ao gerar hash da senha");
        }
    }

    @Override
    public boolean senhaCifradaValida(String senhaCifrada, String senha) {
        return senhaCifrada.equals(cifrarSenha(senha));
    }
    
}
