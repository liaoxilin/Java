package Nine;

import Eight.Note;

public class Stringed implements Instru ,Playable{
    public void play(Note n){
        System.out.println("Stringed.play"+n);
    }
    public String what(){return "Stringed";}
    public void adjust(){

    }
}
