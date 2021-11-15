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
class Tienda {
    private List<Inventario> productos;

    public Tienda(List<Inventario> productos) {
        this.productos = productos;
    }

    public void calcularInventario(){
        double total = 0;

        for (Inventario producto : productos) {
            producto.calcularProducto();
            System.out.println(producto.toString());
            total += producto.producto.getPrecio();
        }

        System.out.println("Total en inventario es: $" + total);
    }

    
}

