public class Stringhe {
    public static void main(String[] args) throws Exception {
        
        String prova="Inserisco una frase di prova";
        String nome="Paolo ";
        String cognome="Russo ";
        String azione="scrive un programma ";
        String luogo="dietro la sua scrivania";
        
        System.out.println(prova);//STAMPA A VIDEO IL CONTENUTO DELLA VARIABILE PROVA   
        System.out.println(prova.length());//STAMPA A VIDEO LA LUNGHEZZA DEL CONTENUTO DELLA VARIABILE PROVA
        System.out.println(prova.toUpperCase());//RENDE TUTTO MAIUSCOLO IL CONTENUTO DELLA VARIABILE PROVA
        System.out.println(prova.toLowerCase());//RENDE TUTTO MINUSCOLO IL CONTENUTO DELLA VARIABILE PROVA
        System.out.println(prova.indexOf("prova"));//PARTENDO DA 0 CI INDICA L'INDICE DELLA PRIMA LETTERA DELLA PAROLA PROVA
        System.out.println(nome.concat(cognome).concat(azione).concat(luogo));//CONCATENA IL CONTENUTO DI DUE VARIABILI DIFFERENTI (SENZA SPAZI)
        System.out.println(prova.contains("frase"));//VERIFICA SE NELLA VARIABILE PROVA E' CONTENUTA LA PAROLA "FRASE" RESTITUISCE TRUE SE VERO
        System.out.println(prova.equals(luogo));//PARAGONA IL CONTENUTO DI PROVA E DI LUOGO E DARA' TRUE SE I CONTENUTO SONO UGUALI
        System.out.println(prova.isEmpty());//RESTITUISCE TRUE SE LA VARIABILE PROVA E' VUOTA

    }
}
