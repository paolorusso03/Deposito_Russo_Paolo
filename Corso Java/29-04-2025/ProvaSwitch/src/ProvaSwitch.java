import java.util.Scanner;

public class ProvaSwitch {
    public static void main(String[] args) throws Exception {

        //CHIEDO ALL'UTENTE UN NUMERO DA 1 A 7 PER INDICARGLI IL GIORNO DELLA SETTIMANA CORRISPONDENTE
        Scanner scanner=new Scanner(System.in);
        System.out.println("Dammi un numero da 1 a 7 e io ti dirò a che giorno della settimana corrisponde");
        int giorno=scanner.nextInt();

        //UTILIZZO IL COSTRUTTO SWITCH/CASE PER I VARI POSSIBILI CASI
        switch(giorno){

            case 1: 
            System.out.println("Lunedì");
            break;

            case 2:
            System.out.println("Martedì");
            break;

            case 3:
            System.out.println("Mercoledì");
            break;

            case 4:
            System.out.println("Giovedì");
            break;

            case 5:
            System.out.println("Venerdì");
            break;

            case 6:
            System.out.println("Sabato");
            break;

            case 7:
            System.out.println("Domenica");
            break;

            //DEFAULT IN CASO DI NUMERO DIVERSO TRA QUELLI POSSIBILI
            default:
            System.out.println("Scegli un numero da 1 a 7!");
        }

        //CHIUDO LO SCANNER
        scanner.close();

    }
}
