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
 * @author Sebastián
 */
public class EjemploO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Inventario> productos = new ArrayList<Inventario>();

        productos.add(new InvAlimentoAnimales(new EjemO("Pedigree ",1,12000.0)));
        productos.add(new InvAlimentoAnimales(new EjemO("Mirringo ",2,10000.0)));
        productos.add(new InvAlimentoAnimales(new EjemO("Vitacanario ",1,5000.)));
        productos.add(new InvAlimentoAnimales(new EjemO("Tetracolor ",1,2500.0)));
        
        
        Tienda tienda = new Tienda(productos);
        tienda.calcularInventario();
        
    }
    
}
