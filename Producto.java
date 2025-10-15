package Mode;

import java.time.LocalDate;

public abstract class Producto {
    public String nombre;
    public String descripcion;
    public String codigoBarra;
    public double precio;

    public Producto(String nombre, String descripcion, String codigoBarra, double precio) {
        if(codigoBarra.isBlank() || nombre.isBlank() || precio<0){
            throw new IllegalArgumentException(" bro no sea bobo el producto no se puede mank");
        }
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.codigoBarra = codigoBarra;
        this.precio = precio;
    }
    public String getNombre() {
        return nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public String getCodigoBarra() {
        return codigoBarra;
    }
    public double getPrecio() {
        return precio;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public void setCodigoBarra(String codigoBarra) {
        this.codigoBarra = codigoBarra;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public static Producto registrarProducto( String nombre, String descripcion,String codigoBarra,double precio) {
        nombre =nombre.toLowerCase();
        switch (nombre) {
            case "alimentacion":
                return new ProductoAlimenticio(nombre,descripcion,codigoBarra,precio);

            case "electrico":
                return new ProductoElectrico(nombre,descripcion,codigoBarra,precio);


            default:
                System.out.println("⚠️ Tipo no reconocido, se registrará como cliente frecuente.");
                return new Producto(nombre,descripcion,codigoBarra,precio) {
                };
        }
    }
}

