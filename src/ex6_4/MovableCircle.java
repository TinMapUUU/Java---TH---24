package ex6_4;

public class MovableCircle implements Movable {
    private MovablePoint center;
    private int r;

    public MovableCircle(int x, int y, int radius) {
        this.center = new MovablePoint(x, y);
        this.r = radius;
    }

    @Override
    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }

    @Override
    public String toString() {
        return "MovableCircle [center = " + center + ", "
        	  + "radius = " + r + "]";
    }
}
