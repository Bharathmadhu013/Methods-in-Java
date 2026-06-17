//create a java application where we have one class it contain one static method m1 having parameter Boolean and return Boolean value then invoke this method under main method.

class A{
        static boolean m1(boolean a){
         System.out.println(a);
         return true;
        }
        public static void main(String[] args){  
        System.out.println(m1(false));
        }
}