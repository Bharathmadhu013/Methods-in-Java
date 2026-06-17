//create a java application where we have one class it contain a non-static method m1 having integer, String as parameter and return character type nothing and another non-static method m2 having parameter float and returns integer type of value then invoke these method under main method.

class A{
        char m1(int a, String b){
        System.out.println(a);
        System.out.println(b);
        return 'N';
        }
        int m2(float c){
        System.out.println(c);
        return 12;
        }
        public static void main(String[] args){
        A obj = new A();
        obj.m1(10,"Bharath");
        obj.m2(1310.0f);
        }
}
        