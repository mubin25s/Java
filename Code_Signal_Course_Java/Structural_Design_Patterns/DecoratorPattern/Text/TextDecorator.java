package Code_Signal_Course_Java.Structural_Design_Patterns.DecoratorPattern.Text;

public abstract class TextDecorator implements Text {
    protected Text decoratedText;

    public TextDecorator(Text text) {
        this.decoratedText = text;
    }

    @Override
    public String format() {
        return decoratedText.format();
    }
}