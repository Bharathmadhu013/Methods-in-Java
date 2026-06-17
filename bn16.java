// create a java application where we have one class it contain non-static method m1 having no parameter and return interger type of values and another non-static method m2 having parameter as integer and return nothing and them invoke these method under main method. while invoke m2 method pass m1 method return values as parameter.

class A{
        int m1(){
        System.out.println("Default msg....");
        return 15;
        }
        void m2(int a){
        System.out.println(a);
        return;
        }
        public static void main(String[] args){ 
        A obj = new A(); 
        obj.m2(obj.m1());
        }
}