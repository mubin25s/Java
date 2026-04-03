package Code_Signal_Course_Java.Applying_Design_Patterns.Unit_3_Thermostats.SmartHome;

public class Thermostat {
    private int temperature;
    private String mode;
    private String name;

    private Thermostat(Builder builder) {
        this.temperature = builder.temperature;
        this.mode = builder.mode;
        this.name = builder.name;
    }

    public void showSettings() {
        System.out.println("Thermostat Name: " + name + ", Temperature: " + temperature + ", Mode: " + mode);
    }

    public static class Builder {
        private int temperature;
        private String mode;
        private String name;

        public Builder setName(String name) { this.name = name; return this; }
        public Builder setTemperature(int temperature) { this.temperature = temperature; return this; }
        public Builder setMode(String mode) { this.mode = mode; return this; }
        public Thermostat build() { return new Thermostat(this); }
    }
}
