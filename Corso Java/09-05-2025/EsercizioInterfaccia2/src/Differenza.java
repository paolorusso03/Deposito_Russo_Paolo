public class Differenza extends MetodiComuni implements Operandi{

    float differenza;

    //IMPLEMENTO L'INTERFACCIA ESEGUENDO LA DIFFERENZA
    @Override
    public float numeri(float a, float b) {
        System.out.print("Differenza: ");
        return differenza=a-b;
    }   
}
