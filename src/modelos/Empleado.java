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
public class Empleado {
    
    protected int id;
    protected String nombre;
    protected String apellidos;
    protected double salarioBase;
    protected double horasExtras;

    public Empleado() {
    }

    public Empleado(int id, String nombre, String apellidos, double salarioBase, double horasExtras) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.salarioBase = salarioBase;
        this.horasExtras = horasExtras;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(double horasExtras) {
        this.horasExtras = horasExtras;
    }
    
    public double calcularSalarioBruto(){
        double salarioBruto;
        salarioBruto = salarioBase + horasExtras;
        return salarioBruto;
    }
    
    public float calcularSalarioNeto(){
        float salarioNeto;
        salarioNeto = (float) (calcularSalarioBruto() - calcularSeguro());
        return salarioNeto;
    }
    
    public double calcularSeguro(){
        double seguro;
        seguro = calcularSalarioBruto() * 0.07;
        return seguro;
        
    }
    
}
