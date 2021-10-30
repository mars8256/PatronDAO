/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uspg;

import edu.uspg.dao.CarreraDAO;
import edu.uspg.dao.PersonaDAO;
import edu.uspg.impl.CarreraDAOImpl;
import edu.uspg.impl.PersonaDAOImpl;
import edu.uspg.model.Carrera;
import edu.uspg.model.Persona;

/**
 *
 * @author morozco
 */
public class PatronDAO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PersonaDAO dao = new PersonaDAOImpl();
        CarreraDAO cardao = new CarreraDAOImpl();
        
        Carrera car = new Carrera();
        car.setId(1);
        car.setNombre("ITEC");
        
        Carrera car1 = new Carrera();
        car1.setId(2);
        car1.setNombre("ISIS");
        
        cardao.registrar(car);
        cardao.registrar(car1);
        
        Persona per = new Persona();
        per.setId(1);
        per.setNombres("Carlos");
        
        Persona per1 = new Persona();
        per1.setId(2);
        per1.setNombres("Mario");
        
        dao.registrar(per);
        dao.registrar(per1);
        
        dao.listarTodos().forEach(x -> System.out.println(x.getNombres()));
        cardao.listarTodos().forEach(x -> System.out.println(x.getNombre()));
        
    }
    
}
