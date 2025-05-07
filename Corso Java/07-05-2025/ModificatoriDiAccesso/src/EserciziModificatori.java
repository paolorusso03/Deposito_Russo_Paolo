public class EserciziModificatori {
    public static void main(String[] args) throws Exception {
        
        //Dichiaro un oggetto di tipo Persona e ne vado a prendere il nome
        Persona persona=new Persona();
        persona.getNome();

        System.out.println(" ");
        //Dichiaro un oggetto di tipo Automobile e ne vado a prendere la marca
        Automobile auto=new Automobile();
        auto.getMarca();

        System.out.println(" ");
        //Dichiaro un oggetto di tipo Conto e ne visiono il saldo, effettuando un versamento
        ContoBancario conto=new ContoBancario();
        conto.getSaldo();
        conto.depositoDenaro();

        System.out.println(" ");
        //Dichiaro un oggetto di tipo Studente e ne vado a prendere la matricola
        Studente studente=new Studente();
        studente.getMatricola();
        
        System.out.println(" ");
        //Dichiaro un oggetto di tipo Libro, vado a scegliere un titolo e mostro il titolo scelto
        Libro libro=new Libro();
        libro.setTitolo();
        libro.getTitolo();

        System.out.println(" ");
        //Dichiaro un oggetto di tipo Computer e vado a prendermene il modello
        Computer computer=new Computer();
        computer.getModello();

        System.out.println(" ");
        //Dichiaro un oggetto di tipo Triangolo con valori assegnati, mostro base e altezza e ne calcolo l'area
        Triangolo triangolo=new Triangolo();
        triangolo.mostraBase();
        triangolo.mostraAltezza();
        triangolo.getArea();
    }
}
