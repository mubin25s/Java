package Code_Signal_Course_Java.Class_Object.Album;

import java.time.Year;

public class Album {
    private String title;
    private String genre;
    private int releaseYear;

    public Album(String title, String genre, int releaseYear) {
        this.title = title;
        this.genre = genre;
        this.releaseYear = releaseYear;
    }

    // Overloaded constructor with default release year as current year
    public Album(String title, String genre) {
        this.title = title;
        this.genre = genre;
        this.releaseYear = Year.now().getValue();
    }

    public void display() {
        System.out.println("Title: " + title + ", Genre: " + genre + ", Release Year: " + releaseYear);
    }
}