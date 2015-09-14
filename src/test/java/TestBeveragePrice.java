
import org.junit.*;
import week2.homework.coffeeHouse.beverages.*;
import week2.homework.coffeeHouse.toppings.*;

/**
 * Created by Home on 07.09.2015.
 */
public class TestBeveragePrice {

    @Test
    public void testLattePrice() {
        Beverage beverage = new Latte();
        beverage.addTopping(new Milk());
        beverage.addTopping(new Caramel());
        beverage.addTopping(new Chocolate());
        beverage.addTopping(new Cinnamon());
        beverage.addTopping(new Lemon());

        double expected = 22;
        double actual = beverage.totalCost();
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void testAmericanoPrice() {
        Beverage beverage = new Americano();
        beverage.addTopping(new Milk());
        beverage.addTopping(new Caramel());
        beverage.addTopping(new Chocolate());
        beverage.addTopping(new Cinnamon());
        beverage.addTopping(new Lemon());

        double expected = 18;
        double actual = beverage.totalCost();
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void testEspressoPrice() {
        Beverage beverage = new Espresso();
        beverage.addTopping(new Milk());
        beverage.addTopping(new Caramel());
        beverage.addTopping(new Chocolate());
        beverage.addTopping(new Cinnamon());
        beverage.addTopping(new Lemon());

        double expected = 16;
        double actual = beverage.totalCost();
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void testBlackTeaPrice() {
        Beverage beverage = new BlackTea();
        beverage.addTopping(new Milk());
        beverage.addTopping(new Caramel());
        beverage.addTopping(new Chocolate());
        beverage.addTopping(new Cinnamon());
        beverage.addTopping(new Lemon());

        double expected = 13;
        double actual = beverage.totalCost();
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void testGreenTeaPrice() {
        Beverage beverage = new GreenTea();
        beverage.addTopping(new Milk());
        beverage.addTopping(new Caramel());
        beverage.addTopping(new Chocolate());
        beverage.addTopping(new Cinnamon());
        beverage.addTopping(new Lemon());

        double expected = 12;
        double actual = beverage.totalCost();
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void testCocoaPrice() {
        Beverage beverage = new Cocoa();
        beverage.addTopping(new Milk());
        beverage.addTopping(new Caramel());
        beverage.addTopping(new Chocolate());
        beverage.addTopping(new Cinnamon());
        beverage.addTopping(new Lemon());

        double expected = 19;
        double actual = beverage.totalCost();
        Assert.assertEquals(expected, actual, 0);
    }

}
