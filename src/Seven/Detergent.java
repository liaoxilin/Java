package Seven;

public class Detergent {
    private String s="Cleanser";
    private Cleanser t=new Cleanser();
    public void append(String a){
        t.append(a);}
    public void dilute(){
        t.dilute();}
    public void apply(){t.apply();}
    public void scrub(){t.scrub(); }
    public String toString(){return s;}

    public static void main(String[] args) {
        Detergent x=new Detergent();
        x.dilute();
        x.apply();
        x.scrub();

        System.out.println("Testing base class");
        Cleanser.main(args);
    }
}
