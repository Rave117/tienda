package Mode;

public class ClienteCorporativo extends Cliente{
    private int nitE;
    public double porcentajeDescuento=10;//10%
    public ClienteCorporativo(String nombre, String nit, String telefono) {
        super(nombre, nit, telefono);
        this.nitE = nitE;
        this.porcentajeDescuento = porcentajeDescuento;
    }

    @Override
   public double calcularDescuento(double total){
        return (porcentajeDescuento/10)*total;
   }
   public int getNitE() {
        return nitE;
   }
   public void setNitE(int nitE) {
        this.nitE = nitE;
   }
   public double getPorcentajeDescuento() {
        return porcentajeDescuento;
   }
   public void setPorcentajeDescuento(double porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
   }
}
