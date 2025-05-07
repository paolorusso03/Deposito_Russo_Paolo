import java.util.Scanner;

public class Quadrato extends FiguraGeometrica{
    
    private double lato;

    public Quadrato(double lato){
        this.lato=lato;
    }

    //METODO PER SETTARE LATO DEL QUADRATO
    public void setLato(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Fornisci la misura del lato: ");
        this.lato=scanner.nextDouble();
    }

    //METODO PER CALCOLO DELL'AREA DEL QUADRATO
    @Override
    public double calcoloArea(){
        System.out.println("Area del quadrato: ");
        return (this.lato*this.lato);
    }
}
