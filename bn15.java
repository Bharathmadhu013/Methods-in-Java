//create a java application where we have one class it contain non-static method m1 have parameter string and return integer type of value and static method m2 having parameter Boolean and return character then invoke these two method under main method.

class A{
        int m1(String a){
        System.out.println(a);
        return 12;
        }
        static char m2(boolean b){
        System.out.println(b);
        return 'N';
        } 
        public static void main(String[] args){
        A obj = new A();
        obj.m1("NIKHITHA");
        m2(true);
        }
}