import java.util.Scanner;

public class Numeri {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner=new Scanner(System.in);

        //CHIEDO ALL'UTENTE DUE NUMERI E NE FACCIO LA SOMMA, IL PRODOTTO, IL MODULO DELLA SOMMA, IL MASSIMO TRA I DUE
        System.out.println("Inserisci il primo valore intero");
        int somma1=scanner.nextInt();
        System.out.println("Inserisci il secondo valore intero");
        int somma2=scanner.nextInt();
        System.out.println("Somma: "+(somma1+somma2));
        System.out.println("Prodotto: "+(somma1*somma2));
        System.out.println("Modulo della somma: "+((somma1+somma2)%2));
        System.out.println("Il massimo tra i due è: "+(Math.max(somma1,somma2)));

        //CHIEDO ALL'UTENTE DUE NUMERI DECIMALI E NE FACCIO LA DIFFERENZA, LA DIVISIONE, LA RADICE QUADRATA DELLA DIVISIONE, IL MINIMO TRA I DUE
        System.out.println("Inserisci il primo valore (con la virgola)");
        double differenza1=scanner.nextDouble();
        System.out.println("Inserisci il secondo valore(con la virgola)");
        double differenza2=scanner.nextDouble();
        System.out.println("Differenza: "+(differenza1-differenza2));
        System.out.println("Divisione: "+(differenza1/differenza2));
        System.out.println("Radice quadrata della divisione: "+(Math.sqrt(differenza1/differenza2)));
        System.out.println("Il minimo tra i due è: "+(Math.min(differenza1,differenza2)));

        //GENERO UN NUMERO CASUALE DA 1 A 100 E STAMPO A VIDEO IL RISULTATO
        System.out.println("Numero casuale generato: "+(int)((Math.random()*100)+1));
    }
}
