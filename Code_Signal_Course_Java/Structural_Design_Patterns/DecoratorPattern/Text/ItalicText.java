package Code_Signal_Course_Java.Structural_Design_Patterns.DecoratorPattern.Text;

public class ItalicText extends TextDecorator {
    public ItalicText(Text text) {
        super(text);
    }

    @Override
    public String format() {
        return "<i>" + super.format() + "</i>";
    }
}