package week2.homework.coffeeHouse.toppings;

/**
 * Created by Home on 02.09.2015.
 */
public class Topping {
    private String description;
    private double cost;

    Topping(String description, double cost) {
        this.description = description;
        this.cost = cost;
    }

    public String getDescription() {
        return description;
    }

    public double getCost() {
        return cost;
    }
}
