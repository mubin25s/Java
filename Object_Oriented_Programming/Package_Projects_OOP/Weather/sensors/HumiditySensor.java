package sensors;
import java.util.Random;

public class HumiditySensor implements Sensor {
    private Random random = new Random();

    @Override
    public double readValue() {
        // Simulating values between 30% and 90%
        return Math.round((30 + random.nextDouble() * 60) * 100.0) / 100.0;
    }

    @Override
    public String getSensorType() {
        return "Humidity";
    }
}
