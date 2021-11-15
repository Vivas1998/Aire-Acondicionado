
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
    }

    //Subir temperatura
    public void subirTemperatura() {
        if ((temperatura + incremento) <= max) {
            temperatura = temperatura + incremento;
        }
        else {
            System.out.println("Temperatura maxima alcanzada");
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
}
