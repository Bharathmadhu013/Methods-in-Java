//create a java application where we have one class it contain static method m1 having parameter int, another non-static method m2 having string as parameter and another static method m3 having float as parameter and all these are return nothing then invoke all three method under main method.

class A{
        static void m1(int a){
        System.out.println(a);
        }
        void m2(String b){
        System.out.println(b);
        }
        static void m3(float c){
        System.out.println(c);
        }
        public static void main(String[] args){
        A obj = new A();
        m1(143);
        obj.m2("Nikki");
        m3(1705.0f);
        }
}