package Six;

public class Lunch {
    void testPrivate(){
      //  Soup1 soup1=new Soup1();
    }
    void teatStatic(){
        Soup1 soup=Soup1.makeSoup();
    }
    void testSingleton(){
        Soup2.access().f();
    }
}
