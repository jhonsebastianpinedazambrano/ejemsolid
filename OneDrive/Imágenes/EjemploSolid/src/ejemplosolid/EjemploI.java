/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosolid;


public class EjemploI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Avanzado avanzado = new Avanzado();
        avanzado.escanear();
        avanzado.faxear();
        avanzado.imprimir();
        avanzado.telefono();

        System.out.println("--------------------");

        EjemI fax = new EjemI();
        fax.telefono();
        fax.faxear();

        System.out.println("--------------------");

        Sencillo sencillo = new Sencillo();
        sencillo.escanear();
        sencillo.imprimir();

    }
    
}
