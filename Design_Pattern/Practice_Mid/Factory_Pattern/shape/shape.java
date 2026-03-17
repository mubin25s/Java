package Design_Pattern.Practice_Mid.Factory_Pattern.shape;

public class shape {
    public static void main(String[] args) {
        IShape s = ShapeFactory.getShape("Circle");
        if (s != null) s.draw();
    }
}
