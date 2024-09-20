package herancaPolimorfismo.abstrato;

import herancaPolimorfismo.abstrato.entities.Circle;
import herancaPolimorfismo.abstrato.entities.Rectangle;
import herancaPolimorfismo.abstrato.entities.Shape;
import herancaPolimorfismo.abstrato.entities.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Shape> shapes = new ArrayList<>();

        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            System.out.println("Shape #" + i + " data:");
            System.out.print("Rectangle or Circle (r/c)? ");
            char shape = sc.next().charAt(0);
            System.out.print("Color (BLACK/BLUE/RED): ");
            sc.nextLine();
            Color color = Color.valueOf(sc.next());
            if (shape == 'r'){
                System.out.print("Width: ");
                Double width = sc.nextDouble();
                System.out.print("Heigth: ");
                Double heigth = sc.nextDouble();
                shapes.add(new Rectangle(color, width, heigth));
            } else {
                System.out.print("Radius: ");
                Double radius = sc.nextDouble();
                shapes.add(new Circle(color, radius));
            }
        }

        System.out.println("\nSHAPES AREAS:");
        for (Shape shape : shapes){
            System.out.println(String.format("%.2f", shape.area()));
        }

        sc.close();
    }
}