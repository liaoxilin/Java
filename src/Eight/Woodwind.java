package Eight;

public class Woodwind extends Wind {
    public void play(Note n) {
        System.out.println("Woodwind.play" + n);
    }

    void adjust() {
        System.out.println("Adjusting Woodwind");
    }
}