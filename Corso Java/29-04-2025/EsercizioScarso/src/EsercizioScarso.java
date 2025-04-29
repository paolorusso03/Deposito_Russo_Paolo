import java.util.Scanner;

public class EsercizioScarso {
    public static void main(String[] args) throws Exception {
        
        //CHIEDO ALL'UTENTE DUE VALORI IN INGRESSO
        Scanner scanner=new Scanner(System.in);
        System.out.println("Inserisci il primo numero");
        int primoNumero=scanner.nextInt();
        System.out.println("Inserisci il secondo numero");
        int secondoNumero=scanner.nextInt();

        //EFFETTUO E STAMPO A VIDEO SOMMA, DIFFERENZA, PRODOTTO
        System.out.println("Somma tra i due numeri: "+(primoNumero+secondoNumero));
        System.out.println("Differenza tra i due numeri: "+(primoNumero-secondoNumero));
        System.out.println("Prodotto tra i due numeri: "+(primoNumero*secondoNumero));

        scanner.close();
    }
}
