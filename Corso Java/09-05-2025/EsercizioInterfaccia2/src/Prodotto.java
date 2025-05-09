public class Prodotto extends MetodiComuni implements Operandi{

    float prodotto;

    //IMPLEMENTO L'INTERFACCIA FACENDO IL PRODOTTO
    @Override
    public float numeri(float a, float b) {
        System.out.print("Prodotto: ");
        return prodotto=a*b;
    }
    
}
