package Eight;

public class Sandwich extends PortableLunch{
    private Bread b=new Bread();
    private Cheese c=new Cheese();
    private Lettuce l=new Lettuce();
    private Pickle e=new Pickle();
    public Sandwich(){System.out.println("Sandwich");}

    public static void main(String[] args) {
        new Sandwich();
    }
}
