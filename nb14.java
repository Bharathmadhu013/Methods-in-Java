//create a java application where we have one class A here user need to enter data of 5 boys and 5 girls and non static method display having no parameters and return nothing this method display the values then if user wants to see data of boys then display boys data for else the user want to see the girls data or else the user wants to see the both the data then display the data of both by providing dynamic inputs.
       
import java.util.Scanner;
  
class A{
        static Scanner sc = new Scanner(System.in);
        String Name1 = sc.next();
        String Name2 = sc.next();
        String Name3 = sc.next();
        String Name4 = sc.next();
        String Name5 = sc.next();
        
        void m1(){
            System.out.println(Name1);
            System.out.println(Name2);
            System.out.println(Name3);
            System.out.println(Name4);
            System.out.println(Name5);
        }
        public static void main(String[] args){
        System.out.println("Enter Boys Names: ");
        A Boys = new A();
        System.out.println("Enter Girls Names: ");
        A Girls = new A();
        System.out.println("Which data you need \nBoys\nGirls\nBoth");

        String a = sc.next();
        switch(a){
            case "Boys": Boys.m1();
                         break;
            case "Girls": Girls.m1();
                          break;
            case "Both": Boys.m1();
                         Girls.m1();              
                         break;
            default: System.out.println("Invalid input");
        }
    }
}

        
        





         