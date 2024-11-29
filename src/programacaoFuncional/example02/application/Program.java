package programacaoFuncional.example02.application;

import programacaoFuncional.example01.entities.Product;
import programacaoFuncional.example02.util.ProductPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Program {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.0));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.00));
        list.add(new Product("HD Case", 80.90));

        //list.removeIf(new ProductPredicate());
        //list.removeIf(Product::staticProductPredicate); // reference method
        // list.removeIf(Product::noStaticProductPredicate);
        // Predicate<Product> predicate = p -> p.getPrice() >= min; // lambda expression declared

        double min = 100.0;
        list.removeIf(p -> p.getPrice() >= min); // lambda expression inline

        for (Product p : list){
            System.out.println(p);
        }
    }
}