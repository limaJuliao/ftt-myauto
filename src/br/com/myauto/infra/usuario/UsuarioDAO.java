/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.myauto.infra.usuario;

import br.com.myauto.dominio.modelo.usuario.Email;
import br.com.myauto.dominio.modelo.usuario.Senha;
import br.com.myauto.dominio.modelo.usuario.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author julio
 */
public class UsuarioDAO {
    
    private final Connection connection;

    public UsuarioDAO(Connection connection) {
        this.connection = connection;
    }
    
    public void insert(Usuario usuario) throws SQLException{
        
        String sql = "INSERT INTO [dbo].[Usuario]\n" +
                    "           ([nome]\n" +
                    "           ,[email]\n" +
                    "           ,[senha])\n" +
                    "     VALUES\n" +
                    "           (?, ?, ?)";

        try(PreparedStatement stm = 
                this.connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)){

            stm.setString(1, usuario.getNome());
            stm.setString(2, usuario.getEmail().getEndereco());
            stm.setString(3, usuario.getSenha().getSenhaValorCifrado());
            stm.execute();
        }
    }
    
    public boolean delete(int id) throws SQLException{
        String sql = "DELETE FROM Usuario WHERE usuario_id = ?";

        try(PreparedStatement stm = this.connection.prepareStatement(sql)){

            stm.setInt(1, id);
            stm.execute();

            Integer linhasModificadas = stm.getUpdateCount();

            return linhasModificadas > 0;
        }
    }
    
    public Usuario getById(int id) throws SQLException{
        String query = "SELECT [usuario_id]\n" +
                            "      ,[nome]\n" +
                            "      ,[email]\n" +
                            "      ,[senha]\n" +
                            "  FROM [MyAuto].[dbo].[Usuario]" + 
                            "  WHERE usuario_id = ?";

            try(PreparedStatement stm = this.connection.prepareStatement(query)){
                
                stm.setInt(1, id);

                stm.execute();

                try(ResultSet rst = stm.getResultSet()){
                    
                    Integer usuarioID = rst.getInt("usuario_id");
                    String nome = rst.getString("nome");
                    String email = rst.getString("email");
                    String senha = rst.getString("senha");

                    return new Usuario(usuarioID,
                                nome,
                                new Email(email),
                                new Senha(senha));
                }
            }
    }
    
    public List<Usuario> listar() throws SQLException{

        List<Usuario> usuarios = new ArrayList<>();        

        String query = "SELECT [usuario_id]\n" +
                                    "      ,[nome]\n" +
                                    "      ,[email]\n" +
                                    "      ,[senha]\n" +
                                    "  FROM [MyAuto].[dbo].[Usuario]";

        try(PreparedStatement stm = connection.prepareStatement(query)){

            stm.execute();

            try(ResultSet rst = stm.getResultSet()){
                while(rst.next()){
                    Integer usuarioID = rst.getInt("usuario_id");
                    String nome = rst.getString("nome");
                    String email = rst.getString("email");
                    String senha = rst.getString("senha");

                    Usuario usuario = new Usuario(usuarioID,
                            nome,
                            new Email(email),
                            new Senha(senha));

                    usuarios.add(usuario);
                }
            }
            return usuarios;
        }
    }
    
    public boolean update(Usuario usuario) throws SQLException{
        
        String sql = "PDATE [dbo].[Usuario]\n" +
                    "   SET [nome] = ?\n" +
                    "      ,[email] = ?\n" +
                    "      ,[senha] = ?\n" +
                    " WHERE ?";
        
        try(PreparedStatement pstm = connection.prepareStatement(sql)){
            pstm.setString(1, usuario.getNome());
            pstm.setString(2, usuario.getEmail().getEndereco());            
            pstm.setString(3, usuario.getSenha().getSenhaValorCifrado());
            pstm.setInt(4, usuario.getUsuario_Id());
            
            pstm.execute();
            
            int linhasModificadas = pstm.getUpdateCount();
            
            return linhasModificadas > 0;
        }
    }
}
