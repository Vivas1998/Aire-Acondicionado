
/**
 * Write a description of class AireAcondicionado here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AireAcondicionado
{
    // instance variables - replace the example below with your own
    private double temperatura;
    private double min;
    private double max;
    private double incremento;
    private int cambiosTemperatura;
    private double valorMaximo;
    private double valorMinimo;

    /**
     * Constructor for objects of class AireAcondicionado
     */
    public AireAcondicionado(double temperaturaMin, double temperaturaMax)
    {
        // initialise instance variables
        temperatura = 15.0;
        incremento = 5.0;
        min = temperaturaMin;
        max = temperaturaMax;
        cambiosTemperatura = 0;
        valorMaximo = temperatura;
        valorMinimo = temperatura;
    }

    //Subir temperatura
    public void subirTemperatura() {
        if ((temperatura + incremento) <= max) {
            temperatura = temperatura + incremento;
        }
        else {
            System.out.println("Temperatura maxima alcanzada");
        }
        cambiosTemperatura = cambiosTemperatura + 1;
        if (temperatura > valorMaximo) {
            valorMaximo = temperatura;
        }
    }
    
    //Bajar Temperatura
    public void bajarTemperatura() {
        if ((temperatura - incremento) >= min) {
            temperatura = temperatura - incremento;
        }
        else {
            System.out.println("Temperatura minima alcanzada");
        }
        cambiosTemperatura = cambiosTemperatura + 1;
        if (temperatura < valorMinimo) {
            valorMinimo = temperatura;
        }
    }
    
    //Devuelve la temperatura
    public double getTemperatura() {
        return temperatura;
    }
    
    //Indica el incremento
    public void setIncremento(double aumentarIncremento) {
        if (aumentarIncremento > 0) {
            incremento = incremento + aumentarIncremento;
        }
        else {
            System.out.println("No se permiten incrementos negativos");
        }
    }
    
    //Imprime por pantalla las estadisticas
    public void mostrarEstadisticas() {
        String detalles = getEstadisticas();
        System.out.println(detalles);
    }
    
    //Devuelve las estadisticas
    public String getEstadisticas() {
        String detallesEstadisticas = ("Temperatura actual: " + temperatura + ", la temperatura maxima posible: " + max + ", temperatura minima posible: " + min + ", temperatura maxima seleccionada: " + valorMaximo + ", temperatura minima seleccionada: " + valorMinimo + ", temperatura cambiada " + cambiosTemperatura + " veces");
        return detallesEstadisticas;
    }
}
