import java.util.NoSuchElementException;

public class App {
    public static void main(String[] args) throws Exception {
        
        try{
        //CREO OGGETTO DI TIPO AUTOMOBILE PER USUFRUIRE DEL METODO CALCOLAVELOCITA' DELLA CLASSE ASTRATTA VEICOLO
        Automobile auto1=new Automobile();
        auto1.calcolaVelocità();

        //CREO OGGETTO DI TIPO CERCHIO PER USUFRUIRE DEL METODO CALCOLAAREA DELLA CLASSE ASTRATTA FORMA
        Cerchio cerchio=new Cerchio();
        cerchio.setRaggio();
        cerchio.calcolaArea();
        cerchio.chiudiScanner();

        }catch(NoSuchElementException e){
            System.out.println("Input non valido");
        };
    }
}
