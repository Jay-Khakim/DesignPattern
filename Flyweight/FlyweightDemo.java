package DesignPattern.Flyweight;


public class FlyweightDemo {
    public static void main(String[] arg){
        Shape circle1 = ShapeFactory.getCircle("Red");
        circle1.draw(10, 20);

        Shape circle2 = ShapeFactory.getCircle("Blue");
        circle2.draw(15, 25);

        Shape circle3 = ShapeFactory.getCircle("Red");
        circle3.draw(30, 35); // Reuses the "Red" Circle

        Shape circle4 = ShapeFactory.getCircle("Green");
        circle4.draw(40, 45);

        Shape circle5 = ShapeFactory.getCircle("Blue");
        circle5.draw(50, 55); // Reuses the "Blue" Circle
    }
}
