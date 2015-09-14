package week2.homework.coffeeHouse;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Home on 04.09.2015.
 */
public enum PriceList {
    PRICES;
    Map<String, Double> priceList = new HashMap<String, Double>();

    PriceList() {
        setup();
    }

    private void setup() {
        String path = getClass().getClassLoader().getResource("prices").getFile();
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(path));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] itemInfo = line.split("=");
                String description = itemInfo[0].trim();
                double price = Double.parseDouble(itemInfo[1].trim());
                priceList.put(description, price);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public double getPrice(String name) {
        return priceList.get(name);
    }
}
