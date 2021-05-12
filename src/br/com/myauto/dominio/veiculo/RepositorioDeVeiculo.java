/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.myauto.dominio.veiculo;

import br.com.myauto.dominio.modelo.usuario.Usuario;
import br.com.myauto.dominio.modelo.veiculo.Veiculo;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author julio
 */
public interface RepositorioDeVeiculo {
    
    List<Veiculo> listarVeiculo() throws SQLException;
	
    void inserirVeiculo(Veiculo veiculo) throws SQLException;

    boolean editarVeiculo(Veiculo veiculo) throws SQLException;

    boolean excluirVeiculo(int id) throws SQLException;

    Veiculo buscarVeiculoPorId(int id) throws SQLException;
    
}
