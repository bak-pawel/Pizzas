package Pizzas;

public class Napoli extends Pizza{
    public Napoli (int price, int weight){
        super.setPrice(price);
        super.setWeight(weight);
    }

    public void description() {
        System.out.println("Napoli");
    }
}
