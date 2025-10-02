public class Remote {
    protected final Device device;

    public Remote(Device device) {
        this.device = device;
    }

    public void togglePower() {
        if (device.isOn()) device.turnOff();
        else device.turnOn();
    }

    public void volumeUp() {
        device.setVolume(device.getVolume() + 10);
    }

    public void volumeDown() {
        device.setVolume(device.getVolume() - 10);
    }
}
