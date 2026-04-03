package Code_Signal_Course_Java.Behavioral_Design_Patterns.Unit_3_TemplateMethod.CookingRecipe;

public class TeaRecipe extends Recipe {
    @Override protected void prepareIngredients() { System.out.println("Boiling water and tea leaves"); }
    @Override protected void addCondiments() { System.out.println("Adding lemon and honey"); }
}
