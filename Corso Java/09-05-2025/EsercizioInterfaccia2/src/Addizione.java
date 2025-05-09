public class Addizione extends MetodiComuni implements Operandi{

    float somma;

    //IMPLEMENTO L'INTERFACCIA ESEGUENDO LA SOMMA
    @Override
    public float numeri(float a, float b) {
        System.out.print("Somma: ");
        return somma=a+b;
    }
    
}
