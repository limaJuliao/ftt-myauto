/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.myauto.infra.veiculo;

import br.com.myauto.dominio.modelo.veiculo.Veiculo;
import br.com.myauto.dominio.veiculo.RepositorioDeVeiculo;
import br.com.myauto.infra.ConnectionFactory;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author julio
 */
public class RepositorioDeVeiculoComJDBC implements RepositorioDeVeiculo{
    
    ConnectionFactory connectionFactory = new ConnectionFactory();

    @Override
    public List<Veiculo> listarVeiculo() throws SQLException {
        try(Connection connection = this.connectionFactory.recuperarConexao()){
            return new VeiculoDAO(connection).listar();
        }
    }

    @Override
    public void inserirVeiculo(Veiculo veiculo) throws SQLException {
        try(Connection connection = this.connectionFactory.recuperarConexao()){
            new VeiculoDAO(connection).insert(veiculo);
        }
    }

    @Override
    public boolean editarVeiculo(Veiculo veiculo) throws SQLException {
        try(Connection connection = this.connectionFactory.recuperarConexao()){
            return new VeiculoDAO(connection).update(veiculo);
        }
    }

    @Override
    public boolean excluirVeiculo(int id) throws SQLException {
        try(Connection connection = this.connectionFactory.recuperarConexao()){
            return new VeiculoDAO(connection).delete(id);
        }
    }

    @Override
    public Veiculo buscarVeiculoPorId(int id) throws SQLException {
        try(Connection connection = this.connectionFactory.recuperarConexao()){
            return new VeiculoDAO(connection).getById(id);
        }
    }
    
}
