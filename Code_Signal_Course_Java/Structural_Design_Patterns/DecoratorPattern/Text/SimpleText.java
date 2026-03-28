package Code_Signal_Course_Java.Structural_Design_Patterns.DecoratorPattern.Text;

public class SimpleText implements Text {
    private String text;

    public SimpleText(String text) {
        this.text = text;
    }

    @Override
    public String format() {
        return text;
    }
}