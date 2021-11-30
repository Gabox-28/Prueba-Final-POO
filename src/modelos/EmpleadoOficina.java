/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author Gabox
 */
public class EmpleadoOficina extends Empleado {

    public EmpleadoOficina() {
    }

    public EmpleadoOficina(int id, String nombre, String apellidos, double salarioBase, double horasExtras) {
        super(id, nombre, apellidos, salarioBase, horasExtras);
    }
    
    @Override
    public String toString() {
        return "Empleado Oficina {" + "ID = " + id + ", Nombre = " + nombre + ", Apellidos = " + apellidos + ", Salario Base = " + salarioBase + ", Horas Extras = " + horasExtras + ", Salario Neto = " + calcularSalarioNeto() +'}';
    }
    
}
