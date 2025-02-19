package DesignPattern.Facade.complex_media_liblary;

import java.io.File;

public class Demo {
    public static void main(String[] args){
        VideoConversionFacade converter = new VideoConversionFacade();
        File mp4Video = converter.convertVideo("yourubevideo.ogg", "mp4");
    }
}
