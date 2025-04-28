import java.util.Scanner;

public class ProvaScanner {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner=new Scanner(System.in);//CREO UN OGGETTO DI TIPO SCANNER
        System.out.println("Inserisci username");
        String username=scanner.nextLine();//IMMETTO NELLA VARIABILE USERNAME QUELLO CHE L'UTENTE MI SCRIVE DA TASTIERA
        System.out.println("Il tuo username è: "+username);//STAMPO A VIDEO LA FRASE, SEGUITA DALL'INPUT RICEVUTO DALL'UTENTE

        Scanner scannerNumero=new Scanner(System.in);//CREO UN ALTRO OGGETTO DI TIPO SCANNER
        System.out.println("Inserisci un numero");
        int numero=scanner.nextInt();//CHIEDO ALL'UTENTE DI INSERIRE UN NUMERO DA TASTIERA
        System.out.println("Il numero da te scelto è: "+numero);//STAMPO A VIDEO IL NUMERO RICHIESTO
        
        scanner.close();//CHIUDO LO SCANNER PER L'USERNAME
        scannerNumero.close();//CHIUDO LO SCANNER PER L'ETA'       
    }
}
