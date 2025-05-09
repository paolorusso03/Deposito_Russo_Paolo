import java.util.Scanner;

public class Cerchio extends Forma{

    private float raggio;
    Scanner scanner2=new Scanner(System.in);

    public Cerchio(){  
    }
    
    //METODO SETRAGGIO PER IMPOSTARE LA MISURA DEL RAGGIO
    public void setRaggio(){
        while(true){

            System.out.println("Inserisci valore del raggio: ");
            this.raggio=scanner2.nextFloat();
            
            if(scanner2.hasNextFloat()){
                break;
            }else{
                System.out.println("Inserisci un valore valido");
                scanner2.next();
            }
        }
    }
    
    //METODO EREDITATO CALCOLAAREA
    @Override
    public void calcolaArea(){
        float area=(float)(Math.PI*raggio*raggio);
        System.out.print("Area: "+area);
    }

    public void chiudiScanner(){
        scanner2.close();
    }
}
