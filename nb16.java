//create a java application where we have one class it contain two instance variables and a non-static method m1 having parameter and return type and another non static method m2 having object as parameter and return nothing print those variables under in these method and invoke these method under main method and by using two different object when print those variables we should get the values that we have given while creating first object.

import java.util.Scanner;

class A{
        static Scanner sc = new Scanner(System.in);
        boolean a = sc.nextBoolean();
        char b = sc.next().charAt(0);
        
        int m1(String c){
        System.out.println(c);
        return sc.nextInt();
        }
        void m2(A obj){
        System.out.println(obj.a);
        System.out.println(obj.b);
        }
        
        public static void main(String[] args){
        A obj = new A();
        A gen = new A();
        System.out.println(obj.m1(sc.next()));
        gen.m2(obj);
        }
}
        