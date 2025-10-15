package Mode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Empresa {
    public String nit;
    public String nombre;
    public String direccion;
    public List<Producto> listaProductos;
    public List<Cliente>listaClientes;
    public List<Factura> listaFacturas;

    public Empresa(String nit, String nombre, String direccion) {
        if( nombre == null || nombre. isEmpty() || nit == null || nit.isEmpty()){
            throw new IllegalArgumentException("Nombre del empresa no puede ser vacio");
        }
        this.nit = nit;
        this.nombre = nombre;
        this.direccion = direccion;
        this.listaProductos = new LinkedList<>();
        this.listaClientes= new ArrayList<>();
        this.listaFacturas= new ArrayList<>();

    }
}
