//create a java application where we have one class it contain two non-static variables and two static variable without initialisation then print these variable under main method and initialise these variable and print them

class A{
        String a;
        int b;
        static float c;
        static byte d;
        public static void main(String[] args){
        A obj = new A();
        obj.a = "Nikki";
        obj.b = 1705;
        c = 1713;
        d = 05;
        System.out.println(obj.a + " Born On " + obj.b);
        System.out.println(c + " Password " + d);
        }
}                                    
