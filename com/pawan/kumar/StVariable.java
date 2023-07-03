package com.pawan.kumar;

public class StVariable {
    String name;
    static  String college="BCET";
    public  void display(){
        int a=10;
        int b=20;
        System.out.println(a);
        System.out.println(b);

    }
    public static void main(String[] args) {
        StVariable student=new StVariable();
        student.name="Aman";
        StVariable.college="ABC";
        System.out.println(student.name);
        System.out.println(StVariable.college);


        StVariable student1=new StVariable();
        student1.name="Pawan";

        System.out.println(student.name);
        System.out.println(StVariable.college);
        student1.display();
    }

}
