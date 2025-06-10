public class VariablesPractice {
    
    // static variables can be used without initialization
    static int numb;
    // instance variables --> which are used inside a class(We can use without initialization in not-static methods)
    int num;
    // non static method
    public void displayNumber(){
        System.out.println(num);
    }
    public static void main(String[] args) {

        int number; // local variables --> which are defined inside a method (Must be initialized)
        System.out.println(numb);
        //System.out.println(num);
        //System.out.println(number);
    }
}
