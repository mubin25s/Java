public interface shape{
    void draw();
}

class Circle implements shape{
    public void draw(){
        System.out.println("Circle");
    }
}

class Square implements shape{
    public void draw(){
        System.out.println("Square");
    }
}

class Rectangle implements shape{
    public void draw(){
        System.out.println("Rectangle");
    }
}

class ShapeFactory{
    public static shape getShape(String type){
        if(type.equals("Circle")){
            return new Circle();
        }else if(type.equals("Square")){
            return new Square();
        }else if(type.equals("Rectangle")){
            return new Rectangle();
        }else{
            return null;
        }
    }
}

public class Shape {
    public static void main(String[] args) {
        shape s = ShapeFactory.getShape("Circle");
        s.draw();
    }
}