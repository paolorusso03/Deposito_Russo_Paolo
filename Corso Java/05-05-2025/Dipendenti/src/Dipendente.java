public class Dipendente {
    
    private String nome;
    private String cognome;
    private double stipendio;

    public Dipendente(String nome, String cognome, double stipendio){
        this.nome=nome;
        this.cognome=cognome;
        this.stipendio=stipendio;
    }

    public void calcoloPercentuale(int percentuale){
        if(percentuale==10){
            stipendio=stipendio+(stipendio*0.1);
            System.out.println("Stipendio aumentato del 10%! Stipendio aggiornato: "+stipendio);
        }else if(percentuale==20){
            stipendio=stipendio+(stipendio*0.2);
            System.out.println("Stipendio aumentato del 20%! Stipendio aggiornato: "+stipendio);
        }else if(percentuale==30){
            stipendio=stipendio+(stipendio*0.3);
            System.out.println("Stipendio aumentato del 30%! Stipendio aggiornato: "+stipendio);
        }
    }

    public void setNome(String newNome){
        this.nome=newNome;
    }

    public void setCognome(String newCognome){
        this.cognome=newCognome;
    }

    public void setStipendio(double newStipendio){
        this.stipendio=newStipendio;
    }

    public String getNome(){
        return nome;
    }

    public String getCognome(){
        return cognome;
    }

    public double getStipendio(){
        return stipendio;
    }   
}
