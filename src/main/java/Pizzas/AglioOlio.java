package Pizzas;

public class AglioOlio extends Pasta {

    public AglioOlio(int price, int weihgt){
        super.setPrice(price);
        super.setWeight(weihgt);
    }
    public void description() {
        System.out.println("AglioOlio");
    }
}
