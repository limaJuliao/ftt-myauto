/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.myauto.infra.usuario;

import br.com.myauto.dominio.usuario.RepositorioDeUsuario;
import br.com.myauto.dominio.modelo.usuario.Usuario;
import br.com.myauto.infra.ConnectionFactory;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author julio
 */
public class RepositorioDeUsuarioComJDBC implements RepositorioDeUsuario {
    
    ConnectionFactory connectionFactory = new ConnectionFactory();

    @Override
    public List<Usuario> listarUsuarios() throws SQLException{
        
        try(Connection connection = this.connectionFactory.recuperarConexao()){
            return new UsuarioDAO(connection).listar();
        }
    }

    @Override
    public Usuario buscarUsuarioPorId(int id) throws SQLException{
        
        try(Connection connection = this.connectionFactory.recuperarConexao()){
            return new UsuarioDAO(connection).getById(id);            
        }
    }

    @Override
    public void inserirUsuário(Usuario usuario) throws SQLException{
        
        try(Connection connection = connectionFactory.recuperarConexao()){
            new UsuarioDAO(connection).insert(usuario);
        }
    }

    @Override
    public boolean excluirUsuario(int id) throws SQLException{       
        
        try(Connection connection = this.connectionFactory.recuperarConexao()){
            return new UsuarioDAO(connection).delete(id);            
        }
    }

    @Override
    public boolean editarUsuario(Usuario usuario) throws SQLException {
        
        try(Connection connection = connectionFactory.recuperarConexao()){
            return new UsuarioDAO(connection).update(usuario);
        }
    }
}
