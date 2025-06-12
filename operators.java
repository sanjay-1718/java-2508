public class operators {
    public static void main(String[] args) {
        int num1 = 38;
        int num2 = 21;

        //Addition
        System.out.println("Sum is : " +(num1+num2));

        //Substraction
        System.out.println("Difference is : " +(num1-num2));

        //Multiplication
        System.out.println("Product is : " +(num1*num2));

        //Division
        System.out.println("Division is : " +(num1/num2));

        //Modulus
        System.out.println("Modulus is : " +(num1%num2));
        System.out.println('\n');

        //Increment and Decrement
        int a = 10;
        System.out.println("A value is: "+ a);
        System.out.println("++A value is: "+ (++a));
        System.out.println("A++ value is: "+ (a++));
        System.out.println("Updated A value is: "+ a);

        System.out.println("A value is: "+ a);
        System.out.println("--A value is: "+ (--a));
        System.out.println("A-- value is: "+ (a--));
        System.out.println("Updated A value is: "+ a);
        System.out.println('\n');

         // Assignment Operators
        int num = 10;
        num += 10;
        num -= 2;
        num *= 5;
        num /= 2;
        System.out.println(num);
        System.out.println('\n');

        // Comparision (boolean -> true/false)
        int x = 7;
        int y = 5;
        int b = 14;
        int c = 9;
        boolean isGreater = x > y;
        System.out.println("Is Greater: "+isGreater);

        boolean isequal = x == y;
        System.out.println("Is Equal: "+isequal);
        System.out.println('\n');

        // Logical Ops (boolean -> true/false)
        boolean resultAND = x > y && b<c; // T && F -> F
        System.out.println("Logical AND: "+resultAND);

        boolean resultNOT = x > y; // T -> F
        System.out.println("Logical NOT: "+ !resultNOT);
        System.out.println('\n');

         // Bitwise ops 
        int a1 = 5; // 0101
        int b1 = 3; // 0011
                    
        int r1 = a1 & b1 ;  // 0001
        System.out.println("Bitwise AND "+r1);

        int r2 = a1 | b1 ; // 0111
        System.out.println("Bitwise OR "+r2);

        int r3 = a1 ^ b1 ; // 0110
        System.out.println("Bitwise XOR "+r3);

        int r4 = ~ a1 ; // 1010
        System.out.println("Bitwise NOT "+r4);
        System.out.println('\n');

            // 3 -> 0000000000000011
        // 3<<2 --> 0000000000001100 == 0000000000001100
        // 3<<1 --> 0000000000000110 == 0000000000000110
        // 3<<3 --> 0000000000011000 == 0000000000011000
        // Left Shift -> Add those many zeros filling left side
        System.out.println(3<<2);
        System.out.println(3<<1);
        System.out.println(3<<3);
        System.out.println('\n');

        // 3>>2 --> 0000000000000000 == 0000000000000000
        // 3>>1 --> 0000000000000001 == 0000000000000001
        // 3>>3 --> 0000000000000000  == 0000000000000000 
        System.out.println(3>>2);
        System.out.println(3>>1);
        System.out.println(3>>3);
    }   
}
