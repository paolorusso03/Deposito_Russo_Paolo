public class ProvaNumeri {
    public static void main(String[] args) throws Exception {
        
        System.out.println(3);
        System.out.println(358);
        System.out.println(50000);//STAMPA A VIDEO TUTTI I VALORI DESCRITTO NEL PRINTL

        System.out.println(3 + 3);
        System.out.println(3 * 2);//STAMPA A VIDEO SOMMA E PRODOTTO DEI VALORI NEL PRINTLN

        //PROSSIMO ARGOMENTO -> PROVA VARIABILI

        int provaNumero = 12;//INT DICHIARA UN INTERO
        String provaTesto = "Ciao Mondo";//STRING UNA VARIABILE DI TIPO STRINGA
        boolean provaBool = true;//BOOLEAN UNA VARIABILE CHE PUO' RESTITUIRE VERO O FALSO
        final int provaNumero2 = 15;//FINAL DICHIARA LA VARIABILE NON SOPRASCRIVIBILE

        System.out.println(provaNumero);
        System.out.println(provaTesto);
        System.out.println(provaBool);
        System.out.println(provaNumero2);

        //CONCATENAZIONE DI VARIABILI (PAROLE)

        String testo="Prova";
        System.out.println(testo);

        testo="Mondo";
        System.out.println("Ciao"+" "+testo);//CONCATENAZIONE TRA IL TESTO E IL CONTENUTO DELLA VARIABILE

        //DICHIARAZIONI DI VARIABILI (NUMERI)

        int primoNumero=5;
        int secondoNumero=6;
        System.out.println(primoNumero+secondoNumero);

        int numeroUno=6,numeroDue=7,numeroTre=8;
        System.out.println(numeroUno+numeroDue+numeroTre);

        int numUno;
        int numDue;
        int numTre;
        numUno=numDue=numTre=20;
        System.out.println(numUno+numDue+numTre);

        //PROVA DI STAMPA DI UN DOUBLE E UN FLOAT

        float provaFloat=19.855356f;
        double provaDouble=57.22349d;

        System.out.println(provaFloat);
        System.out.println(provaDouble);

        //PROVA DI STAMPA DI UN BOOLEAN

        boolean provaBooleanUno=true;
        boolean provaBooleanDue=false;

        System.out.println(provaBooleanUno);
        System.out.println(provaBooleanDue);

        //

    }
}
