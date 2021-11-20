/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uspg.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author morozco
 */
public class Conexion {
    protected Connection conexion;
    private String JDBC_DRIVER = "org.postgresql.Driver";
    private String DB_URL = "jdbc:postgresql://localhost:5432/ejemplo";
    private String USER = "postgres";
    private String PASS = "postgres12056";
    
    public void conectar() throws Exception{
        try{
            conexion = DriverManager.getConnection(DB_URL, USER, PASS);
            Class.forName(JDBC_DRIVER);
        }catch(Exception e){
            throw e;
        }
    }
    
    public void cerrar() throws SQLException{
        if(conexion != null){
            if(!conexion.isClosed()){
                conexion.close();
            }
        }
    }
    
    
}
