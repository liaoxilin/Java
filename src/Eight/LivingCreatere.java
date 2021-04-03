package Eight;

public class LivingCreatere {
    private Characteristic p=new Characteristic("is alive");
    private Description t=new Description("basic Living Creature");
    LivingCreatere(){
        System.out.println("LivingCreature()");
    }
    protected void dispose(){
        System.out.println("LivingCreature dispose");
        t.dispose();
        p.dispose();
    }
}
