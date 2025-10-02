public class Tv implements Device {
    private boolean on = false;
    private int volume = 50;

    @Override
    public void turnOn() {
        on = true;
        System.out.println("TV on");
    }
    @Override
    public void turnOff() {
        on = false;
        System.out.println("TV off");
    }
    @Override
    public void setVolume(int percent) {
        if (percent < 0) {
            volume = 0;
        } else if (percent > 100) {
            volume = 100;
        } else {
            volume = percent;
        }
        System.out.println("Sound = " + volume);
    }
    @Override
    public boolean isOn() {
        return on;
    }
    @Override
    public int getVolume() {
        return volume;
    }
}
