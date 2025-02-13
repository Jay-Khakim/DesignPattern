package DesignPattern.Proxy;

public class RealImage implements Image {
    private String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadImageFromDisk(); // Simulate a resource-intensive operation
    }

    private void loadImageFromDisk() {
        System.out.println("Loading image from disk: " + filename);
        try {
            Thread.sleep(2000); // Simulate a delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public void display() {
        System.out.println("Displaying image: " + filename);
    }

}
