package Ten;

import Six.Connect;

public class Parcel7 {
    public Connect connect(){
        return new Connect(){
            private int i=11;
            public int value(){return i;}
        };
    }

    public static void main(String[] args) {
        Parcel7 p=new Parcel7();
        Connect c=p.connect();
    }
}
