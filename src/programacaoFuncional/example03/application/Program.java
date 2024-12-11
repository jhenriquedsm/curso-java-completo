package programacaoFuncional.example03.application;

import programacaoFuncional.example03.entities.Product;
import programacaoFuncional.example03.util.PriceUpdate;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.00));
        list.add(new Product("HD Case", 80.90));

        list.forEach(new PriceUpdate());

        list.forEach(System.out::println);
    }
}