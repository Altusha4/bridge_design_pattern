public interface Device {
    void turnOn();
    void turnOff();
    void setVolume(int percent);
    boolean isOn();
    int getVolume();
}
