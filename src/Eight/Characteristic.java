package Eight;

public class Characteristic {
    private String s;
    Characteristic(String s){
        this.s=s;
        System.out.println("Creating Character "+s);
    }

    protected void dispose(){
        System.out.println("disposing Character "+s);
    }
}
