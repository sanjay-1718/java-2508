public class TypeCC {
    public static void main(String[] args) {
        // Type Conversion small to big (Widening)
        int num = 10;
        double number = num;
        System.out.println("After Type conversion");
        System.out.println("Original Value " +num);
        System.out.println("Converted Value " +number);
        System.out.println('\n');

        // Type Casting
        double value = 3.14;
        int newValue = (int) value;
        System.out.println("After Type casting");
        System.out.println("Original Value " +value);
        System.out.println("Converted Value " +newValue);
        System.out.println('\n');

        // Conversion Not possible
        int data = 100;
        //String newData = (String) data; // Error
        String newData = String.valueOf(data);
        System.out.println("Int to String conversion");
        System.out.println("Original Value " +data);
        System.out.println("Converted Value " +newData);

        System.out.println(data+100); // arithmetic operation
        System.out.println(newData+100); // string concatination

        // Conversion not possible at all
        //int testNum = 10;
        //boolean testValue = (boolean) testNum;
        //boolean testValue = boolean.valueOf(testNum);
        
    }
}
