package Code_Signal_Course_Java.Structural_Design_Patterns.DecoratorPattern.Text;

public class Main {
    public static void main(String[] args) {
        Text text = new SimpleText("Hello, World!");
        Text boldText = new BoldText(text);
        Text italicBoldText = new ItalicText(boldText);

        System.out.println(italicBoldText.format()); // <i><b>Hello, World!</b></i>
    }
}