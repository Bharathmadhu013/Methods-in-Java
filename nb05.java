//create a java application where we have one class it contain two static variables and two non-static variables and two non-static method m1,m2 having no parameter and returns nothing then print those variable under these two method and then invoke these method under main method by using 2 different object by providing dynamic input.

import java.util.Scanner;

class A{
        static Scanner sc = new Scanner(System.in);
        static long a = sc.nextLong();
        static double b = sc.nextDouble();
        char c = sc.next().charAt(0);
        byte d = sc.nextByte();
    
        void m1(){
        System.out.println("Long value of obj: " + a);
        System.out.println("Double value of obj: " + b);
        System.out.println("Char value of obj: " + c);
        System.out.println("Byte value of obj: " + d);
        return;
        }
        void m2(){
        System.out.println("Long value of obj1: " + a);
        System.out.println("Double value of obj1: " + b);
        System.out.println("Char value of obj1: " + c);
        System.out.println("Byte value of obj1: " + d);
        return;
        }
        public static void main(String[] args){
        A obj = new A();
        A obj1 = new A();

        obj.m1();
        obj1.m2();
        }
}

        
  
         