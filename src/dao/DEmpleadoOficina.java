/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import interfaces.IOperaciones;
import java.util.ArrayList;
import modelos.EmpleadoOficina;

/**
 *
 * @author Gabox
 */
public class DEmpleadoOficina implements IOperaciones {
    public ArrayList <EmpleadoOficina> lista = new ArrayList();

    @Override
    public void agregarRegistro(Object registro) {
        lista.add((EmpleadoOficina) registro);
        
    }
    
    public void agregarRegistro(int id, String nombre, String apellidos, double salarioBase, double horasExtras){
        lista.add(new EmpleadoOficina(id, nombre, apellidos, salarioBase, horasExtras));
    }

    @Override
    public void mostrarRegistro() {
        for(EmpleadoOficina p: lista){
            System.out.println(p.toString());
        }
    }
    
}
