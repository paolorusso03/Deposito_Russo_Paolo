import java.util.Scanner;

public class Moto extends Veicolo{

    int cilindrata;

    public Moto(String marca, int cilindrata){
        super(marca);
        this.cilindrata=cilindrata;
    }

    //METODO PER SETTARE LA CILINDRATA
    public void setCilindrata(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Cilindrata: ");
        this.cilindrata=scanner.nextInt();
    }

    //METODO PER STAMPARE A VIDEO LA CILINDRATA
    public void mostraCilidrata(){
        System.out.println("Cilindrata moto: "+this.cilindrata);
    }

    //METODO TOSTRING PER STAMPARE A VIDEO
    @Override
    public String toString(){
        return "Marca moto: "+this.marca+"\nCilindrata moto: "+this.cilindrata;
    }
}
