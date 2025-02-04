public class Camion extends Vehiculos{
    private double capacidadCarga;
    private  int numerosEjes;
    public double getCapacidadCarga() {
        return capacidadCarga;
    }
    
    public Camion(String marca, String modelo, int anio, double velocidadMaxima, String tipo, double capacidadCarga,
            int numerosEjes) {
        super(marca, modelo, anio, velocidadMaxima, tipo);
        this.capacidadCarga = capacidadCarga;
        this.numerosEjes = numerosEjes;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }
    public int getNumerosEjes() {
        return numerosEjes;
    }
    public void setNumerosEjes(int numerosEjes) {
        this.numerosEjes = numerosEjes;
    }


    

    
    @Override
    public String toString() {
        return "Camion [capacidadCarga=" + capacidadCarga + ", numerosEjes=" + numerosEjes + ", toString()="
                + super.toString() + "]";
    }

    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("capacidad de carga" + capacidadCarga + "Toneladas");
        System.out.println("Numero de ejes" + numerosEjes);


    }
}
