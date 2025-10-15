package Mode;

public abstract class Cliente {
    private String nombre;
    private String nit;
    private String telefono;

    public Cliente(String nombre, String nit, String telefono) {
        if (nit == null || nit.isEmpty() || nombre == null || nombre.isEmpty()){
            throw new IllegalArgumentException("El nombre del cliente es obligatorio");
        }
        this.nombre = nombre;
        this.nit = nit;
        this.telefono = telefono;
    }
    public String getNombre() {
        return nombre;
    }
    public String getNit() {
        return nit;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setNit(String nit) {
        this.nit = nit;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public abstract double calcularDescuento(double total);

    public static Cliente registrarCliente(String nit, String nombre, String telefono) {
        switch (nit) {
            case "corporativo":

               return new ClienteCorporativo(nit,nombre,telefono);

            case "frecuente":
                ClienteFrecuente clienteFrecuente=new ClienteFrecuente(nit,nombre,telefono);
                return clienteFrecuente;

            default:
                System.out.println("⚠️ Tipo no reconocido, se registrará como cliente frecuente.");
                return new ClienteFrecuente(nit, nombre, telefono);
        }
    }
}
