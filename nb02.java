//create a java application where we have one class contain one non static method having string has parameter and return integer type of value and another non-static method m2 having float as parameter and returns string, then invoke these method under main method by providing dynamic inputs.

import java.util.Scanner;
    
class A{
        static Scanner sc = new Scanner(System.in);
        int m1(String a){
        int a1 = sc.nextInt();
        System.out.println(a);
        return a1;
        }
        String m2(float b){
        String a2 = sc.next();
        System.out.println(b);
        return a2;
        }
        public static void main(String[] args){
        A obj = new A();
        String a = sc.next();
        float b = sc.nextFloat();
        System.out.println(obj.m1(a));
        System.out.println(obj.m2(b));
        }
}