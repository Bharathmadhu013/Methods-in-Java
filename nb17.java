//create a java application where we have one class it contain a static method m1 having return type & no parameter and a non static method m2 having parameter and return type then invoke these two method under main method without using object or by using object reference

import java.util.Scanner;

class A{
        static Scanner sc = new Scanner(System.in);
        static A m1(){
        System.out.println("Default Msg....");
        return new A();
        }
        float m2(int a){
        System.out.println(a);
        return sc.nextFloat();
        }
        public static void main(String[] args){
        A n = m1();
        System.out.println(n.m2(sc.nextInt()));
        }
}