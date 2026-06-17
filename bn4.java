//create a java application where we have one class it contain two static variable and two instance(non-static) variable and print these variable under main method.

class A{
        static int a = 10;
        static float b = 123.5f;
        String c = "Nikki";
        long d = 1705l;
        public static void main(String[] args){
        A obj = new A();
        System.out.println(a);
        System.out.println(b);
        System.out.println(obj.c);
        System.out.println(obj.d);
        }
}