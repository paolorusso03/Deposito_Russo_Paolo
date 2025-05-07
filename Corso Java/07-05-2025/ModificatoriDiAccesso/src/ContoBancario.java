import java.util.Scanner;

public class ContoBancario{

    private int saldo=1000;

    public ContoBancario(){
    }

    public void getSaldo(){
        System.out.println("Saldo conto bancario: "+saldo);
    }

    public void depositoDenaro(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Quanto desideri depositare?");
        int deposito=scanner.nextInt();
        System.out.println("Saldo aggiornato: "+(saldo+deposito));
    }
}
