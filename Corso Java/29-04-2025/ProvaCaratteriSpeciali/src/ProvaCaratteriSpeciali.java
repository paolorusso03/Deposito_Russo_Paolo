public class ProvaCaratteriSpeciali {
    public static void main(String[] args) throws Exception {
        
        //L'UTILIZZO DEL BACKSLASH CI AIUTA NEI TESTI A "NASCONDERE" LE VIRGOLETTE A JAVA PER EVITARE DI CREARE ERRORI
        String txt="We're the so-called \"Vikings\" from the north.";
        System.out.println(txt);

        txt="Provaa\b del backslash b";
        System.out.println(txt);

        txt="Prova del backslash r\r";
        System.out.println(txt);

        txt="Prova del\f backslash f";
        System.out.println(txt);

        txt="Prova\s del backslash s";
        System.out.println(txt);

        txt="Provo lo split";
        txt.split("o");
        System.out.println(txt);
    }
}
