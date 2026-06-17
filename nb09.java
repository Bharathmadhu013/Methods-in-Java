//create a java application where we have one class it contain a non-static method m1 having parameter as string and return Boolean type of value and a static method m2 having parameter integer, long and return nothing then invoke m1 under main method if it is returns true then invoke m2 method or else print a user-friendly message by providing dynamic inputs.

import java.util.Scanner;

class A{
        static Scanner sc = new Scanner(System.in);
        boolean m1(String a){
        System.out.println("Enter string value: "+ a);
        return sc.nextBoolean();
        }
        static void m2(int b, long c){
        System.out.println("Enter int value: "+ b);
        System.out.println("Enter long value: "+ c);
        return;
        }
        public static void main(String[] args){
        A obj = new A();
        if(obj.m1(sc.next())==true){
           m2(sc.nextInt(), sc.nextLong());
        }
        else{
           System.out.print(sc.next());
        }
      }
}
        