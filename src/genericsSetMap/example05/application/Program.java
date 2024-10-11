package genericsSetMap.example05.application;

import genericsSetMap.example05.entities.Client;

public class Program {
    public static void main(String[] args) {

        Client c1 = new Client("Maria", "maria@email.com");
        Client c2 = new Client("Maria", "maria@email.com");

        String s1 = "Test";
        String s2 = "Test"; // compilador dá um tratamento especial quando é istanciado assim

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2));
        System.out.println(c1 == c2); // compara as referências de memória e não o conteúdo
        System.out.println(s1 == s2);
    }
}