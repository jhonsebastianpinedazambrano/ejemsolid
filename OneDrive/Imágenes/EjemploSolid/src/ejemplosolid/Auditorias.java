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
public class Auditorias {
     private Resultado almacen;

    
    public Auditorias(Resultado almacen) {
        this.almacen = almacen;
    }

    public double totalProductos() {
        double total = 0;
        int tipoProducto = 0; 
        
        Iterable<Productos> listado = almacen.obtenerProductos(tipoProducto);

        for (Productos producto : listado){
                System.out.println(producto.toString());
                total += producto.getPrecio();
        }
        return total;
    }
}


