package week2.homework.coffeeHouse.toppings;

import week2.homework.coffeeHouse.PriceList;

/**
 * Created by Home on 05.09.2015.
 */
public class Chocolate extends Topping{
    public Chocolate() {
        super("Alpine chocolate", PriceList.PRICES.getPrice("chocolate"));
    }
}
