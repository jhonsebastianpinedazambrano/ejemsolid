package ejemplosolid;

public abstract class Inventario {

    protected EjemO producto;

    public Inventario(EjemO producto) {
        this.producto = producto;
    }

    public EjemO getProducto() {
        return producto;
    }

    public void setProducto(EjemO producto) {
        this.producto = producto;
    }

    @Override
    public String toString() {
        return producto.toString();
    }

    public abstract double calcularProducto();
}
