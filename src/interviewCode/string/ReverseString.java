package interviewCode.string;

public class ReverseString {

    static String reverseString(String str){

        char[] strChar = str.toCharArray();

        StringBuilder revStr = new StringBuilder();

        for (int i = strChar.length-1; i >= 0; i--){

            revStr.append(strChar[i]);

        }

        return revStr.toString().trim();
    }

    static StringBuilder  revStringUsingPredefineMethod(String str){

        StringBuilder stringBuilder = new StringBuilder(str);

        return stringBuilder.reverse();

    }


    public static void main(String[] args) {

        System.out.println(reverseString("AMIT"));
        System.out.println(revStringUsingPredefineMethod("JATIN"));
    }
}
