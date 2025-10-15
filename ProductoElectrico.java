package Mode;

public class ProductoElectrico extends Producto {
    public int garantia;
    public int cantidad;

    public ProductoElectrico(String nombre, String descripcion, String codigoBarra, double precio) {
        super(nombre, descripcion, codigoBarra, precio);
        this.garantia = garantia;
        this.cantidad = cantidad;
    }

    public int getGarantia() {
        return garantia;
    }

    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public double getSubtotal() { return precio * cantidad; }
}

