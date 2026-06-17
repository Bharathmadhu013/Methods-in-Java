//create a java application where we have one class it contain a static method m1 having object as parameter and return nothing and non-static method m2 having parameter and return type and then invoke m2 under m1 and m1 under main method by providing dynamic inputs.

import java.util.*;

class A{
        static Scanner sc = new Scanner(System.in);

        static void m1(A a){
        System.out.println(a);
        System.out.println(a.m2(sc.next()));
        return;
        }
        
        int m2(String b){
        System.out.println(b);
        return sc.nextInt();
        }
        public static void main(String[] args){
        A obj = new A();
        m1(obj);
        }
} 


        