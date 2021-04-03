package Nine;

import Eight.Note;

public class Wind implements Instru,Playable {
    public void play(Note n){
        System.out.println("Wind.play()"+n);
    }
    public String what(){return "Wind";}
    public void adjust(){

    }
}
