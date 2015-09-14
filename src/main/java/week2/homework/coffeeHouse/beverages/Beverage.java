package week2.homework.coffeeHouse.beverages;

import week2.homework.coffeeHouse.toppings.Topping;
import java.util.ArrayList;

/**
 * Created by Home on 02.09.2015.
 */
public abstract class Beverage {
    private String description;
    private double cost;
    private ArrayList<Topping> toppings;

    Beverage(String description, double cost) {
        this.description = description;
        this.cost = cost;
        toppings = new ArrayList<Topping>();
    }

    public String totalDescription() {
        StringBuilder builder = new StringBuilder(description);
        for (int i = 0; i < toppings.size(); i++) {
            builder.append(" with " + toppings.get(i).getDescription());
        }
        return builder.toString();
    }

    public double totalCost() {
        double totalCost = cost;
        for (int i = 0; i < toppings.size(); i++) {
            totalCost = totalCost + toppings.get(i).getCost();
        }
        return totalCost;
    }

    public void addTopping(Topping topping) {
        toppings.add(topping);
    }

}
