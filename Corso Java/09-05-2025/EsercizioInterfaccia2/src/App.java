import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner=new Scanner (System.in);
        
        //MI FACCIO DARE I VALORI DALL'UTENTE
        System.out.println("Scegli il primo operando: ");
        float a=scanner.nextFloat();

        System.out.println("Scegli il secondo operando: ");
        float b=scanner.nextFloat();

        //ISTANZIO OGGETTO ADDIZIONE, FACCIO LA SOMMA DEI VALORI RIVEVUTI E NE STAMPO A VIDEO IL RISULTATO
        Addizione addizione=new Addizione();

        addizione.stampaRisultato(addizione.numeri(a,b));

        //ISTANZIO OGGETTO DIFFERENZA, FACCIO LA DIFFERENZA DEI VALORI RICEVUTI E NE STAMPO A VIDEO IL RISULTATO
        Differenza differenza=new Differenza();

        differenza.stampaRisultato(differenza.numeri(a,b));

        //ISTANZIO OGGETTO PRODOTTO, FACCIO LA MOLTIPLICAZIONE DEI VALORI RICEVUTI E NE STAMPO A VIDEO IL RISULTATO
        Prodotto prodotto=new Prodotto();

        prodotto.stampaRisultato(prodotto.numeri(a,b));

        //ISTANZIO OGGETTO RAPPORTO, FACCIO LA DIVISIONE DEI VALORI RICEVUTI E NE STAMPO A VIDEO IL RISULTATO
        Rapporto rapporto=new Rapporto();

        rapporto.stampaRisultato(rapporto.numeri(a,b));

        scanner.close();
    }

}
