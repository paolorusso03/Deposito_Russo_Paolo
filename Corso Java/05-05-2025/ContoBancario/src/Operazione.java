import java.util.Scanner;

public class Operazione {
    public static void main(String[] args) throws Exception {

        int saldo=0;
        int uscita;
        
        Scanner scanner=new Scanner(System.in);
        //DICHIARO UN OGGETTO DI TIPO CONTO
        Conto conto=new Conto(saldo);

        //FACCIO SCEGLIERE ALL'UTENTE L'OPERAZIONE DA EFFETTUARE
        System.out.println("Benvenuto nella nostra banca, quale operazione desidera effettuare?");
        
        //CREO UN CICLO CHE SI CHIUDE SOLO IN CASO DI USCITA DALL'OPERAZIONE
        do{
        System.out.println("1. Visualizza saldo\n2. Prelievo\n3. Deposito saldo");
        
        int scelta=scanner.nextInt();

        //CREO UNO SWICTH PER LE SCELTE
        switch (scelta){
            
            case 1: //CASO DI VISUALIZZAZINE SALDO

                    if(saldo!=0){
                        System.out.println("Saldo attuale: "+conto.getSaldo());
                    }else{
                        System.out.println("Effettua un deposito per visualizzare il saldo");
                    }
                    break;
            
            case 2: //CASO DI PRELIEVO

                    System.out.println("Quanto desideri prelevare?");
                    int prelievo=scanner.nextInt();
                    conto.effettuaPrelievo(prelievo);
                    System.out.println("Saldo attuale: "+conto.getSaldo());
                    
                    break;
            
            case 3: //CASO DI DEPOSITO

                    System.out.println("Quanto desideri depositare?");
                    int deposito=scanner.nextInt();
                    conto.effettuaDeposito(deposito);
                    System.out.println("Saldo attuale: "+conto.getSaldo());
                    
                    break;

            default: //CASO DI SCELTA ERRATA

                    System.out.println("Scelta non consentita");

                    break;
        }
      
        //QUESTA DOMANDA SERVE PER ESEGUIRE ALTRE OPERAZIONI O USCIRE DALL'ATM
        System.out.println("Digita 1 per effettuare altre operazioni\nDigita 2 per uscire");
        uscita=scanner.nextInt();  

    }while(uscita==1);

        scanner.close();   

    }
}

