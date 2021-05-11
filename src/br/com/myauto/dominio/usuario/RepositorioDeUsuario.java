/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.myauto.dominio.usuario;

import br.com.myauto.dominio.modelo.usuario.Usuario;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author julio
 */
public interface RepositorioDeUsuario {
    
    List<Usuario> listarUsuarios() throws SQLException;
	
    void inserirUsuário(Usuario usuario) throws SQLException;

    boolean editarUsuario(Usuario usuario) throws SQLException;

    boolean excluirUsuario(int id) throws SQLException;

    Usuario buscarUsuarioPorId(int id) throws SQLException;
    
}
