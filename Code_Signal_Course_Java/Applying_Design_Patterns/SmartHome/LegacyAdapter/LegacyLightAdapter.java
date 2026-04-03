package Code_Signal_Course_Java.Applying_Design_Patterns.SmartHome.LegacyAdapter;

public class LegacyLightAdapter implements SmartDevice {
    private LegacyLight legacyLight;
    public LegacyLightAdapter(LegacyLight light) { this.legacyLight = light; }
    @Override public void turnOn() { legacyLight.switchOn(); }
    @Override public void turnOff() { legacyLight.switchOff(); }
}
