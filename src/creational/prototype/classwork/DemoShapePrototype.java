package creational.prototype.classwork;


import creational.prototype.classwork.shapes.Circle;
import creational.prototype.classwork.shapes.Rectangle;
import creational.prototype.classwork.shapes.Shape;

import java.util.ArrayList;
import java.util.List;

class DemoShapePrototype {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        List<Shape> shapeCopy = new ArrayList<>();

        Circle circle = new Circle();
        circle.setX(10);
        circle.setY(20);
        circle.setRadius(6);
        circle.setColor("blue");
        shapes.add(circle);

        Rectangle rectangle = new Rectangle();
        rectangle.setX(40);
        rectangle.setY(10);
        rectangle.setHeight(20);
        rectangle.setHeight(90);
        rectangle.setColor("black");
        shapes.add(rectangle);

        cloneShapes(shapes, shapeCopy);
        compareShapes(shapes, shapeCopy);
    }

    private static void cloneShapes(List<Shape> shapes, List<Shape> clones) {
        for (Shape shape : shapes) {
            clones.add(shape.clone());
        }
    }

    private static void compareShapes(List<Shape> shapes, List<Shape> clones) {
        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) != clones.get(i)) {
                System.out.println(i + " - Different object");
                if (shapes.get(i).equals(clones.get(i))) {
                    System.out.println("Shapes is equals");
                } else {
                    System.out.println("Shapes isn't equals");
                }
            } else {
                System.out.println(i + " - Shapes is same object");
            }
        }
    }
}