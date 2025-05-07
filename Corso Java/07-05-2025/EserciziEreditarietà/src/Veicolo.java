import java.util.Scanner;

public class Veicolo{
    
     String marca;

    public Veicolo(String marca){
        this.marca=marca;
    }

    //METODO PER SETTARE MARCA
    public void setMarca(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Inserisci marca: ");
        this.marca=scanner.nextLine();
    }

    //METODO PER STAMPARE A VIDEO LA MARCA
    public void mostraMarca(){
        System.out.println("Marca del veicolo: "+this.marca);
    }
}
