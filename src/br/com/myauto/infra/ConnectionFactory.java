/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.myauto.infra;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.sql.DataSource;

/**
 *
 * @author julio
 */
public class ConnectionFactory {
    
    private String strConnection = "jdbc:sqlserver://localhost;databaseName=MyAuto";
    private String user = "sa";
    private String password = "@123";
    
    public DataSource dataSource;
    
    public ConnectionFactory(){
        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
        comboPooledDataSource.setJdbcUrl(this.strConnection);
        comboPooledDataSource.setUser(this.user);
        comboPooledDataSource.setPassword(this.password);
        
        comboPooledDataSource.setMaxPoolSize(15);
        
        this.dataSource = comboPooledDataSource;
    }
    
    public Connection recuperarConexao() throws SQLException {
        String strConnection = "jdbc:sqlserver://localhost;databaseName=MyAuto";
        String user = "sa";
        String password = "@123";

        return this.dataSource.getConnection();
    }
}
