import java.util.Scanner;

public class ProvaCicli {
    public static void main(String[] args) throws Exception {
        
        int i=0;
        int j=0;

        //ESEMPIO CICLO WHILE
        while(i<=5){
            i++;
            System.out.println(i);
        }

        //ESEMPIO CICLO DO-WHILE
        do{
            System.out.println(j);
            j++;
        }while(j<5);

        //CLICLO BOOLEANO  
        boolean condizione=true;
        Scanner scanner=new Scanner(System.in);
        Scanner scanner2=new Scanner(System.in);

        while(condizione){
            System.out.println("Digita un numero");
            int valore=scanner.nextInt();
            System.out.println("Valore digitato: "+valore);

            System.out.println("Vuoi proseguire?");
            String risposta=scanner2.nextLine();
            if(risposta.equals("si")){
                condizione=true;
            }else if(risposta.equals("no")){
                condizione=false;
            }else{
                System.out.println("Puoi digitare solo \"si\"o\"no\"");
            }
            
        }
        
        //ESEMPIO DI CICLO FOR

        Scanner scanner3=new Scanner (System.in);
        System.out.println("Di quale numero vuoi la tabellina?");
        int numero=scanner3.nextInt();

        for(int k=1;k<11;k++){
            System.out.println("Tabellina: "+(numero*k));
        }
        scanner.close();
        scanner2.close();
        scanner3.close();
    }
}
