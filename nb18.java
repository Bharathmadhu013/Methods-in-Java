//create a java application where we have one class we need to satisfies all 8 types of method. Then invoke any one method under main method and rest under another method by using dynamic inputs.

import java.util.Scanner;

class A{
        static Scanner sc = new Scanner(System.in);
        static void m1(){
        return;
        }
        static void m2(int a){
        System.out.println(a);
        return;
        }
        static String m3(){
        return sc.next();
        }
        static int m4(String b){
        System.out.println(b);
        return sc.nextInt();
        }
        void m5(){
        return;
        }
        void m6(char c){
        System.out.println(c);
        return;
        }
        float m7(){
        return sc.nextFloat();
        }
        float m8(char d){
        System.out.print(d);
        return sc.nextFloat();
        }
        void methods(){
            m1();
            m2(sc.nextInt());
            System.out.println(m3());
            System.out.println(m4(sc.next()));
            m5();
            m6(sc.next().charAt(0));
            System.out.println(m7());
        }
                  
        public static void main(String[] args){
        A obj = new A();
        System.out.println(obj.m8(sc.next().charAt(0)));
        obj.methods();
        }
}
        