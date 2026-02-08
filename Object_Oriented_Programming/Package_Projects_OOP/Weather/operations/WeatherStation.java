package operations;

import models.WeatherRecord;
import sensors.Sensor;
import sensors.TemperatureSensor;
import sensors.HumiditySensor;
import java.util.ArrayList;
import java.util.List;

public class WeatherStation {
    private String stationId;
    private String location;
    private List<Sensor> sensors;

    public WeatherStation(String stationId, String location) {
        this.stationId = stationId;
        this.location = location;
        this.sensors = new ArrayList<>();
        
        // Auto-initialize with standard sensors
        sensors.add(new TemperatureSensor());
        sensors.add(new HumiditySensor());
    }

    public WeatherRecord computeCurrentWeather() {
        double temp = 0;
        double hum = 0;
        
        for (Sensor s : sensors) {
            if (s.getSensorType().equals("Temperature")) temp = s.readValue();
            if (s.getSensorType().equals("Humidity")) hum = s.readValue();
        }
        
        // Simulating pressure
        double pressure = 1013.25; 
        
        return new WeatherRecord(location, temp, hum, pressure);
    }

    public void displayStationDetails() {
        System.out.println("Station: " + stationId + " | Location: " + location);
        System.out.println("Active Sensors: " + sensors.size());
    }
}
