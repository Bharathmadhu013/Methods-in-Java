//create a java application where we have one class it contain a instance variable, a non-static method m1 having parameter and return type and static method m2 having parameter and return type and non-static method m3 having parameter and return type they m1 under m2, m2 under m3, m3 under main method by providing dynamic input.

import java.util.Scanner;

class A{
        static Scanner sc = new Scanner(System.in);

        String a = sc.next();
        int m1(float b){
        System.out.println("Enter float value: " + b);
        return sc.nextInt();
        }
        static long m2(char c){
        System.out.println("Enter char value: " + c);
        A obj1 = new A();
        System.out.println(obj1.m1(sc.nextFloat()));     
        return sc.nextLong();
        }
        boolean m3(byte d){
        System.out.println("Enter byte value: " + d);
        System.out.println(m2(sc.next().charAt(0)));
        return sc.nextBoolean();
        }
        public static void main(String[] args){
        A obj = new A();
        obj.m3(sc.nextByte());
        }
}
        