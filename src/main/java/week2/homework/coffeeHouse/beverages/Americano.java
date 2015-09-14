package week2.homework.coffeeHouse.beverages;

import week2.homework.coffeeHouse.PriceList;


/**
 * Created by Home on 05.09.2015.
 */
public class Americano extends Beverage {
    public Americano() {
        super("Americano coffee", PriceList.PRICES.getPrice("americano"));
    }
}
