package Code_Signal_Course_Java.Behavioral_Design_Patterns.TemplateMethod.CookingRecipe;

public class PastaRecipe extends Recipe {
    @Override protected void prepareIngredients() { System.out.println("Boiling pasta and preparing sauce"); }
    @Override protected void addCondiments() { System.out.println("Adding parmesan cheese and basil"); }
}
