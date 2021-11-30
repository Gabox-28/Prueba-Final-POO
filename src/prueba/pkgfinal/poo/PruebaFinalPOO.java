/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba.pkgfinal.poo;

import dao.DEmpleadoOficina;
import dao.DEmpleadoProduccion;
import modelos.Empleado;
import modelos.EmpleadoOficina;
import modelos.EmpleadoProduccion;

/**
 *
 * @author Gabox
 */
public class PruebaFinalPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        EmpleadoOficina empleOf1 = new EmpleadoOficina(1, "Juan", " Perez", 6000,  500);
        EmpleadoOficina empleOf2 = new EmpleadoOficina(2, "Alberto", " Gonzales", 9000,  800);
        EmpleadoOficina empleOf3 = new EmpleadoOficina(3, "Carlos", " Rivera", 4000,  200);
        DEmpleadoOficina office = new DEmpleadoOficina();
        
        office.agregarRegistro(empleOf1);
        office.agregarRegistro(empleOf2);
        office.agregarRegistro(empleOf3);
        
        office.mostrarRegistro();
        
        
        EmpleadoProduccion emplePro1 = new EmpleadoProduccion(1, "Marcos", "Rosas", 14000,  1000, 2000);
        EmpleadoProduccion emplePro2 = new EmpleadoProduccion(2, "Daniel", "Hernandez", 18000,  3000, 5600);
        EmpleadoProduccion emplePro3 = new EmpleadoProduccion(3, "Antonio", "Martinez", 15000,  4000, 7600);
        DEmpleadoProduccion pro = new DEmpleadoProduccion();
        
        pro.agregarRegistro(emplePro1);
        pro.agregarRegistro(emplePro2);
        pro.agregarRegistro(emplePro3);
        
        pro.mostrarRegistro();
    }
    
}
