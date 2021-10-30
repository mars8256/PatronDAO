/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uspg.impl;

import edu.uspg.dao.PersonaDAO;
import edu.uspg.model.Persona;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author morozco
 */
public class PersonaDAOImpl implements PersonaDAO{
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
    public void registrar(Persona persona) {
        lista.add(persona);
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
