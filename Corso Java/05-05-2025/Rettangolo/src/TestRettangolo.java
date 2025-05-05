import java.util.Scanner;

public class TestRettangolo {
    public static void main(String[] args) throws Exception {

        int base;
        int altezza;

        System.out.println("Ora andremo a calcolare Area e Perimetro di un rettangolo");
        Scanner scanner=new Scanner(System.in);

        System.out.println("Scegli la base: ");
        base=scanner.nextInt();

        System.out.println("Scegli l'altezza");
        altezza=scanner.nextInt();

        Rettangolo rettangolo=new Rettangolo(base, altezza);

        System.out.println("Il valore del perimetro è: "+rettangolo.getPerimetro());
        System.out.println("Il valore dell'area è: "+rettangolo.getArea());

        scanner.close();
    }
}
