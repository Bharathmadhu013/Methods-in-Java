//create a java application where we have one class it contain one non-static method m1 having parameter String and return character value then invoke this method under main method.

class A{
        char m1(String a){
         System.out.println(a);
         return 'N';
        }
        public static void main(String[] args){
        A obj = new A();
        System.out.println(obj.m1("Nikki"));
        }
}