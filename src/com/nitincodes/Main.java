package com.nitincodes;

public class Main {

    public static void main(String[] args) {
	//
        Instance i1 = new Instance();
        Instance i2 = new Instance();
        Instance i3 = new Instance();
        Instance i4 = new Instance();
        System.out.println(Instance.d);
    }
}
class Instance{
    static int d = 0;
    Instance(){
        d++;
    }
}
