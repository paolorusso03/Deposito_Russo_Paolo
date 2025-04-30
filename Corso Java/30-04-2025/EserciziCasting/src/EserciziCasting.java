public class EserciziCasting {
    public static void main(String[] args) throws Exception {
        
        //TRASFORMO IN DOUBLE UN INT TRAMITE CASTING E STAMPO A VIDEO IL VALORE
        int uno=10;
        double due=(double) uno;
        System.out.println(due);

        //TRASFORMO IN INT UN DOUBLE TRAMITE CASTING E STAMPO A VIDEO IL VALORE
        double nUno=21.74d;
        int nDue=(int) nUno;
        System.out.println(nDue);

        //TRASFORMO IN STRING UN INT TRAMITE CASTING E STAMPO A VIDEO IL VALORE
        int numero=20;
        String numeroString=String.valueOf(numero);
        System.out.println(numeroString);

        //TRAFORMO IN INT UNA STRING TRAMITE CASTING E STAMPO A VIDEO IL VALORE
        String provaNumero="574";
        int provaNum=Integer.parseInt(provaNumero);
        System.out.println(provaNum);

        //TRASFORMO IN DOUBLE UN FLOAT TRAMITE CASTING E STAMPO A VIDEO IL VALORE
        float numeroFloat=25.7589f;
        double numeroDouble=(double) numeroFloat;
        System.out.println(numeroDouble);

        //TRAFORMO UNA STRING IN UN DOUBLE TRAMITE CASTING E STAMPO A VIDEO IL VALORE
        String numeroString2="24.78546";
        double numeroDouble2=Double.parseDouble(numeroString2);
        System.out.println(numeroDouble2);     
    }
}
