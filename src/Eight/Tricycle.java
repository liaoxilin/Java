package Eight;

public class Tricycle extends Cycle{
    void ride(Cycle i){
        System.out.println("Tricycle.ride");
    }

    public static void main(String[] args) {
        Tricycle a=new Tricycle();
        a.ride(a);
        Bicycle b=new Bicycle();
        b.ride(b);
        Unicycle c=new Unicycle();
        c.ride(c);
    }
}
