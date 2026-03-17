package Java_Project_Package.MusicPlayer;

import Object_Oriented_Programming.InterfaceBasics.InterfaceBasics;
import Object_Oriented_Programming.InterfaceBasics.MusicPlayer;

public class Song {
    private String title;
    private String artist;

    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    public String toString() {
        return title + " - " + artist;
    }
}
