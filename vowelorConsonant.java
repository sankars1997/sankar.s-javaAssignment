//6)find wether the given character is vowel or consonant using switch control
import java.util.Scanner;

public class vowelorConsonant {
    public static void main(String[] args) {
        char letter;
        System.out.println("hai welcome ");
        System.out.println("enter the letter you want to check consonanat or vowel");
        Scanner sc =new Scanner(System.in);
        letter= sc.next().charAt(0);

        switch (letter) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("hey its a vowel");
                break;
            default:   System.out.println("hey its a consonant");
    }
}
}
