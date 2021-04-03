package Nine;

import Eight.Note;

public class Percussion implements Instru,Playable {
    public void play(Note n){
        System.out.println("Percussion.play"+n);
    }
    public String what(){return "Instrument";}
    public void adjust(){

    }
}
