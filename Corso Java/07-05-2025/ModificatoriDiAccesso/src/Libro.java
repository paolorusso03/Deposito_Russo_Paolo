import java.util.Scanner;

public class Libro{

    private String titolo;

    public Libro(){
    }

    public void setTitolo(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Titolo del libro: ");
        titolo=scanner.nextLine();
    }

    public void getTitolo(){
        System.out.println("Titolo scelto: "+titolo);
    }
}