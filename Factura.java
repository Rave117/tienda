package Mode;

import java.time.LocalDate;
import java.util.List;

public class Factura {
    public Cliente cliente;
    public String codigo;
    public LocalDate fecha;
    public double total;
    public List<Producto> listaProductos;
    public Factura(String codigo, LocalDate fecha, double total,List<Producto> listaProductos, Cliente cliente) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.total = total;
        this.listaProductos = listaProductos;
        this.cliente = cliente;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public LocalDate getFecha() {
        return fecha;
    }
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    public double getTotal() {
        return total;
    }
    public void setTotal(double total) {
        this.total = total;
    }
    public List<Producto> getListaProductos() {
        return listaProductos;
    }
    public void setListaProductos(List<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public void agregarProducto(Producto producto){
        listaProductos.add(producto);
    }

    public double calcularTotal() {
        double total = 0;
        for (Producto producto : listaProductos) {
            total += producto.getPrecio();
        }
        return total;
    }

}
