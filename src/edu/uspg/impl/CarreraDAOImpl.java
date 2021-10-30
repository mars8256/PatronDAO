/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uspg.impl;

import edu.uspg.dao.CarreraDAO;
import edu.uspg.model.Carrera;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author morozco
 */
public class CarreraDAOImpl implements CarreraDAO {
List<Carrera> lista = new ArrayList<>();

    @Override
    public List<Carrera> listarTodos() {
        return lista;
    }

    @Override
    public Carrera getPorId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void registrar(Carrera carrera) {
        lista.add(carrera);
    }

    @Override
    public void actualizar(Carrera carrera) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mostrarCarrera() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
