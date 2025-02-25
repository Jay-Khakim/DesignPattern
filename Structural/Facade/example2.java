package Facade;

// Subsystem classes
class DVDPlayer {
    void on() { System.out.println("DVD Player ON"); }
    void play(String movie) { System.out.println("Playing movie: " + movie); }
    void off() { System.out.println("DVD Player OFF"); }
}

class Projector {
    void on() { System.out.println("Projector ON"); }
    void wideScreenMode() { System.out.println("Projector in widescreen mode"); }
    void off() { System.out.println("Projector OFF"); }
}

class SoundSystem {
    void on() { System.out.println("Sound System ON"); }
    void setVolume(int level) { System.out.println("Volume set to " + level); }
    void off() { System.out.println("Sound System OFF"); }
}


// Facade class
class HomeTheaterFacade {
    private DVDPlayer dvd;
    private Projector projector;
    private SoundSystem sound;

    public HomeTheaterFacade(DVDPlayer dvd, Projector projector, SoundSystem sound) {
        this.dvd = dvd;
        this.projector = projector;
        this.sound = sound;
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        projector.on();
        projector.wideScreenMode();
        sound.on();
        sound.setVolume(5);
        dvd.on();
        dvd.play(movie);
    }

    public void endMovie() {
        System.out.println("Shutting movie theater down...");
        dvd.off();
        sound.off();
        projector.off();
    }
}

public class examole2 {
    public static void main(String[] args) {
        DVDPlayer dvd = new DVDPlayer();
        Projector projector = new Projector();
        SoundSystem sound = new SoundSystem();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(dvd, projector, sound);

        homeTheater.watchMovie("Inception");
        homeTheater.endMovie();
    }
}
