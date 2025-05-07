public class Rettangolo {
    
    private int base;
    private int altezza;

    //COSTRUTTORE PER LA DICHIARAZIONE DI UN RETTANGOLO
    public Rettangolo(int unaBase, int unAltezza){
        base=unaBase;
        altezza=unAltezza;
    }

    //METODO PER SETTARE LA BASE
    public void setBase(int nuovaBase){
        base=nuovaBase;
    }

    //METODO PER SETTARE L'ALTEZZA
    public void setAltezza(int nuovaAltezza){
        altezza=nuovaAltezza;
    }

    //METODO GET PER LA BASE
    public int getBase(){
        return base;
    }

    //METODO GET PER L'ALTEZZA
    public int getAltezza(){
        return altezza;
    }

    //METODO PER RICAVARE L'AREA
    public int getArea(){
        return base*altezza;
    }

    //METODO PER RICAVARE IL PERIMETRO
    public int getPerimetro(){
        return (base*2)+(altezza*2);
    }
}
