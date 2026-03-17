package Java_Project_Package.MusicPlayer;

import Object_Oriented_Programming.InterfaceBasics.InterfaceBasics;
import Object_Oriented_Programming.InterfaceBasics.MusicPlayer;

public class Main {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();
        playlist.addSong(new Song("Bohemian Rhapsody", "Queen"));
        playlist.addSong(new Song("Imagine", "John Lennon"));
        playlist.playAll();
    }
}
