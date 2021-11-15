/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosolid;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cesar
 */
public class Almacen implements Resultado {
    
     private List<Productos> inventario;

    public Almacen() {
        this.inventario = new ArrayList<>();
    }

    public void adicionaProducto(Productos producto) {
        inventario.add(producto);
        System.out.println("Agregamos: " + producto.getNombre());
    }
    
    public Iterable<Productos> obtenerProductos(int tipo) {
        List<Productos> encontrados = new ArrayList<>();
        for (Productos producto : inventario){
            if (producto.getTipo() == tipo){
                encontrados.add(producto);
            }
        }
        return encontrados;
    }
}

