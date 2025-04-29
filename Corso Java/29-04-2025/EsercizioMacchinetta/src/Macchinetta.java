import java.util.Scanner;

public class Macchinetta {
    public static void main(String[] args) throws Exception {

        //FACCIO INSERIRE IL DENARO AL CLIENTE
        Scanner scanner=new Scanner(System.in);
        System.out.println("Inserisci denaro");
        double credito=scanner.nextDouble();
        boolean condizione=true;

        //CLICLO WHILE CHE TERMINA ALL'USCITA O QUANDO SI TERMINA IL CREDITO
        while(condizione || credito==0){
            System.out.println(" ");
            System.out.println("Cosa desideri acquistare?\n1. Caffè 1,50\n2. Cappuccino 2,00\n3. Tè 1,00\n4. Acqua 0,50\n5. UScita");
            Scanner scanner2=new Scanner(System.in);
            int scelta=scanner2.nextInt();

            switch(scelta){
                case 1:
                System.out.println(" ");
                System.out.println("Costo 1,5");
                credito-=1.5;
                System.out.println(" ");
                System.out.println("Credito residuo: "+credito);
                break;

                case 2:
                System.out.println(" ");
                System.out.println("Costo 2,00");
                credito-=2.00;
                System.out.println(" ");
                System.out.println("Credito residuo: "+credito);
                break;

                case 3:
                System.out.println(" ");
                System.out.println("Costo 1,00");
                credito-=1.00;
                System.out.println(" ");
                System.out.println("Credito residuo: "+credito);
                break;

                case 4:
                System.out.println(" ");
                System.out.println("Costo 0,50");
                credito-=0.50;
                System.out.println(" ");
                System.out.println("Credito residuo: "+credito);
                break;

                case 5:
                System.out.println(" ");
                System.out.println("Resto: "+credito);
                condizione=false;
                break;

                default:
                System.out.println(" ");
                System.out.println("Scelta non consentita");
            }
        }
    }
}
