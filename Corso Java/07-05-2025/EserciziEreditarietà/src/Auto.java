import java.util.Scanner;

public class Auto extends Veicolo{

    String modello;

    public Auto(String marca, String modello){
        super(marca);
        this.modello=modello;
    }
    
    //METODO PER SETTARE MODELLO
    public void setModello(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Inserisci modello auto: ");
        this.modello=scanner.nextLine();
    }

    //METODO PER STAMPARE A VIDEO IL MODELLO
    public void mostraModello(){
        System.out.println("Modello auto: "+this.modello);
    }

    @Override
    public String toString(){
        return "Marca: "+this.marca+"\nModello: "+this.modello;
    }
}
