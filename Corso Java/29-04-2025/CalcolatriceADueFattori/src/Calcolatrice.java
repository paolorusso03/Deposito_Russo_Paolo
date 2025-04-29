import java.util.Scanner;

public class Calcolatrice {
    public static void main(String[] args) throws Exception {
        
        boolean condizioneCicloUno=true;

        //CHIEDO DI CREARE USERNAME O PASSWORD ALL'UTENTE
        Scanner scanner=new Scanner(System.in);
        System.out.println("Crea username");
        String usernameNuovo=scanner.nextLine();
        System.out.println("Crea password");
        String passwordNuovo=scanner.nextLine();

        //IL CICLO PARTE E CONTINUA SOLO SE COINCIDONO USERNAME E PASSWORD INSERITI PRIMA
        while(condizioneCicloUno){
        boolean condizioneCicloDue=true;
        System.out.println("Inserisci username");
        String username=scanner.nextLine();
        System.out.println("Inserisci password");
        String password=scanner.nextLine();

        if(username.equals(usernameNuovo) && password.equals(passwordNuovo)){
        do{
            Scanner scanner2=new Scanner(System.in);

            System.out.println("Inserisci il primo valore");
            int valore1=scanner2.nextInt();
            System.out.println("Inserisci il secondo valore");
            int valore2=scanner2.nextInt();
            System.out.println("Il prodotto tra i due numeri è: "+(valore1*valore2));

            System.out.println("Desideri continuare? Rispondi esclusivamente con 'si' o 'no'");
            String risposta=scanner.nextLine();

            if(risposta.equals("no")){
                condizioneCicloDue=false;
            }
        }while(condizioneCicloDue);
    }else{
        System.out.println("Username o password errati");
    }

    //CHIEDO ALL'UTENTE DI MODIFICARE IL PROPRIO USERNAME E PASSWORD (SOLO SE ALLA SCELTA PRECEDENTE VIENE RISPOSTO NO)
    System.out.println("Desideri modificare il tuo username? Rispondi esclusivamente con 'si' o no'");
    String scelta=scanner.nextLine();
    
    //SE ALLA RICHIESTA DI MODIFICA VIENE RISPOSTO NO, IL PROGRAMMA SI ARRESTA
    if(scelta.equals("si")){
        System.out.println("Inserisci il nuovo username");
        String nuovoUsername=scanner.nextLine();
        System.out.println("Inserisci la nuova password");
        String nuovaPassword=scanner.nextLine();

        usernameNuovo=nuovoUsername;
        passwordNuovo=nuovaPassword;
    }else if(scelta.equals("no")){
        condizioneCicloUno=false;
    }
   }   
  }
}
