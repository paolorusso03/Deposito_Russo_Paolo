public class Operatori {
    public static void main(String[] args) throws Exception {
        
        //OPERATORI DI ASSEGNAZIONE

        int x = 5;
        
        System.out.println(x);
        
        x +=5;//SOMMA 5 AL VALORE PRECEDENTE DI X, LO STESSO VALORE -= ; *= ; /=
        System.out.println(x);

        System.out.println(x%2);//L'OPERATORE % RESTITUISCE IL RESTO DELLA DIVISIONE DEL VALORE NELLA VARIABILE COL NUMERO ASSEGNATO DOPO
        
        System.out.println("Valore attuale di x: "+x);//STAMPO A VIDEO IL VALORE DI X ATTUALE PER CAPIRE GLI OPERATORI SUCCESSIVI

        x++;//INCREMENTA DI 1 IL VALORE DI X
        System.out.println(x);

        x--;//DECREMENTA DI 1 IL VALORE DI X
        System.out.println(x);

        //OPERATORI DI CONFRONTO ------>  > ; < ; >= ; <= ; == ; !=//

        int a=3, b=5;
        
        System.out.println(a>b);//RESTITUISCE TRUE O FALSE IN BASE ALLA CONDIZIONE SE E' VERA O FALSA

        System.out.println(a<b);//RESITUISCE TRUE O FALSE IN BASE ALLA CONDIZIONE SE E' VERA O FALSA
        
        System.out.println(a==b);//RESTITUISCE TRUE SOLO SE ENTRAMBI I VALORI CONFRONTATI SONO ESATTAMENTE UGUALI
        
        System.out.println(a!=b);//RESTITUISCE TRUE SOLO SE ENTRAMBI I VALORI SONO DISTINTI

        //OPERATORI LOGICI -------> AND && ; OR || ; NOT !

        int c=4,d=7;

        System.out.println(c<5 && d>5);//&& (AND) RESTITUISCE TRUE SOLO SE ENTRAMBE LE CONDIZIONI SONO VERIFICATE

        System.out.println(c%2==0 || d%2==0);//|| (OR) RESTITUISCE TRUE SE ALMENO UNA DELLE DUE CONDIZIONI E' VERIFICATA

        System.out.println(!(c<5 && d>5));//! (NOT) RESTITUISCE L'OPPOSTO DELL'ESITO, SE L'ESITO E' VERO RESTITUISCE FALSO E VICEVERSA
    }
}
