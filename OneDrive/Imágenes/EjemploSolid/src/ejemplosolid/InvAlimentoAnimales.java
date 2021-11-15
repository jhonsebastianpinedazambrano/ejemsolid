package ejemplosolid;

public class InvAlimentoAnimales extends Inventario {

    public InvAlimentoAnimales(EjemO producto) {
        super(producto);
    }

    public double calcularProducto() {
        double nPrecio = producto.getPrecio();
        producto.setPrecio(nPrecio);
        return producto.getPrecio();
    }

}
