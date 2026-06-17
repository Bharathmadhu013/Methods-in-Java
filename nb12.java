//create a java application where we have one class it contain two instance method then invoke these method under main method without creating an object by giving dynamic inputs

import java.util.Scanner;
  
class A{
        static Scanner sc = new Scanner(System.in);
        int first(char x){
        System.out.println("First instance method: " + x);
        return sc.nextInt();
        }
        float second(String y){
        System.out.println("Second instance method: " + y);
        return sc.nextFloat();
        }
        public static void main(String[] args){
        System.out.println(new A().first(sc.next().charAt(0)));
        System.out.println(new A().second(sc.next()));
        }
}

