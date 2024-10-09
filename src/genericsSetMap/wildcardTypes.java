package genericsSetMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class wildcardTypes {

    public static void main(String[] args) {
        List<?> myObjs = new ArrayList<>();
        List<Integer> myNumbers = new ArrayList<Integer>();
        myObjs = myNumbers;

        List<Integer> myInts = Arrays.asList(5, 2, 10);
        printList(myInts);

        List<String> myStrs = Arrays.asList("José", "Henrique", "José Henrique");
        printList(myStrs);
    }

    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}