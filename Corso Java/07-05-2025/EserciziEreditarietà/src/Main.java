public class Main {
    public static void main(String[] args) throws Exception {
        
        //CREO OGGETTO AUTOMOBILE E NE IMPLEMENTO I METODI
        Auto automobile=new Auto(null, null);
        automobile.setMarca();
        automobile.setModello();
        System.out.println(" ");
        System.out.println(automobile);
        automobile.mostraMarca();


        System.out.println(" ");

        //CREO OGGETTO MOTO E NE IMPLEMENTO I METODI
        Moto moto=new Moto(null, 0);
        moto.setMarca();
        moto.setCilindrata();
        System.out.println(" ");
        System.out.println(moto);
        moto.mostraMarca();

        System.out.println(" ");

        //CREO OGGETTO QUADRATO E NE IMPLEMENTO I METODI
        Quadrato quadrato=new Quadrato(0);
        quadrato.setLato();
        double areaQuadrato=quadrato.calcoloArea();
        System.out.println(areaQuadrato);

        System.out.println(" ");

        //CREO OGGETTO CERCHIO E NE IMPLEMENTO I METODI
        Cerchio cerchio=new Cerchio(0);
        cerchio.setRaggio();
        double areaCerchio=cerchio.calcoloArea();
        System.out.println(areaCerchio);
    }
}
