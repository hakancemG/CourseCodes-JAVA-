package hakancemgercek.abstractclasses;

public class AbstractClasses {

    public static void main(String[] args) {
        Square ref_square  = new Square("Square1",4);
        ref_square.calculateArea();
        System.out.println("--------------------------------------");
        Circle ref_circle = new Circle("Circle1", 5);
        ref_circle.calculateArea();
        System.out.println("--------------------------------------");
        Shape ref_shape = new Square("Square2", 3);
        Shape ref_shape2 = new Circle("Circle3",2);
        ref_shape.viewName();
        ref_shape2.viewName();
    }
}
public abstract class Shape {
    private String name;
    
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    
    public Shape(String name){
        this.name = name;
    }
    
    public void viewName(){
        System.out.println("The name of the shape is: "+name);
                
    }
    abstract void calculateArea();
}
public class Square extends Shape{
    
    private int edge;
    
    public int getEdge(){
        return edge;
    }
    
    public void setEdge(int edge){
        this.edge = edge;
    }
    
    public Square(String name, int edge){
        super(name);
        this.edge = edge;
    }
        
    @Override
    void calculateArea(){
        System.out.println("The area of "+getName()
                                 +" "+(edge*edge));
    }
}
public class Circle extends Shape {
    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    
    public Circle(String name, int radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    void calculateArea() {
        System.out.println("The area of "+getName()
                     +" "+(Math.PI*radius*radius));
    }
    
}
