package week2.homework.coffeeHouse.toppings;

import week2.homework.coffeeHouse.PriceList;

/**
 * Created by Home on 05.09.2015.
 */
public class Milk extends Topping {
    public Milk() {
        super("Milk", PriceList.PRICES.getPrice("milk"));
    }
}
