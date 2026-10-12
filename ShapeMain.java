class Shape {
    protected String name;

    Shape(String name) {
        this.name = name;
    }

    void displayShapeName() {
        System.out.println("Shape: " + name);
    }
}

class Circle extends Shape {
    private double radius;

    Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    Rectangle(String name, double length, double width) {
        super(name);
        this.length = length;
        this.width = width;
    }

    double calculateArea() {
        return length * width;
    }
}

class ShapeManager {
    void displayAreas(Shape[] shapes) {
        for (int i = 0; i < shapes.length; i++) {
            shapes[i].displayShapeName();

            if (shapes[i] instanceof Circle) {
                Circle c = (Circle) shapes[i];
                System.out.println("Area: " + c.calculateArea());
            } else if (shapes[i] instanceof Rectangle) {
                Rectangle r = (Rectangle) shapes[i];
                System.out.println("Area: " + r.calculateArea());
            }
        }
    }
}

public class ShapeMain {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];

        shapes[0] = new Circle("Circle", 5);
        shapes[1] = new Rectangle("Rectangle", 6, 4);

        ShapeManager manager = new ShapeManager();
        manager.displayAreas(shapes);
    }
}