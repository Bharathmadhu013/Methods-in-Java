//create a java application where we have one class it contain one instance variable and static variable and non-static method m1 having parameter as integer, long and return Boolean type of value and another non-static method m2 having parameter float, double and return nothing then invoke these method under main method by providing dynamic inputs.  

import java.util.Scanner;
  
class A{
        static Scanner sc = new Scanner(System.in);
        byte a = sc.nextByte();
        static char b = sc.next().charAt(0);
        
        boolean m1(int x, long y){
        boolean c = sc.nextBoolean();
        System.out.println(x);
        System.out.println(y);
        return c;
        }
        void m2(float x1, double y1){
        System.out.println(x1);
        System.out.println(y1);
        return ;
        }
        public static void main(String[] args){
        A obj = new A();
        int x = sc.nextInt();
        long y = sc.nextLong();
        float x1 = sc.nextFloat();
        double y1 = sc.nextDouble();
         
        System.out.println(obj.a);
        System.out.println(b);
        System.out.println(obj.m1(x, y));
        obj.m2(x1, y1);
        }
}




