package genericsSetMap;

import genericsSetMap.example06.entities.Product;

import java.util.HashMap;
import java.util.Map;

public class mapDemo2 {
    public static void main(String[] args) {

        Map<Product, Integer> stock = new HashMap<>();

        Product p1 = new Product("Tv", 900.0);
        Product p2 = new Product("Notebook", 1200.0);
        Product p3 = new Product("Tablet", 400.0);

        stock.put(p1, 10000);
        stock.put(p2, 20000);
        stock.put(p3, 15000);

        Product ps = new Product("Tv", 900.0);

        System.out.println("Contains 'ps' key: " + stock.containsKey(ps));
    }
}