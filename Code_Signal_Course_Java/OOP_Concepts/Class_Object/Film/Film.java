package Code_Signal_Course_Java.OOP_Concepts.Class_Object.Film;

public class Film {
    private String title;
    private String director;

    public Film(String title, String director) {
        this.title = title;
        this.director = director;
    }

    public void display() {
        System.out.println("Title: " + title + ", Director: " + director);
    }
}