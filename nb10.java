//create a java application where we have one class it contain a static method m1 having parameter as string and return its parameter and another static method m2 having parameter string and return Boolean then invoke these method under main method, invoke m2 by passing m1 method return value as parameter by using providing dynamic inputs.

import java.util.Scanner;
 
class A{
        static Scanner sc = new Scanner(System.in);
        static String m1(String a){ 
        System.out.println("Enter string1 value: " + a);
        return sc.next();
        }
        static boolean m2(String b){ 
        System.out.println("Enter string2 value: " + b);
        return sc.nextBoolean();
        }
        public static void main(String[] args){
        System.out.println(m2(m1(sc.next())));
        }
}
        
