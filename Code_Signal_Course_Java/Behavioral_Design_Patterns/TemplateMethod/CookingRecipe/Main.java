package Code_Signal_Course_Java.Behavioral_Design_Patterns.TemplateMethod.CookingRecipe;

public class Main {
    public static void main(String[] args) {
        System.out.println("Cooking Tea:");
        new TeaRecipe().cook();
        
        System.out.println("\nCooking Pasta:");
        new PastaRecipe().cook();
    }
}
