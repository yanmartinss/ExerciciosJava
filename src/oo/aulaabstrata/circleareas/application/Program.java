package oo.aulaabstrata.circleareas.application;

import oo.aulaabstrata.circleareas.entities.Circle;
import oo.aulaabstrata.circleareas.entities.Color;
import oo.aulaabstrata.circleareas.entities.Rectangle;
import oo.aulaabstrata.circleareas.entities.Shape;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

    void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Shape> list = new ArrayList<>();

        IO.print("Enter the number of shapes: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.printf("Shape #%d data:%n", i);
            IO.print("Rectangle or Circle (r/c)? ");
            String format = sc.next();
            IO.print("Color (BLACK/RED/BLUE): ");
            Color color = Color.valueOf(sc.next());
            if (format.equals("r")) {
                IO.print("Width: ");
                double width = sc.nextDouble();
                IO.print("Height: ");
                double height = sc.nextDouble();
                list.add(new Rectangle(color, width, height));
            } else if (format.equals("c")) {
                IO.print("Radius: ");
                double radius = sc.nextDouble();
                list.add(new Circle(color, radius));
            }
        }

        IO.println("SHAPE AREAS:");
        for (Shape s : list) {
            System.out.println(String.format("%.2f", s.area()));
        }


        sc.close();
    }

}
