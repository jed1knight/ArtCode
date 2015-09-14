package week2.homework.coffeeHouse.beverages;


import week2.homework.coffeeHouse.PriceList;

/**
 * Created by Home on 02.09.2015.
 */
public class Cocoa extends Beverage {
    public Cocoa() {
        super("Cocoa", PriceList.PRICES.getPrice("cocoa"));
    }
}
