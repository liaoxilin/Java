package Nine;

import Eight.Note;

public class Music4 {
    public static void tunr(Playable i){
        i.play(Note.MIDDLE_C);
    }
    public static void tuneALL(Playable[] e){
        for(Playable i:e)
            tunr(i);
    }

    public static void main(String[] args) {


       Playable[] orchestra={
                new Wind(),
                new Percussion(),
                new Stringed(),
               new Brass(),
               new Woodwind()
       };
      tuneALL(orchestra);
    }
}
