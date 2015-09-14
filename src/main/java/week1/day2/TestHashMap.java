package week1.day2;

import java.util.TreeMap;

/**
 * Created by Home on 27.08.2015.
 */
public class TestHashMap {
    public static void main(String[] args) {
        MyHashMap<Integer, String> map = new MyHashMap<>();

        map.put(6, "66");
        map.put(17, "16");
        map.put(1, "16");
        map.put(2, "22");
        map.put(3, "16");
        map.put(4, "16");

        System.out.println("size = " + map.size());
        //System.out.println(map.get(6));
        //System.out.println(map.get(2));

        System.out.println(map.removeR(2));
        System.out.println(map.removeR(6));
        System.out.println("size = " + map.size());
        System.out.println(map.toString());

    }
}
