package Code_Signal_Course_Java.Creational_Design_Patterns.BuilderPattern.Smartphone;

public class Main {
    public static void main(String[] args) {
        Smartphone phone = new Smartphone.SmartphoneBuilder("BrandX", "ModelY")
                .setFrontCamera(true)
                .setWirelessCharging(true)
                .setExpandableStorage(true)
                .build();

        System.out.println("Brand: " + phone.getBrand());
        System.out.println("Model: " + phone.getModel());
        System.out.println("Has front camera: " + phone.hasFrontCamera());
        System.out.println("Has wireless charging: " + phone.hasWirelessCharging());
        System.out.println("Has expandable storage: " + phone.hasExpandableStorage());
    }
}