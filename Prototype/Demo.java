package Prototype;

import java.util.ArrayList;
import java.util.List;

import Prototype.shapes.Circle;
import Prototype.shapes.Rectangle;
import Prototype.shapes.Shape;

public class Demo {
    public static void main(String[] args){
        List<Shape> shapes = new ArrayList<>();
        List<Shape> shapesCopy = new ArrayList<>();

        Circle circle = new Circle();
        circle.x = 10;
        circle.y =20;
        circle.radius = 15;
        circle.color = "red";
        shapes.add(circle);

        Circle anothCircle = (Circle) circle.clone();
        shapes.add(anothCircle);

        Rectangle rectangle = new Rectangle();
        rectangle.width = 10; 
        rectangle.height = 20;
        rectangle.color = "blue";
        shapes.add(rectangle);

        cloneAndCompare(shapes, shapesCopy);
    }

    private static void cloneAndCompare(List<Shape> shapes, List<Shape> shapesCopy){
        for (Shape shape : shapes){
            shapesCopy.add(shape.clone());
        }

        for(int i = 0; i< shapes.size(); i++){
            if(shapes.get(i) != shapesCopy.get(i)){
                System.out.println(i+ ": Shapes are different objects!");

                if(shapes.get(i).equals(shapesCopy.get(i))){
                    System.out.println(i + ": and the are indentical ");
                }else{
                    System.out.println(i + ": but the are not indentical ");
                }
            }else{
                System.out.println(i+": Shape objects are the same! ");
            }
        }
    }
}
