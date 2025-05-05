public class Rettangolo {
    
    private int base;
    private int altezza;

    public Rettangolo(int unaBase, int unAltezza){
        base=unaBase;
        altezza=unAltezza;
    }

    public void setBase(int nuovaBase){
        base=nuovaBase;
    }

    public void setAltezza(int nuovaAltezza){
        altezza=nuovaAltezza;
    }

    public int getBase(){
        return base;
    }

    public int getAltezza(){
        return altezza;
    }

    public int getArea(){
        return base*altezza;
    }

    public int getPerimetro(){
        return (base*2)+(altezza*2);
    }
}
