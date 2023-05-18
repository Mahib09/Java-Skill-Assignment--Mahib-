import java.util.EmptyStackException;
import java.util.Scanner;

public class Problem2 {
    public static void main(String arg[]) {
        String firstString="";
        String secondString="";
    
            
        Scanner myObj = new Scanner(System.in);
            System.out.print("Enter First String:");
            firstString = myObj.nextLine();
            if(firstString==null || firstString.isEmpty()){
                throw new RuntimeException("String should not be null");
            }

            System.out.print("Enter Second String:");
            secondString = myObj.nextLine();
            if(secondString==null || secondString.isEmpty()){
                throw new RuntimeException("String should not be null");
            }
        
        System.out.println("Length of the First string is " + firstString.length());
        System.out.println("First and Second String Concatenated: " + firstString.concat(secondString));
        String reverseString1 = "";
        char ch1;
        for (int i = 0; i < firstString.length(); i++) {
            ch1 = firstString.charAt(i);
            reverseString1 = ch1 + reverseString1;
        }
        System.out.println("First String Reversed: " + reverseString1);
        String reverseString2 = "";
        char ch2;
        for (int i = 0; i < secondString.length(); i++) {
            ch2 = secondString.charAt(i);
            reverseString2 = ch2 + reverseString2;
        }
        System.out.println("Second String Reversed: " + reverseString2);
    }
    }


