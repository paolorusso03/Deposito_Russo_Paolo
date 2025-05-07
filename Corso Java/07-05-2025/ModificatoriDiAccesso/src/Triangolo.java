public class Triangolo {
    
    private int base=12;
    private int altezza=5;

    public Triangolo(){
    }

    public void getArea(){
        System.out.println("Area del triangolo: "+((base*altezza)/2));
    }

    public void mostraBase(){
        System.out.println("Base del triangolo: "+base);
    }

    public void mostraAltezza(){
        System.out.println("Altezza del triangolo: "+altezza);
    }
}
