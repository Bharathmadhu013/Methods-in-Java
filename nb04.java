//create a java application where we have one class it contain a non-static method m1 having integer as parameter and return string value and a static method m2 having parameter as character, Boolean and return string type of value then invoke these method under main method by providing dynamic inputs.

import java.util.Scanner;

class A{
        static Scanner sc = new Scanner(System.in);
        String m1(int a){
        String x = sc.next();
        System.out.println(a);
        return x;
        }
        static String m2(char b, boolean c){
        String y = sc.next();
        System.out.println(b);
        System.out.println(c);
        return y;
        }
        public static void main(String[] args){
        A obj = new A();
        int a = sc.nextInt();
        char b = sc.next().charAt(0);
        boolean c = sc.nextBoolean();
        
        System.out.println(obj.m1(a));
        System.out.println(m2(b,c));
        }
}


           