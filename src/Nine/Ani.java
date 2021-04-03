package Nine;

public class Ani {
    public static void alleat(Rodent[] a){
        for(Rodent i:a){
            i.eat();
        }
    }

    public static void main(String[] args) {
        Rodent[] t={
                new Mouse(),
                new Gerbil(),
                new Hamster(),
        };
        alleat(t);


    }
}
