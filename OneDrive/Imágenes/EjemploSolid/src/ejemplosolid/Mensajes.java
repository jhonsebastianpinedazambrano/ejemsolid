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
public class Mensajes extends MensjPrincipal{
    
    public Mensajes(String mensaje) {
        super(mensaje);
    }

    public void muestra() {
        System.out.println("Chat principal: " + mensaje);
    }
    
}
