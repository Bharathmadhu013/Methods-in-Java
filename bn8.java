//create a java application where we have one class it contain non-static method m1 having no parameter and return type as void and another non-static method having integer as parameter and return nothing then invoke these method under main method.

class A{
        void m1(){
          System.out.println("First default msg.....");
          return;
        }
        void m2(int a){
         System.out.println(a);
         return;
        } 
        public static void main(String[] args){
        A obj = new A();
        obj.m1();
        obj.m2(10);
        }
}