package memoryArrayListas;

import java.util.ArrayList;
import java.util.List;

public class Lists {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("José");
        list.add("Maria");
        list.add("Amanda");
        list.add("Henrique");
        list.add(2, "Pedro");
        list.add(3, "Paulo");

        System.out.println("Size = " + list.size());

        for (String x : list) {
            System.out.println(x);
        }
        System.out.println("----------");

        list.remove(1);
        list.removeIf(x -> x.charAt(0) == 'P');

        for (String x : list) {
            System.out.println(x);
        }
        System.out.println("----------");
        System.out.println("Index of Henrique: " + list.indexOf("Henrique"));

        System.out.println("----------");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').toList();
        for (String x : result){
            System.out.println(x);
        }

        System.out.println("----------");
        String name = list.stream().filter(x -> x.charAt(0) == 'H').findFirst().orElse(null);
        System.out.println(name);

    }
}