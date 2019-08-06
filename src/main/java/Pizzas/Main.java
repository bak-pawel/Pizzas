package Pizzas;

public class Main {
    public static void main(String[] args) {


        Margaritha margaritha = new Margaritha(13,1);
        margaritha.description();
        System.out.println(margaritha.getPrice()+ "zł " +margaritha.getWeight()+"kg");


        Napoli napoli = new Napoli(12,2);
        napoli.description();
        System.out.println(napoli.getPrice()+"zł "+napoli.getWeight()+"kg");

        AglioOlio aglioOlio = new AglioOlio(11,1);
        aglioOlio.description();
        System.out.println(aglioOlio.getPrice()+"zł "+aglioOlio.getWeight()+"kg");

        Arabiata arabiata = new Arabiata(32,2);
        arabiata.description();
        System.out.println(arabiata.getPrice()+"zł "+arabiata.getWeight()+"kg");
    }
}