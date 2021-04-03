package Seven;

public class SpaceShipDelegation {
    private String name;
    private SpaceShipControl control=new SpaceShipControl();
    public SpaceShipDelegation(String name){
        this.name=name;
    }

    public void back(int velocity){
        control.down(velocity);
    }
    public void forward(int velocity){
        control.left(velocity);
    }
    public void left(int velocity){
        control.left(velocity);
    }
    public void right(int velocity){
        control.right(velocity);
    }
    public void turboBoost(){
        control.turboBoost();
    }
    public void up(int velocity){
        control.up(velocity);
    }

    public static void main(String[] args) {
        SpaceShipDelegation protrctor=new SpaceShipDelegation("NESA Protrctor");
        protrctor.forward(100);
    }
}
