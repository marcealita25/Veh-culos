public class Motocicleta extends Vehiculos {
    private boolean tieneSidecar;
    private  int  cilindrada;

    
    public Motocicleta(String marca, String modelo, int anio, double velocidadMaxima, String tipo, boolean tieneSidecar,
            int cilindrada) {
        super(marca, modelo, anio, velocidadMaxima, tipo);
        this.tieneSidecar = tieneSidecar;
        this.cilindrada = cilindrada;
    }


    public boolean isTieneSidecar() {
        return tieneSidecar;
    }


    public void setTieneSidecar(boolean tieneSidecar) {
        this.tieneSidecar = tieneSidecar;
    }


    public int getCilindrada() {
        return cilindrada;
    }


    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }


    @Override
    public String toString() {
        return "Motocicleta [tieneSidecar=" + tieneSidecar + ", cilindrada=" + cilindrada + ", toString()="
                + super.toString() + "]";
    }


    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("Tiene sidecar" + (tieneSidecar? "Sí" : "No"));        
        System.out.println("Tiene cilindrada" + cilindrada);


    }



}
