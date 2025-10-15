package Mode;

public class ProductoElectrico extends Producto {
    public int garantia;

    public ProductoElectrico(String nombre, String descripcion, String codigoBarra, double precio) {
        super(nombre, descripcion, codigoBarra, precio);
        this.garantia = garantia;
    }

    public int getGarantia() {
        return garantia;
    }

    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }
}
