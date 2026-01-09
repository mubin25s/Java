package Coffee;

public class CoffeeMachine {
    private int waterLevel;
    private int coffeeBeans;

    public CoffeeMachine(int water, int beans) {
        this.waterLevel = water;
        this.coffeeBeans = beans;
    }

    public void makeCoffee() {
        if (waterLevel >= 1 && coffeeBeans >= 1) {
            waterLevel--;
            coffeeBeans--;
            System.out.println("Coffee is ready!");
        } else {
            System.out.println("Not enough ingredients.");
        }
    }
}
