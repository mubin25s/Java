package Code_Signal_Course_Java.Behavioral_Design_Patterns.Unit_3_TemplateMethod.CookingRecipe;

public abstract class Recipe {
    public final void cook() {
        prepareIngredients();
        heat();
        addCondiments();
        serve();
    }
    protected abstract void prepareIngredients();
    protected void heat() { System.out.println("Heating the ingredients..."); }
    protected abstract void addCondiments();
    protected void serve() { System.out.println("Serving the dish!"); }
}
