public class Item {
    private String description;
    private double price;
    private int quantity;

    public Item(String d, double p, int q){
        description = d;
        price = p;
        quantity = q;
    }

    public void description(String d){
        description = d;
    }
    public void price(double p){
        price = p;
    }
    public void quantity(int q){
        quantity = q;
    }

    public String description(){
        return description;
    }
    public double price(){
        return price;
    }
    public int quantity(){
        return quantity;
    }
}
