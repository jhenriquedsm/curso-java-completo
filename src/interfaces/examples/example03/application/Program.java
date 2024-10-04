package interfaces.examples.example03.application;

import interfaces.examples.example03.model.Printer;
import interfaces.examples.example03.model.Scanner;

public class Program {
    public static void main(String[] args) {
        Printer p = new Printer("1080");
        p.processDoc("My Letter");
        p.print("My Letter");

        Scanner s = new Scanner("2003");
        s.processDoc("My Email");
        System.out.println("Scan result: " + s.scan());
    }
}