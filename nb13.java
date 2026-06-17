//create a java application where we have one class it contain two instance variable and two non-static methods having parameter and return type and static method having parameter and return type then invoke non-static method under static method each and print instance variable under both static method invoke static method under main method by providing dynamic input.

import java.util.Scanner;

class A{
        static Scanner sc = new Scanner(System.in);
        
        byte a = sc.nextByte();
        int b = sc.nextInt();

        String first(float x){
        System.out.println("Enter Float Value: " + x);
        return sc.next();
        }
        char second(short y){
        System.out.println("Enter Short Value: " + y);
        return sc.next().charAt(0);
        }
        static boolean third(long z){
        System.out.println("Enter Long Value: " + z);
        System.out.println(new A().first(sc.nextFloat()));
        System.out.println("Enter instance1 Value: " + new A().a);
        return sc.nextBoolean();
        }
        static int fourth(byte x1){
        System.out.println("Enter Byte Value: " + x1);
        System.out.println(new A().second(sc.nextShort()));
        System.out.println("Enter instance2 Value: " + new A().b);
        return sc.nextInt();
        }
        public static void main(String[] args){
        System.out.println(third(sc.nextLong()));
        System.out.println(fourth(sc.nextByte()));
        }                      
}


/**
12345          ← long   → third(z)
10             ← byte   → new A().a  (1st object in third)
200            ← int    → new A().b  (1st object in third)
5.14           ← float  → first(x)
Hello          ← String → return of first()
20             ← byte   → new A().a  (2nd object in third)
300            ← int    → new A().b  (2nd object in third)
true           ← boolean→ return of third()
5              ← byte   → fourth(x1)
30             ← byte   → new A().a  (1st object in fourth)
400            ← int    → new A().b  (1st object in fourth)
7              ← short  → second(y)
Z              ← char   → return of second()
40             ← byte   → new A().a  (2nd object in fourth)
500            ← int    → new A().b  (2nd objepaperct in fourth)
999            ← int    → return of fourth()
**/