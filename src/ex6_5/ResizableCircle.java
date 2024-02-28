package ex6_5;

public class ResizableCircle extends Circle implements Resizable {

    public ResizableCircle(double r) {
        super(r);
    }

    @Override
    public double resize(int percent) {
        r = r * (1 + percent / 100.0);
        return r;
    }
}
