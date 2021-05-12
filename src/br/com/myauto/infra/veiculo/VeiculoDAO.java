/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.myauto.infra.veiculo;

import br.com.myauto.dominio.modelo.veiculo.Veiculo;
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
public class VeiculoDAO {
    
    private final Connection connection;

    VeiculoDAO(Connection connection) {
        this.connection = connection;
    }

    List<Veiculo> listar() throws SQLException {
        List<Veiculo> veiculos = new ArrayList<>();
        
        String query = "";
        
        try(PreparedStatement pstm = this.connection.prepareStatement(query)){
            pstm.execute();
            
            try(ResultSet rs = pstm.getResultSet()){
                
                while(rs.next()){
                    Veiculo veiculo = new Veiculo(rs.getInt("veiculo_id"),
                            rs.getInt("usuario_id"),
                            rs.getString("tipo"),
                            rs.getString("marca"),
                            rs.getString("modelo"),
                            rs.getString("volumeTanque"),
                            rs.getBoolean("doisTanques"));
                    
                    veiculo.setAno(rs.getInt("ano"));
                    veiculo.setApelido(rs.getString("apelido"));
                    veiculo.setChassi(rs.getString("chassi"));
                    veiculo.setComentario(rs.getString("comentario"));
                    veiculo.setPlaca(rs.getString("placa"));
                    veiculo.setRenavan(rs.getString("renavan"));

                    veiculos.add(veiculo);
                }
                return veiculos;
            }
        }
    }

    void insert(Veiculo veiculo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    boolean update(Veiculo veiculo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    boolean delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Veiculo getById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
