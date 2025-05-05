public class Conto {

    private int saldo;

    public Conto(int saldo){
        this.saldo=saldo;
    }

    public int getSaldo(){
        return saldo;
    }

    public void effettuaPrelievo(int prelievo){
        if(prelievo>saldo){
            System.out.println("Impossibile effettuare prelievo");
        }else{
            System.out.println("Denaro prelevato: "+prelievo);
            saldo-=prelievo;
        }
    }

    public void effettuaDeposito(int deposito){
        if(deposito>0){
            System.out.println("Denaro versato: "+deposito);
            saldo+=deposito;
        }else{
            System.out.println("Importo non valido");
        }
    }
}
