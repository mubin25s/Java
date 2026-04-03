package Code_Signal_Course_Java.Structural_Design_Patterns.FacadePattern.HomeTheater;

public class HomeTheaterFacade {
    private DVDPlayer dvdPlayer;
    private Projector projector;
    private SoundSystem soundSystem;
    private TheaterLights lights;

    public HomeTheaterFacade(DVDPlayer dvd, Projector proj, SoundSystem sound, TheaterLights light) {
        this.dvdPlayer = dvd;
        this.projector = proj;
        this.soundSystem = sound;
        this.lights = light;
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        lights.dim(10);
        projector.on();
        projector.wideScreenMode();
        soundSystem.on();
        soundSystem.setVolume(5);
        dvdPlayer.on();
        dvdPlayer.play(movie);
    }

    public void endMovie() {
        System.out.println("Shutting movie theater down...");
        dvdPlayer.stop();
        dvdPlayer.off();
        soundSystem.off();
        projector.off();
        lights.on();
    }
}
