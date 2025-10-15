package Mode;

import java.time.LocalDate;

public class ProductoAlimenticio  extends Producto {
    public LocalDate fechaVencimeinto;
    public ProductoAlimenticio(String nombre, String descripcion, String codigoBarra, double precio) {
        super( nombre, descripcion, codigoBarra, precio);
        this.fechaVencimeinto = fechaVencimeinto;
    }

    public LocalDate getFechaVencimeinto() {
        return fechaVencimeinto;
    }
    public void setFechaVencimeinto(LocalDate fechaVencimeinto) {
        this.fechaVencimeinto = fechaVencimeinto;
    }
}
