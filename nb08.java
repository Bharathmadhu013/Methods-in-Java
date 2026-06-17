//create a java application where we having one class it contain a non-static variable and two non-static methods having parameter and return type and two static methods having parameter and return type then invoke non-static methods under static methods one each and static methods under main method. print that variable in any of the method by providing dynamic input. 

import java.util.Scanner;
 
class A{
        static Scanner sc = new Scanner(System.in);
        static A obj = new A();
        String a;
        int m1(byte b){
        System.out.println("Enter byte value: " + b);
        return sc.nextInt();
        }
        float m2(char c){
        System.out.println("Enter char value: " + c);
        return sc.nextFloat();
        }
        static long m3(boolean d){
        System.out.println("Enter boolean value: " + d);
        System.out.println(obj.m1(sc.nextByte()));
        return sc.nextLong();
        }
        static short m4(String e){
        System.out.println("Enter String value: " + e);
        System.out.println(obj.m2(sc.next().charAt(0)));
        return sc.nextShort();
        } 
        public static void main(String[] args){
        System.out.println(obj.a);
        System.out.println(m3(sc.nextBoolean()));
        System.out.println(m4(sc.next()));
        }
}