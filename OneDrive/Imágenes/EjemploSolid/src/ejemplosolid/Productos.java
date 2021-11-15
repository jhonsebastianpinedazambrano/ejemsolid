/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosolid;

/**
 *
 * @author cesar
 */
public class Productos {
    private String nombre;
    private Integer tipo;
    private Double precio;

    public Productos(String nombre, Integer tipo, Double precio) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getTipo() {
        return tipo;
    }

    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        String tipoString = "";
        if (tipo == 1 ){
            tipoString = "Alimento";
        } else if (tipo == 2){
            tipoString = "Medicina";
        } else if (tipo == 3) {
            tipoString = "Ropa";
        }
        return "" +
                "Producto : " + nombre +
                " tipo : "    + tipoString +
                " cuesta : "  + precio ;
    }

}

