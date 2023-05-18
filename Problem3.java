import java.util.Scanner;

public class Problem3 {
    public static void main(String arg[]) {
        int countPalindrome=0;
        int countNonPalindrome=0;
        for (int j=0; j<=4; j++){
            Scanner myObj = new Scanner(System.in);
            System.out.print("Enter the String: ");
            String str = myObj.nextLine();
            String reverseString = "";
            char ch;
            for (int i = 0; i < str.length(); i++) {
                ch = str.charAt(i);
                reverseString = ch + reverseString;
            }
            if (reverseString.equals(str)) {
                System.out.println("String is Palindrome.\n");
                countPalindrome++;
                
            } else {
                System.out.println("String is not Palindrome.\n");
                countNonPalindrome++;
                
            }
        }
        System.out.printf("String was Plaindrome %d times.\n", countPalindrome);
        System.out.printf("String was not Plaindrome %d times.\n", countNonPalindrome );
    }
}