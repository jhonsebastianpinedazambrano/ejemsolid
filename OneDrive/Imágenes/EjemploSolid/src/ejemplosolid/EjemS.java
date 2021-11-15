/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosolid;

/**
 *
 * @author Sebastián
 */
public class EjemS {

    private String nombre;
    private String puesto;
    private int edad;
    private double sueldo;

    public EjemS(String nombre, String puesto, int edad, double sueldo) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.edad = edad;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", puesto='" + puesto + '\'' +
                ", edad=" + edad +
                ", sueldo=" + sueldo +
                '}';
    }
}

