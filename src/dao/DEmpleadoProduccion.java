/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import interfaces.IOperaciones;
import java.util.ArrayList;
import modelos.EmpleadoProduccion;


/**
 *
 * @author Gabox
 */
public class DEmpleadoProduccion implements IOperaciones{
    public ArrayList<EmpleadoProduccion> lista = new ArrayList();

    @Override
    public void agregarRegistro(Object registro) {
       lista.add((EmpleadoProduccion) registro); 
    }
    
    public void agregarRegistro(int id, String nombre, String apellidos, double salarioBase, double horasExtras, double bono){
        lista.add(new EmpleadoProduccion(id, nombre, apellidos, salarioBase, horasExtras, bono));
    }

    @Override
    public void mostrarRegistro() {
       for(EmpleadoProduccion p: lista){
            System.out.println(p.toString());
        }
        
    }
    
}
