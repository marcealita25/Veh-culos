public class Coche extends Vehiculos {
    private int numPuertas;
    private boolean tieneAireAcondicionado;
    
    
    public Coche(String marca, String modelo, int anio, double velocidadMaxima, String tipo, int numPuertas,
            boolean tieneAireAcondicionado) {
        super(marca, modelo, anio, velocidadMaxima, tipo);
        this.numPuertas = numPuertas;
        this.tieneAireAcondicionado = tieneAireAcondicionado;
    }


    public int getNumPuertas() {
        return numPuertas;
    }


    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }


    public boolean isTieneAireAcondicionado() {
        return tieneAireAcondicionado;
    }


    public void setTieneAireAcondicionado(boolean tieneAireAcondicionado) {
        this.tieneAireAcondicionado = tieneAireAcondicionado;
    }
    
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("Numero de puertas:" + numPuertas );
        System.out.println("Tiene aire acondicionado:" + tieneAireAcondicionado );
    }


    @Override
    public String toString() {
        return "Coche [numPuertas=" + numPuertas + ", tieneAireAcondicionado=" + tieneAireAcondicionado
                + ", toString()=" + super.toString() + "]";
    }


    @Override
    public double calcularImpuesto() {
        
       double impuesto = super.calcularImpuesto();

       impuesto += 0.05;
       impuesto = 200 * impuesto;
        
        return impuesto;

    }


    

   
    

}
