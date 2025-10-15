package Mode;

import java.time.LocalDate;

public class ProductoAlimenticio  extends Producto {
    public LocalDate fechaVencimeinto;
    public int cantidad;
    public ProductoAlimenticio(String nombre, String descripcion, String codigoBarra, double precio) {
        super( nombre, descripcion, codigoBarra, precio);
        this.fechaVencimeinto = fechaVencimeinto;
        this.cantidad = cantidad;
    }

    public LocalDate getFechaVencimeinto() {
        return fechaVencimeinto;
    }
    public void setFechaVencimeinto(LocalDate fechaVencimeinto) {
        this.fechaVencimeinto = fechaVencimeinto;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getSubtotal() { return precio * cantidad; }
}

