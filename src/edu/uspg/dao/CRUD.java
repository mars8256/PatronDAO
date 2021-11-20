/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uspg.dao;

import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author morozco
 */
public interface CRUD<T> {
     List<T> listarTodos() throws Exception;
    T getPorId(int id) throws Exception;
    void registrar(T t) throws Exception;
    void actualizar(T t) throws Exception;
    void eliminar(int id) throws Exception;
}
