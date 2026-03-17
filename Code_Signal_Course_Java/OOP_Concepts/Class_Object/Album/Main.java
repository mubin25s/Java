package Code_Signal_Course_Java.OOP_Concepts.Class_Object.Album;

public class Main {
    public static void main(String[] args) {
        Album album1 = new Album("Abbey Road", "Rock", 1969);
        Album album2 = new Album("Green River", "Rock");

        album1.display();
        album2.display();
    }
}