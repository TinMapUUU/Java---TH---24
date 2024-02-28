package ex6_1;

public class Square extends Rectangle {
    public Square(double side) {
        super(side, side, "undefined", false);
    }

    public double getSide() {
        return width; // width and length are the same in a square
    }

    public void setSide(double side) {
        width = side;
        length = side;
    }

    @Override
    public void setWidth(double side) {
        setSide(side);
    }

    @Override
    public void setLength(double side) {
        setSide(side);
    }

    @Override
    public String toString() {
        return "Square[Rectangle[Shape[color=" + color + ", filled=" + filled + "], width=" + width + ", length=" + length + "]]";
    }
}
