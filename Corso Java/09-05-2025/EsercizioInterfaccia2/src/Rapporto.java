public class Rapporto extends MetodiComuni implements Operandi{
    
    float rapporto;

    //IMPLEMENTO L'INTERFACCIA FACENDO IL RAPPORTO
    @Override
    public float numeri(float a, float b) {
        System.out.print("Rapporto: ");
        return rapporto=a/b;
    }
}
