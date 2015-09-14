package week2.homework.coffeeHouse.beverages;

import week2.homework.coffeeHouse.PriceList;

/**
 * Created by Home on 05.09.2015.
 */
public class GreenTea extends Beverage {
    public GreenTea() {
        super("Green Tea", PriceList.PRICES.getPrice("greenTea"));
    }
}
