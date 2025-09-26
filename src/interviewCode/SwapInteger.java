package interviewCode;

public class SwapInteger {

    /*Code to swap two integers without using third variables*/

    static void swap(int a , int b) {
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Value of a :" + a + " and Value of b :" + b );
    }

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        swap(a , b);
    }
}
