package creational.prototype.classwork.shapes;

public class Circle extends Shape {
    private int radius;

    public Circle() {}

    public Circle(Circle circle) {
        super(circle);
        if (circle != null) {
            radius = circle.radius;
        }
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj.getClass() != this.getClass() || !super.equals(obj)) {
            return false;
        }
        Circle circle = (Circle) obj;
        return radius == circle.radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
