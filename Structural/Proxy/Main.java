package DesignPattern.Proxy;

public class Main {
    public static void main(String[] args){
        System.out.println("Creating proxy for image...");
        Image image = new ProxyImage("example.jpg");

        System.out.println("\nImage created. No disk operation yet.");

        // First call: Loads the image from disk
        System.out.println("\nFirst call to display():");
        image.display();

        // Second call: Uses the cached image
        System.out.println("\nSecond call to display():");
        image.display();
    }
}
