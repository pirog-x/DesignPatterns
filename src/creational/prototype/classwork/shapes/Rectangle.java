package creational.prototype.classwork.shapes;

public class Rectangle extends Shape {
    private int height;
    private int width;

    public Rectangle() {}

    public Rectangle(Rectangle another) {
        super(another);
        if (another == null) return;

        height = another.height;
        width = another.width;
    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;

        Rectangle rectangle = (Rectangle) obj;
        return height == rectangle.height &&
               width == rectangle.width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
