/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosolid;

import java.util.List;

/**
 *
 * @author Sebastián
 */
public class EjemO {
        
    private String nombre;
    private Integer categoria;
    private Double precio;

    public EjemO(String nombre, int categoria, double precio) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCategoria() {
        return categoria;
    }

    public void setCategoria(Integer categoria) {
        this.categoria = categoria;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "" +
                "Nombre del Producto: " + nombre + '\'' +
                "Precio del Producto: $" + precio ;
    }
    
}
