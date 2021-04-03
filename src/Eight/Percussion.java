package Eight;

public class Percussion extends Instrument{
    public void play(Note n){
        System.out.println("Percussion.play"+n);
    }
    String what(){return "Instrument";}
    void adjust(){
        System.out.println("Adjusting Instrument");
    }
}
