import java.util.Scanner;

public class Assicurazione {
    public static void main(String[] args) throws Exception {
        
        //COSTO BASE DELL'ASSICURAZIONE
        int costo=500;

        Scanner scanner=new Scanner(System.in);

        //FACCIO INSERIRE L'ETA' ALL'UTENTE
        System.out.println("Inserisci la tua età");
        System.out.println("Digita 1 se minore di 18 anni");
        System.out.println("Digita 2 se hai un'età compresa tra 18 e 25 anni");
        System.out.println("Digita 3 se hai un'età compresa tra 25 e 50 anni");
        System.out.println("Digita 4 se hai un'età superiore a 50 anni");
        int età=scanner.nextInt();

        //IN BASE ALLA SCELTA MODIFICO O MENO IL PIANO ASSICURATIVO
        if(età>=1&&età<=4){
        switch(età){

            case 1:
            System.out.println("Non è possibile fare l'assicurazione!");
            break;

            case 2:
            System.out.println("Maggiorazione del 20% sul costo dell'assicurazione");
            costo=costo+((500*20)/100);
            break;

            case 3:
            System.out.println("Nessuna maggiorazione prevista");
            break;

            case 4:
            System.out.println("Possibile applicare uno sconto del 10%");
            costo=costo-((500*10)/100);
            break;

            default:
            System.out.println("Seleziona un numero da 1 a 4!");

        }

        //RICHIEDO GLI ANNI DI ESPERIENZA
        System.out.println("Quanti anni di esperienza hai?");
        int esperienza=scanner.nextInt();

        if(esperienza<2){
            System.out.println("Maggiorazione del 30%");
            costo=costo+((500*30)/100);
        }else{
            System.out.println("Nessuna maggiorazione");
        }

        //RICHIEDO EVENTUALI INCIDENTI 
        System.out.println("Quanti incidenti hai avuto negli ultimi 5 anni?");
        int numeroIncidenti=scanner.nextInt();

        switch(numeroIncidenti){
            
            case 0:
            System.out.println("Nessuna maggiorazione applicata");
            break;

            case 1:
            System.out.println("Maggiorazione del 10% applicata");
            costo=costo+((500*10)/100);
            break;

            case 2:
            System.out.println("Maggiorazione del 20% applicata");
            costo=costo+((500*20)/100);
            break;

            case 3:
            System.out.println("Maggiorazione del 30% applicata");
            costo=costo+((500*30)/100);
            break;

            default:
            break;
        }

        if(numeroIncidenti>=4){
            System.out.println("Non è possibile fare l'assicurazione!");
        }else{
        Scanner scanner2=new Scanner(System.in);
        System.out.println("Che piano assicurativo preferisci?");
        System.out.println("Scegli tra 'Default','Intermedio','Premium'");
        String pianoAssicurativo=scanner2.nextLine();

        if(pianoAssicurativo.equals("Default")){
            System.out.println("Nessuna maggiorazione applicata");
        }else if(pianoAssicurativo.equals("Intermedio")){
            System.out.println("Maggiorazione del 10% applicata");
            costo=costo+((500*10)/100);
        }else if(pianoAssicurativo.equals("Premium")){
            System.out.println("Maggiorazione del 20% applicata");
            costo=costo+((500*20)/100);
        }else{
            System.out.println("Scelta non consentita");
        }

        System.out.println("Il costo totale del piano assicurativo: "+costo);

        scanner.close();
        scanner2.close();
        }
    }else{
        System.out.println("Non hai selezionato un numero non compreso tra 1 e 4");
    }
}
}