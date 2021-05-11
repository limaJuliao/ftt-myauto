/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.myauto.infra.usuario;

import br.com.myauto.dominio.modelo.usuario.Email;
import br.com.myauto.dominio.usuario.RepositorioDeUsuario;
import br.com.myauto.dominio.modelo.usuario.Senha;
import br.com.myauto.dominio.modelo.usuario.Usuario;
import br.com.myauto.infra.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
            return new ArrayList<>();
            }
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
        
        try(Connection connection = connectionFactory.recuperarConexao()){
            return new UsuarioDAO(connection).delete(id);            
        }
    }

    @Override
    public void editarUsuario(Usuario usuario) throws SQLException{
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public static void main(String[] args) throws SQLException{
        RepositorioDeUsuario ru = new RepositorioDeUsuarioComJDBC();
        
//        UsuarioDTO usuarioDto = new UsuarioDTO("Maria", "maria@teste.com", "12345");
        
//        Usuario usuario = usuarioDto.criarUsuario();
        
//        ru.inserirUsuário(usuario);

//        ru.excluirUsuario(4);
        
        List<Usuario> usuarios = ru.listarUsuarios();
        
        usuarios.forEach(usu -> {
            System.out.println(usu.getEmail().getEndereco());
        });
        
    }
}
