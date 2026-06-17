//create a java application where we have one class it contain a non-static method m1 having integer, float as parameter and return Boolean type of value and another non-static method m2 having parameter as short, integer, long and return string type of value and another non-static method m3 having parameter as Boolean and return nothing and then invoke m1 under m2, m2 under m3 and m3 under main method by providing input.

import java.util.Scanner;
 
class A{
        static Scanner sc = new Scanner(System.in);
        
        boolean m1(int a, float b){
        boolean x = sc.nextBoolean();
        System.out.println("Enter int value: " + a);
        System.out.println("Enter float value: " + b);
        return x;
        }
        String m2(short c, int d, long e){
        String y = sc.next();
        System.out.println("Enter short value: " + c);
        System.out.println("Enter int value: " + d);
        System.out.println("Enter long value: " + e);
        System.out.println(m1(sc.nextInt(), sc.nextFloat()));
        return y;
        }
        void m3(boolean f){
        System.out.println("Enter boolean value: " + f);
        System.out.println(m2(sc.nextShort(), sc.nextInt(), sc.nextLong()));
        return;
        }
        
        public static void main(String[] args){
        A obj = new A();
        obj.m3(sc.nextBoolean());
        }
}

        
        