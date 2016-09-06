package Grocery;

/**
 * Created by 3299779 on 29/08/2016.
 */
public class GroceryItemOrder {

    private String name;
    private int price;
    private int quantity;
    private int cost;

    public GroceryItemOrder() {

    }

    public GroceryItemOrder(String name) {
        this.name = name;
    }

    public GroceryItemOrder(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public GroceryItemOrder(String name, int price, int quantity, int cost) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.cost = cost;

    }


    public String getName() {

        return name;
    }
    public void setName(String name) {

        this.name = name;
    }

    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getCost() {
        return price * quantity;
    }

    public String toString() {
        return "Name: " + name + ", Price: " + price + ", Quantity: " + quantity + ", Total cost: " + getCost();
    }
}
