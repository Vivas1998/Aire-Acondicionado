
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

    /**
     * Constructor for objects of class AireAcondicionado
     */
    public AireAcondicionado()
    {
        // initialise instance variables
        temperatura = 15.0;
    }

    //Subir temperatura
    public void subirTemperatura() {
        temperatura = temperatura + 5.0;
    }
    
    //Bajar Temperatura
    public void bajarTemperatura() {
        temperatura = temperatura - 5.0;
    }
    
    public double getTemperatura() {
        return temperatura;
    }
}
