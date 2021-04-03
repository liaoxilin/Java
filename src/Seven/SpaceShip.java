package Seven;

public class SpaceShip extends SpaceShipControl{
    private String name ;
    public SpaceShip(String name ){this.name=name;}
    public String toString (){return name;}

    public static void main(String[] args) {
        SpaceShip protrcor = new SpaceShip("NSEA Protector");
        protrcor.forward(100);
    }

}
