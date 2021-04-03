package Nine;

import Eight.Note;

public abstract class Instrument {
    private int i;
    public abstract void play(Note n);

    String what(){return "Instrument";}
    public  abstract void adjust();
}
