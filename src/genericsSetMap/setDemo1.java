package genericsSetMap;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

// HashSet -> muito rápido, mas não garante a ordem
// TreeSet -> mais lento, mas ordena os dados
// LinkedHashSet -> velocidade intermediária, mas mantém a ordem inserida

public class setDemo1 {
    public static void main(String[] args) {

        Set<String> set = new LinkedHashSet<>();
        set.add("Tv");
        set.add("Tablet");
        set.add("Notebook");

        set.removeIf(x -> x.charAt(0) == 'T');

        for (String s : set){
            System.out.println(s);
        }
    }
}