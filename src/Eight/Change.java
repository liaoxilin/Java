package Eight;

public class Change {
    private Tab tab=new Tab1();
    public void change(){
        tab=new Tab2();
    }
    public void change2(){
        tab=new Tab3();
    }
    public void perform(){
        tab.t();
    }
}
