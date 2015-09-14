package week2.homework.coffeeHouse.beverages;

import week2.homework.coffeeHouse.PriceList;

/**
 * Created by Home on 05.09.2015.
 */
public class Espresso extends Beverage {
    public Espresso() {
        super("Espresso coffee", PriceList.PRICES.getPrice("espresso"));
    }
}
