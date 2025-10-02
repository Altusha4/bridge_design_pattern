public class Main {
    public static void main(String[] args) {
        Device tv = new Tv();
        Remote tvRemote = new Remote(tv);

        tvRemote.togglePower();
        tvRemote.volumeUp();
        tvRemote.volumeDown();
        tvRemote.togglePower();

        System.out.println("---");

        Device radio = new Radio();
        Remote radioRemote = new Remote(radio);
        radioRemote.togglePower();
        radioRemote.volumeUp();
    }
}