package Code_Signal_Course_Java.Behavioral_Design_Patterns.CommandPattern.TextEditor;

interface Command {
    void execute();
    void undo();
}

class TextEditor {
    private String text = "";
    public void addText(String newText) { text += newText; }
    public void deleteText(int length) { text = text.substring(0, text.length() - length); }
    public String getText() { return text; }
}

class AddTextCommand implements Command {
    private TextEditor editor;
    private String text;
    public AddTextCommand(TextEditor editor, String text) { this.editor = editor; this.text = text; }
    @Override public void execute() { editor.addText(text); }
    @Override public void undo() { editor.deleteText(text.length()); }
}

class CommandHistory {
    private java.util.Stack<Command> history = new java.util.Stack<>();
    public void push(Command c) { history.push(c); }
    public Command pop() { return history.pop(); }
    public boolean isEmpty() { return history.isEmpty(); }
}

public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        CommandHistory history = new CommandHistory();
        
        Command c1 = new AddTextCommand(editor, "Hello ");
        c1.execute();
        history.push(c1);
        
        Command c2 = new AddTextCommand(editor, "World!");
        c2.execute();
        history.push(c2);
        
        System.out.println("Text: " + editor.getText());
        
        history.pop().undo();
        System.out.println("After undo: " + editor.getText());
    }
}
