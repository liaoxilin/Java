package Eight;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class Music3 {
    public static void tunr(Instrument i){
        i.play(Note.MIDDLE_C);
    }
    public static void tuneALL(Instrument[] e){
        for(Instrument i:e)
            tunr(i);
    }

    public static void main(String[] args) {


        Instrument[] orchestra={
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind()
        };
        Instrument t=new Instrument();
        tunr(t);
        tuneALL(orchestra);
    }
}
