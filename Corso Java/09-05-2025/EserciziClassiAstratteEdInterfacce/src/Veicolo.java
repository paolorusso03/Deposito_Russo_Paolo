import java.util.Scanner;

public abstract class Veicolo {
    
    float spazio;
    float tempo;

    //SVILUPPO IL METODO CALCOLAVELOCITA'
    public void calcolaVelocità(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Distanza percorsa (m): ");
        spazio=scanner.nextFloat();
        System.out.println("Tempo impiegato (s): ");
        tempo=scanner.nextFloat();
        
        //CONVERSIONE IN KM/H
        float velocità=(float)((spazio)/(tempo)*3.6);
        System.out.println("Velocità: "+velocità+" km/h");
        scanner.close();
    }
}