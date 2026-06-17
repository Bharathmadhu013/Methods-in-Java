//create a java application where we have one class contain two static and two instance variable, then print these variable under main method by providing dynamic inputs.

import java.util.Scanner;
   
class A{
        static Scanner sc = new Scanner(System.in);
        static int a = sc.nextInt();
        static float b = sc.nextFloat();
        String c = sc.next();
        boolean d = sc.nextBoolean();
        public static void main(String[] args){
        A obj = new A();
        System.out.println("Int value: " + a);
        System.out.println("Float value: " + b);
        System.out.println("String value: " + obj.c);
        System.out.println("Boolean value: " + obj.d);
        }
}
        