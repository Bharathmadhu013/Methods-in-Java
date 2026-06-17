//create a java application where we have one class it contain a static variable and a non-static variable and two local variables then print all these variable under main method.

class A{
        static String a = "Nikki";
        boolean b = true;
        public static void main(String[] args){
        int c = 12;
        byte d = 120;
        A obj = new A();
        System.out.println(a);
        System.out.println(obj.b);
        System.out.println(c);
        System.out.println(d);
        }
}