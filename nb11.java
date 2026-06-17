//create a java application where we have one class it contain a non-static had having two integers parameter and return the addition of the parameter and another non-static method having two integer parameter and return the subtraction of the parameter and static method multiply having no parameter and return the multiplication of add, sub method return values then print that multiplication under main method by providing dynamic inputs.

import java.util.Scanner;

class A{
        static Scanner sc = new Scanner(System.in);
        static A obj = new A();

        int add(int a, int b){
        System.out.println("Enter Add a and b Value: " + (a+b));
        return a+b ;
        }
        int sub(int x, int y){
        System.out.println("Enter Sub a and b Value: " + (x-y));
        return x-y ;    
        }
        static int mult(){
        System.out.println("Default msg...");
        return (obj.add(sc.nextInt(),sc.nextInt())*obj.sub(sc.nextInt(),sc.nextInt())) ;
        }
        public static void main(String[] args){
        System.out.println("Total multiplication value : " + mult());
        }
}
  
 