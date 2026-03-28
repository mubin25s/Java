package Code_Signal_Course_Java.Structural_Design_Patterns.DecoratorPattern.Beverage;

public class Main {
    public static void main(String[] args) {
        Beverage blackCoffee = new BasicCoffee();
        System.out.println(blackCoffee.getDescription()); // Black Coffee

        Beverage coffeeWithMilk = new MilkDecorator(new BasicCoffee());
        System.out.println(coffeeWithMilk.getDescription()); // Black Coffee + Milk

        Beverage coffeeWithSugar = new SugarDecorator(new BasicCoffee());
        System.out.println(coffeeWithSugar.getDescription()); // Black Coffee + Sugar

        Beverage coffeeWithMilkAndSugar = new SugarDecorator(new MilkDecorator(new BasicCoffee()));
        System.out.println(coffeeWithMilkAndSugar.getDescription()); // Black Coffee + Milk + Sugar
    }
}