// create a java application where we have one class it contain a non-static method m1 having float, Boolean as parameter and returns nothing and static method m2 having string as parameter and return nothing then invoke these method under main method.

class A{
        void m1(float a, boolean b){
        System.out.println(a);
        System.out.println(b);
        return;
        }
        static void m2(String c){
        System.out.println(c);
        return;
        }
        public static void main(String[] args){
        A obj = new A();
        obj.m1(11.2f,false);
        m2("Bharath");
        }
}