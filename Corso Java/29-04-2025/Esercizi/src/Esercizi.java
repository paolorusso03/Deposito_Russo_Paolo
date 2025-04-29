import java.util.Scanner;

public class Esercizi {
    public static void main(String[] args) throws Exception{

        //ESERCIZIO 1

        //CREO USERNAME E PASSWORD DEFINITI
        String username="admin";
        String password="12345";

        Scanner scanner=new Scanner(System.in);

        //CHIEDO USERNAME E PASSWORD ALL'UTENTE
        System.out.println("Inserisci username");
        String usernameUtente=scanner.nextLine();
        System.out.println("Inserisci password");
        String passwordUtente=scanner.nextLine();

        //SE USERNAME E PASSWORD COINCIDONO, CONCEDE L'ACCESSO, ALTRIMENTI NO
        if(usernameUtente.equals(username)&&passwordUtente.equals(password)){
            System.out.println("Accesso consentito");
        }else{
            System.out.println("Username o password errati");
        }


        System.out.println(" ");
        
        //ESERCIZIO 2

        //CREO UN VALORE PREFISSATO
        int valorePrefissato=7;

        Scanner scanner2=new Scanner(System.in);

        //CHIEDO ALL'UTENTE DI INSERIRE UN VALORE DA 1 A 10
        System.out.println("Inserisci un valore da 1 a 10");
        int valoreUtente=scanner2.nextInt();

        //SE IL VALORE E' GIUSTO, PARTE L'IF, SE E' SBAGLIATO E MAGGIORE PARTE L'ESLE IF, SE E' SBAGLIATO E MINORE PARTE L'ELSE
        if(valoreUtente==valorePrefissato){
            System.out.println("Complimenti! Hai indovinato");
        }else if(valoreUtente>valorePrefissato){
            System.out.println("Il numero scelto è maggiore! Ritenta, sarai più fortunato");
        }else{
            System.out.println("Il numero scelto è minore! Ritenta sarai più fortunato");
        }

        //CHIUDO ENTRAMBI GLI SCANNER
        scanner.close();
        scanner2.close();
    }
}

