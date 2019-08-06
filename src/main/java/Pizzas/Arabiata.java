package Pizzas;

public class Arabiata extends Pasta {
    public Arabiata(int price, int weight){
        super.setPrice(price);
        super.setWeight(weight);
    }
    public void description() {
        System.out.println("Arabiata");
    }
}
