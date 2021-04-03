package Eight;

public class Animal extends LivingCreatere{
    private Characteristic p=new Characteristic("has heart");
    private Description t=new Description("Animal not Vegetable");
    Animal(){
        System.out.println("Animal()");
    }
    protected void dispose(){
        System.out.println("Animal dispose");
        t.dispose();
        p.dispose();
        super.dispose();
    }

}
