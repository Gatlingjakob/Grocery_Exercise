package Grocery;

import Grocery.Grocery;

import java.util.ArrayList;
import java.util.Scanner;


/**
 * Created by 3299779 on 25/08/2016.
 */
public class GroceryList {

    public void createGroceryList (ArrayList<Grocery> g) {

        Scanner input = new Scanner(System.in);

        String answer = input.next();
        for (int i = 1; i <= g.size();i++;) {
            System.out.println("Type in Grocery");
            g.get(i)
        }
    }

}
