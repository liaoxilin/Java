package Seven;

public class Frog extends Amphibian{
    @Override
    void set(Amphibian i){
        System.out.println("Frog");
    }
    public static void main(String[] args) {
        Frog frog=new Frog();
        frog.set(frog);
    }
}
