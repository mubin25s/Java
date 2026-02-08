package sensors;
import java.util.Random;

public class TemperatureSensor implements Sensor {
    private Random random = new Random();

    @Override
    public double readValue() {
        // Simulating values between -10 and 40
        return Math.round((random.nextDouble() * 50 - 10) * 100.0) / 100.0;
    }

    @Override
    public String getSensorType() {
        return "Temperature";
    }
}
