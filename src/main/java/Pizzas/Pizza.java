package Pizzas;

public abstract class Pizza implements Dish {
    private int price = 0;
    private int weight = 0;

    public void setPrice(int price) {
        this.price = price;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }
}
