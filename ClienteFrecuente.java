package Mode;

public class ClienteFrecuente extends Cliente {
    private int puntosFidelidad;
    private double descuento=5;//5%

    public ClienteFrecuente (String nombre, String nit, String telefono) {
        super(nombre, nit, telefono);
        this.puntosFidelidad = puntosFidelidad;
        this.descuento = descuento;
    }
    public int getPuntosFidelidad() {
        return puntosFidelidad;
    }
    public void setPuntosFidelidad(int puntosFidelidad) {
        this.puntosFidelidad = puntosFidelidad;
    }
    public double getDescuento() {
        return descuento;
    }
    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
    @Override
    public double calcularDescuento(double total){
        return (descuento/100)*total;
    }
}
