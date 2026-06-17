//create a java application where we have one class it contain one instance variable and one static variable and non-static method m1 having no parameter and return nothing this method contains a local variable and then print all these variable under m1 method and invoke m1 under main method.

class A{
        String a = "Bharath";
        static int b = 1310;
        
        void m1(){
         System.out.println(a + " Born on " + b);
         System.out.println("Default Msg....");
         return;
        }

        public static void main(String[] args){
        A obj = new A();
        obj.m1();
        }
}  