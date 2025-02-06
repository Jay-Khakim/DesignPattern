package DesignPattern.Flyweight;

public class Circle implements Shape {
    private String color; // Intrinsic state: shared property

    public Circle(String color){
        this.color = color;
    }

    @Override
    public void draw(int x, int y){
        System.out.println("Drawing circle [Color: "+ color + ", x: " + x + ", y: " + y + "]");
    }

}
