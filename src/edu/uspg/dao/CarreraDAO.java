/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uspg.dao;

import edu.uspg.model.Carrera;
import java.util.List;

/**
 *
 * @author morozco
 */
public interface CarreraDAO extends CRUD<Carrera> {
    void mostrarCarrera();
}
