package ejemplosolid;

public abstract class MensjPrincipal {

    protected String mensaje;

    public MensjPrincipal(String mensaje) {
        this.mensaje = mensaje;
    }

    // Lo creamos como metodo abstracto para que cada clase lo implemente
    public abstract void muestra();
}
