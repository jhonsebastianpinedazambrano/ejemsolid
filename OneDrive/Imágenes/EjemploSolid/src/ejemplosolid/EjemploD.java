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
public class EjemploD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Almacen almacen = new Almacen();
        double total = 0;

        almacen.adicionaProducto(new Productos("Tomate",0, 600.0));
        almacen.adicionaProducto(new Productos("Banana",0, 400.0));
        almacen.adicionaProducto(new Productos("Analgesico",1, 23.80));
        almacen.adicionaProducto(new Productos("Jeans", 2, 450.99));
        almacen.adicionaProducto(new Productos("Manzana", 0, 1000.0));
        almacen.adicionaProducto(new Productos("Antiacido", 1, 3500.00));
        almacen.adicionaProducto(new Productos("Blusa", 2, 45000.00));

        System.out.println("---------------------------------");

        Auditorias auditorias = new Auditorias(almacen);
        total = auditorias.totalProductos();
        
        System.out.println("---------------------------------");

        System.out.println("Total de Alimentos : $" + total);
    }
}
