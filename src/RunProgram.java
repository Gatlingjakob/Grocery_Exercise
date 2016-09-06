import Grocery.GroceryItemOrder;
import Grocery.GroceryList;

/**
 * Created by 3299779 on 25/08/2016.
 */
public class RunProgram {

    public static void main (String[] args) {

        GroceryList groceryList = new GroceryList();

        GroceryItemOrder item1 = new GroceryItemOrder("Fresh Fruit", 6, 2);
        GroceryItemOrder item2 = new GroceryItemOrder("Microwavable Meals", 8, 2);
        GroceryItemOrder item3 = new GroceryItemOrder("Macaroni & Cheese", 3, 2);
        GroceryItemOrder item4 = new GroceryItemOrder("Cereal", 3, 7);
        GroceryItemOrder item5 = new GroceryItemOrder("Canned Soup", 3, 2);
        GroceryItemOrder item6 = new GroceryItemOrder("Cookies And Crackers", 7, 2);
        GroceryItemOrder item7 = new GroceryItemOrder("Granola/Breakfast bars", 3, 2);
        GroceryItemOrder item8 = new GroceryItemOrder("Pop-Tarts", 3, 3);
        GroceryItemOrder item9 = new GroceryItemOrder("Coffee Creamer", 6, 2);
        GroceryItemOrder item10 = new GroceryItemOrder("Fruit snacks and fruit cups", 3, 5);
        GroceryItemOrder item11 = new GroceryItemOrder("Breakfast bars", 8, 2);


        groceryList.add(item1);
        groceryList.add(item2);
        groceryList.add(item3);
        groceryList.add(item4);
        groceryList.add(item5);
        groceryList.add(item6);
        groceryList.add(item7);
        groceryList.add(item8);
        groceryList.add(item9);
        groceryList.add(item10);
        groceryList.add(item11);


        groceryList.print();

    }
}
