package creational.prototype.classwork.shapes;

public abstract class Shape {
    private int x;
    private int y;
    private String color;

    public Shape() {
    }

    public Shape(Shape source) {
        if (source == null) return;

        this.x = source.x;
        this.y = source.y;
        this.color = source.color;
    }

    public abstract Shape clone();

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (obj.getClass() != this.getClass()) return false;
        Shape shape = (Shape) obj;

        return x == shape.x &&
                y == shape.y &&
                color.equals(shape.color);
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
