//create a java application where we have one class it contain one static method m1 having parameter string and returns nothing and non-static method m2 having parameter Boolean and return nothing, then invoke both the method under main method.

class A{
        static void m1(String a){
         System.out.println(a);
         return;
        }   
        void m2(boolean b){
         System.out.println(b);
         return;
        }
        public static void main(String[] args){
        A obj = new A();
        m1("Nikhitha");
        obj.m2(true);
        }
}