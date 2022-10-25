//4)To check wether the given string is palindrome or not
import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        System.out.println("hai welcome");
        System.out.println("enter the string you want to check palindrome or not");
        Scanner sc=new Scanner(System.in);
        String s= sc.next();
        String rev="";
        for (int i=s.length()-1;i>=0;i--)
        {
            rev= rev + s.charAt(i);

        }

        if(s.equals(rev))
        {
            System.out.println("the given string is palindrome");
        }
        else {
            System.out.println("The given string is not palindrome");
        }

    }
}
