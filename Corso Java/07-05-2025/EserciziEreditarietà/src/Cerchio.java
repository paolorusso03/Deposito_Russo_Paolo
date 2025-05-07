import java.util.Scanner;

public class Cerchio extends FiguraGeometrica{
    
    private double raggio;

    public Cerchio(double raggio){
        this.raggio=raggio;
    }

    //METODO PER SETTARE IL RAGGIO DEL CERCHIO
    public void setRaggio(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Quanto vale il raggio? ");
        this.raggio=scanner.nextDouble();
    }

    //METODO PER CALCOLARE L'AREA DEL CERCHIO
    @Override
    public double calcoloArea(){
        System.out.println("L'area del cerchio è: ");
        return (Math.PI*this.raggio*this.raggio);
    }
}
