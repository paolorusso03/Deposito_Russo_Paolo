public class ProvaCondizioni {
    public static void main(String[] args) throws Exception {
        
        //QUESTA ISTRUZIONE SI AVVIA SE LA CONDIZIONE E' VERIFICATA
        if(20>18){
            System.out.println("20 è maggiore di 18");
        }

        int x=10, y=12, z=11;
        //PONGO IN CONFRONTO DUE NUMERI, SE IL PRIMO E' MAGGIORE DEL SECONDO ESEGUE L'IF, ALTRIMENTI ESEGUE L'ELSE
        if(x>y){
            System.out.println("Il primo numero è maggiore del secondo");
        }else {
            System.out.println("Il secondo numero è maggiore del primo");
        }

        //ESEGUO UN'ISTRUZIONE INTERMEDIA SE NON SI DOVESSE VERIFICARE LA PRIMA NELL'IF, UTILIZZO ELSE IF (ALTRIMENTI)
        if(x>y){
            System.out.println("Il primo numero è maggiore del secondo");
        }else if(y>z){
            System.out.println("Il secondo numero è maggiore del terzo");
        }else{
            System.out.println("Il primo numero è maggiore del terzo");
        }

        //ALTRO MODO DI PORRE CONDIZIONI DI VERO O FALSO (INUTILIZZATO)
        int ora=12;
        String saluto=(ora<13)?"Buongiorno":"Buonasera";
        System.out.println(saluto);
    }
}
