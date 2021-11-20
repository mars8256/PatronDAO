/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uspg.impl;

import edu.uspg.conexion.Conexion;
import edu.uspg.dao.PersonaDAO;
import edu.uspg.model.Persona;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author morozco
 */
public class PersonaDAOImpl extends Conexion implements PersonaDAO{
 List<Persona> lista = new ArrayList<>();
 
    @Override
    public List<Persona> listarTodos() {
        return lista;
    }

    @Override
    public Persona getPorId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void registrar(Persona persona) throws Exception {
//        lista.add(persona);
        try{
            this.conectar();
            PreparedStatement st = conexion.prepareStatement("insert into alumno(nombre) values(?)");
            st.setString(1,persona.getNombres());
            st.executeUpdate();
        }catch(Exception e){
            throw e;
        }finally{
            this.cerrar();
        }
    }

    @Override
    public void actualizar(Persona persona) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mostrarNombre() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
