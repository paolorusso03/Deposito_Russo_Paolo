import java.util.Scanner;

public class Esercizi {
    public static void main(String[] args) throws Exception {
        
        //ESERCIZIO NUMERO 1

        Scanner scanner=new Scanner(System.in);
        Scanner scanner2=new Scanner(System.in);

        System.out.println("Forniscimi un dato in formato intero");
        int primoDato=scanner.nextInt();

        System.out.println("Forniscimi un dato in formato float");
        float secondoDato=scanner.nextFloat();

        System.out.println("Forniscimi un dato di tipo double");
        double terzoDato=scanner.nextDouble();

        System.out.println("Forniscimi un dato di tipo booleano quindi scegli tra 'true' o false'");
        boolean quartoDato=scanner.nextBoolean();

        System.out.println("Forniscimi un dato di tipo stringa (digita una frase a tuo piacimento)");
        String quintoDato=scanner2.nextLine();

        System.out.println("Dato intero scelto: "+primoDato);
        System.out.println("Dato intero scelto: "+secondoDato);
        System.out.println("Dato intero scelto: "+terzoDato);
        System.out.println("Dato booleano scelto: "+quartoDato);
        System.out.println("Dato string scelto: "+quintoDato);

        //ESERCIZIO 2 

        Scanner scanner3=new Scanner(System.in);
        
        System.out.println("Forniscimi il primo valore");
        int val1=scanner3.nextInt();

        System.out.println("Forniscimi il secondo valore");
        int val2=scanner3.nextInt();

        System.out.println("Forniscimi il terzo valore");
        int val3=scanner3.nextInt();

        System.out.println("Forniscimi il quarto valore");
        int val4=scanner3.nextInt();

        if(val1>=val2 && val1>=val3 && val1>=val4){
            System.out.println("Il valore maggiore fornito è il primo, ovvero: "+val1);
        }

        if(val2>=val1 && val2>=val3 && val2>=val4){
            System.out.println("Il valore maggiore fornito è il secondo, ovvero: "+val2);
        }

        if(val3>=val1 && val2>=val2 && val3>=val4){
            System.out.println("Il valore maggiore fornito è il terzo, ovvero: "+val3);
        }

        if(val4>=val1 && val4>=val2 && val4>=val3){
            System.out.println("Il valore maggiore fornito è il quarto, ovvero: "+val4);
        }
        if(val1==val2 || val1==val3 || val2==val4){
            System.out.println("Ci sono due valori uguali!");
        }
        if(val2==val3 || val2==val4){
            System.out.println("Ci sono due valori uguali!");
        }
        if(val3==val4){
            System.out.println("Ci sono due valori uguali!");
        }
    }
}



