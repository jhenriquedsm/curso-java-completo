package genericsSetMap.example02.application;

import genericsSetMap.example02.entities.Product;
import genericsSetMap.example02.services.CalculationService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/*
in.txt:
Computer,890.50
IPhone X,910.00
Tablet,550.00
 */

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();
        String path = "C:\\Temp\\in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))){

            String line = br.readLine();
            while (line != null){
                String[] fields = line.split(",");
                list.add(new Product(fields[0], Double.parseDouble(fields[1])));
                line = br.readLine();
            }

            Product mostExpensive = CalculationService.max(list);
            System.out.println("Most expensive:");
            System.out.println(mostExpensive);
        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}