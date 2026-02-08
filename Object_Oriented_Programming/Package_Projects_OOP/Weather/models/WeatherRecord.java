package models;

public class WeatherRecord {
    private double temperature;
    private double humidity;
    private double pressure;
    private String cityName;

    public WeatherRecord(String cityName, double temperature, double humidity, double pressure) {
        this.cityName = cityName;
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
    }

    public void display() {
        System.out.println("\n[Weather Report for " + cityName + "]");
        System.out.println("Temperature: " + temperature + "°C");
        System.out.println("Humidity: " + humidity + "%");
        System.out.println("Pressure: " + pressure + " hPa");
    }

    // Getters
    public double getTemperature() { return temperature; }
    public double getHumidity() { return humidity; }
    public double getPressure() { return pressure; }
    public String getCityName() { return cityName; }
}
