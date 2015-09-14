package week2.homework.coffeeHouse.beverages;

import week2.homework.coffeeHouse.PriceList;

/**
 * Created by Home on 02.09.2015.
 */
public class BlackTea extends Beverage {
    public BlackTea() {
        super("Black Tea", PriceList.PRICES.getPrice("blackTea"));
    }
}
