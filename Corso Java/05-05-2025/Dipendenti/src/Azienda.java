import java.util.Scanner;

public class Azienda {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner=new Scanner(System.in);
        Scanner scanner2=new Scanner(System.in);

        System.out.println("Inserisci nome del dipendente: ");
        String nome=scanner.nextLine();

        System.out.println("Inserisci cognome del dipendente: ");
        String cognome=scanner.nextLine();

        System.out.println("Inserisci stipendio del dipendente: ");
        double stipendio=scanner2.nextDouble();

        Dipendente dipendente=new Dipendente(nome,cognome,stipendio);

        System.out.println("Vuoi aumentare lo stipendio del 10%, 20%, o 30%? ");
        int percentuale=scanner2.nextInt();

        dipendente.calcoloPercentuale(percentuale);

        scanner.close();
        scanner2.close();
    }
}
