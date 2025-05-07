public class Dipendente {
    
    private String nome;
    private String cognome;
    private double stipendio;

    //COSTRUTTORE PER DEFINIRE GLI OGGETTI DI TIPO "DIPENDENTE"
    public Dipendente(String nome, String cognome, double stipendio){
        this.nome=nome;
        this.cognome=cognome;
        this.stipendio=stipendio;
    }

    //METODO PER CALCOLARE LA PERCENTUALE DI AUMENTO DELLO STIPENDIO
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

    //METODO PER SETTARE IL NOME
    public void setNome(String newNome){
        this.nome=newNome;
    }

    //METODO PER SETTARE IL COGNOME
    public void setCognome(String newCognome){
        this.cognome=newCognome;
    }

    //METODO PER SETTARE LO STIPENDIO
    public void setStipendio(double newStipendio){
        this.stipendio=newStipendio;
    }

    //METODO GET PER NOME
    public String getNome(){
        return nome;
    }

    //METODO GET PER COGNOME
    public String getCognome(){
        return cognome;
    }

    //METODO GET PER LO STIPENDIO
    public double getStipendio(){
        return stipendio;
    }   
}
