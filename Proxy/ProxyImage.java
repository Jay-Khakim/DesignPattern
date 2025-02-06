package DesignPattern.Proxy;

public class ProxyImage implements Image {
    private String filename;
    private RealImage realImage; // The real object is loaded only when needed

    public ProxyImage(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(filename); // Lazy initialization
        }
        realImage.display();
    }
}
