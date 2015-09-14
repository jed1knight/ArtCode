package week2.homework.coffeeHouse.beverages;

import week2.homework.coffeeHouse.PriceList;

/**
 * Created by Home on 05.09.2015.
 */
public class Latte extends Beverage {
    public Latte() {
        super("Latte coffee", PriceList.PRICES.getPrice("latte"));
    }
}
