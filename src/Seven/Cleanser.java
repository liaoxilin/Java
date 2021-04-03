package Seven;

public class Cleanser {
    private String s="Cleanser";
    public void append(String a){s+=a;}
    public void dilute(){append("apple()");}
    public void apply(){append("apply()");}
    public void scrub(){append("scrub()"); }
    public String toString(){return s;}

    public static void main(String[] args) {
        Cleanser X=new Cleanser();
        X.dilute();
        X.apply();
        X.scrub();
        System.out.println(X);
    }
}
