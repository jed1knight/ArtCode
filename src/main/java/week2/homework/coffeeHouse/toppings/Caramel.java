package week2.homework.coffeeHouse.toppings;

import week2.homework.coffeeHouse.PriceList;

/**
 * Created by Home on 02.09.2015.
 */
public class Caramel extends Topping {

    public Caramel() {
        super("Sweet caramel", PriceList.PRICES.getPrice("caramel"));
    }
}
