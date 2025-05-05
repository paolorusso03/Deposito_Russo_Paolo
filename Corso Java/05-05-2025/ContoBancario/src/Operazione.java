import java.util.Scanner;

public class Operazione {
    public static void main(String[] args) throws Exception {

        int saldo=0;
        int uscita;
        
        Scanner scanner=new Scanner(System.in);
        Conto conto=new Conto(saldo);

        System.out.println("Benvenuto nella nostra banca, quale operazione desidera effettuare?");
        
        do{
        System.out.println("1. Visualizza saldo\n2. Prelievo\n3. Deposito saldo");
        
        int scelta=scanner.nextInt();

        switch (scelta){
            
            case 1:

                    if(saldo!=0){
                        System.out.println("Saldo attuale: "+conto.getSaldo());
                    }else{
                        System.out.println("Effettua un deposito per visualizzare il saldo");
                    }
                    break;
            
            case 2: 

                    System.out.println("Quanto desideri prelevare?");
                    int prelievo=scanner.nextInt();
                    conto.effettuaPrelievo(prelievo);
                    System.out.println("Saldo attuale: "+conto.getSaldo());
                    
                    break;
            
            case 3:

                    System.out.println("Quanto desideri depositare?");
                    int deposito=scanner.nextInt();
                    conto.effettuaDeposito(deposito);
                    System.out.println("Saldo attuale: "+conto.getSaldo());
                    
                    break;

            default:

                    System.out.println("Scelta non consentita");

                    break;
        }
      
        System.out.println("Digita 1 per effettuare altre operazioni\nDigita 2 per uscire");
        uscita=scanner.nextInt();  

    }while(uscita==1);

        scanner.close();   

    }
}

