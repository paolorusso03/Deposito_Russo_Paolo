public class Conto {

    private int saldo;

    //COSTRUTTORE CHE DEFINISCE OGGETTI DI TIPO CONTO
    public Conto(int saldo){
        this.saldo=saldo;
    }

    //GETTER PER IL SALDO
    public int getSaldo(){
        return saldo;
    }

    //METODO PER EFFETTUARE UN PRELIEVO
    public void effettuaPrelievo(int prelievo){
        if(prelievo>saldo){
            System.out.println("Impossibile effettuare prelievo");
        }else{
            System.out.println("Denaro prelevato: "+prelievo);
            saldo-=prelievo;
        }
    }

    //METODO PER EFFETTUARE UN DEPOSITO
    public void effettuaDeposito(int deposito){
        if(deposito>0){
            System.out.println("Denaro versato: "+deposito);
            saldo+=deposito;
        }else{
            System.out.println("Importo non valido");
        }
    }
}
