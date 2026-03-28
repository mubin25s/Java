package Code_Signal_Course_Java.Structural_Design_Patterns.DecoratorPattern.Text;

public class BoldText extends TextDecorator {
    public BoldText(Text text) {
        super(text);
    }

    @Override
    public String format() {
        return "<b>" + super.format() + "</b>";
    }
}