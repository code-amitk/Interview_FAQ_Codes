package interviewCode.string;

public class TwoPointerPalindrome {

    /* Two pointer to find */
    // While Loop
    static boolean isPalindromeTwoPointer(String str) {

        int left = 0;
        int right = str.length() - 1;

        while(left < right) {

            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left ++;
            right --;
        }
        return true;
    }

    //Generic For Loop
    static boolean isPalindromeForLoop(String str) {
        int left = 0;
        int right = str.length() - 1;
        for (int i =0 ; i<= right/2; i++) {

            if (str.charAt(left) != str.charAt(right)){

                return false;
            }

            left ++;
            right --;
        }

         return true;
    }
    

    public static void main(String[] args) {
        //if (isPalindromeTwoPointer("NAMAN"))

         if (isPalindromeForLoop("NAMAN"))
            System.out.println("PALINDROME");
         else
             System.out.println("NOT PALINDROME");
    }
}
