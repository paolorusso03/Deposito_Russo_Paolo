public class Stringhe {
    public static void main(String[] args) throws Exception {
        //STAMPO A VIDEO LA LUNGHEZZA DI UNA STRINGA, VERIFICO SE CONTIENE UNA DETERMINATA PAROLA, E NE RIMUOVO GLI SPAZI CON TRIM
        String prova="      Questa è una stringa di prova         ";
        System.out.println("Lunghezza della stringa: "+prova.length());
        System.out.println("La frase contiene la parola \"stringa\"? "+prova.contains("prova"));
        System.out.println(prova.trim());
        //CONVERTO TUTTA LA STRINGA IN MAIUSCOLO
        System.out.println("Stringa tutta in maiuscolo: "+prova.toUpperCase().trim());
        //VERIFICO SE UNA STRINGA TERMINA CON UN SUFFISSO INDICATO ("prova")
        String suffisso="prova";
        System.out.println("La stringa termina con la parola \"prova\"? "+prova.endsWith(suffisso));
        //CONVERTO UN INTERO IN UNA STRINGA CON VALUEOF
        int intero=55;
        System.out.println("Intero convertito in stringa: "+String.valueOf(intero));
        //CONCATENO DUE STRINGHE CON +
        String frase1="Questa è la prima frase";
        String frase2=" e questa è la seconda frase";
        System.out.println(frase1+frase2);
        //PROVO L'INTERPOLAZIONE DI STRINGHE CON %
        int età=22;
        double altezza=1.70d;
        String presentazione=String.format("Ciao sono Paolo, ho %d anni e sono alto %fm",età,altezza);
        System.out.println(presentazione);
    }
}
