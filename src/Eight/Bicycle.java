package Eight;

public class Bicycle extends Cycle{
    void ride(Bicycle i){
        int t=wheels(i);
        System.out.println("Bicycle.ride"+t);
    }

    public static void main(String[] args) {
        Bicycle a=new Bicycle();
        a.ride(a);
    }
}
