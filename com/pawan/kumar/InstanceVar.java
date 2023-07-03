package com.pawan.kumar;

public class InstanceVar {
    int a;
    String b;
    long l;

    public static void main(String[] args) {

        InstanceVar instanceVar = new InstanceVar();
        System.out.println(instanceVar.a);
        System.out.println(instanceVar.b);
        System.out.println(instanceVar.l);
    }
}
