public class EserciziettiConVariabili {
    public static void main(String[] args) throws Exception {
       
        //DICHIARO UNA VARIABILE E NE STAMPO A VIDEO IL VALORE
        int uno=5;
        System.out.println(uno);

        //DICHIARO UN FLOAT E NE STAMPO A VIDEO IL VALORE
        float altezza=1.74f;
        System.out.println(altezza);

        //DICHIARO UN BOOLEAN E NE STAMPO A VIDEO IL VALORE
        boolean isPieno=true;
        System.out.println(isPieno);

        //DICHIARO UN CHAR E NE STAMPO A VIDEO IL VALORE
        char lettera='A';
        System.out.println(lettera);

        //DICHIARO UNA STRING E NE STAMPO A VIDEO IL VALORE
        String nome="Mario Rossi";
        System.out.println(nome);

        //DICHIARO UN DOUBLE E NE STAMPO A VIDEO IL VALORE
        double peso=68.8d;
        System.out.println(peso);

        //DICHIARO DUE VARIABILI DOUBLE E NE STAMPO A VIDEO LA DIFFERENZA
        double valUno=9.81d, valDue=8.81d;
        System.out.println("La differenza è: "+(valUno-valDue));

        //DICHIARO UNA VARIABILE INTERA ANNO E IN BASE ALL'ANNO CORRENTE NE CALCOLO L'ETA'
        int anno=1990;
        System.out.println("Età attuale: "+(2025-anno));

        //DICHIARO UNA VARIABILE FINAL INTERA E NE STAMPO A VIDEO IL VALORE
        final int prova=10;
        System.out.println(prova);

        //DICHIARO UNA VARIABILE FINAL STRING E NE STAMPO A VIDEO IL VALORE
        final String prova2="Costante";
        System.out.println(prova2);

        //DICHIARO UNA VARIABILE FINAL DOUBLE E NE STAMPO A VIDEO IL VALORE
        final double prova3=2.33d;
        System.out.println(prova3);

        //USO DI VARIABILI FINAL IN UN METODO
        final int primoNum=15, secondoNum=23;
        int somma=Somma(primoNum,secondoNum);
        System.out.println("Il valore della somma è: "+somma);
        
         }
    public static final int Somma (final int primoNumero,final int secondoNumero){
        return primoNumero+secondoNumero;
    };
}
