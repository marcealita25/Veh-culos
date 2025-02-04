import java.time.LocalDate;

public class Vehiculos {
    private String marca;
    private String modelo;
    private  int anio;
    private   double velocidadMaxima;
    private String tipo; //Diesel, Gasolina, Electrico, Hibrido
    
    
    public Vehiculos(String marca, String modelo, int anio, double velocidadMaxima, String tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.velocidadMaxima = velocidadMaxima;
        this.tipo = tipo;
    }
    
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getAnio() {
        return anio;
    }
    public void setAnio(int anio) {
        this.anio = anio;
    }
    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }
    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    


    @Override
    public String toString() {
        return "Vehiculos [marca=" + marca + ", modelo=" + modelo + ", anio=" + anio + ", velocidadMaxima="
                + velocidadMaxima + ", tipo=" + tipo + ", toString()=" + super.toString() + "]";
    }

    public void mostrarInformacion(){

        System.out.println(toString());
    }
        
    
        
    

            
    public double calcularImpuesto(){
        double impuestoBase = 200;
        double impuesto = 0;
        int anioActual = LocalDate.now().getYear();

        if (anioActual-anio > 20){
            impuesto = 0.1;
        }else if (anioActual-anio >10){
            impuesto= 0.05;

        }

        
       

        // tipo de combustible
        if (tipo.equals("Diesel")  tipo.equals("Gasolina")){
            impuesto += 0.1;

        }else if (tipo.equals("Hibrido")){
            impuesto - = 0.5


        }else if (tipo.equals("Electrico")){

        }
           


        

        
        

          
    }
    
}
