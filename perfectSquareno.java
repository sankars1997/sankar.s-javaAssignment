//5)To display all the perfect squares between two input numbers interval.
import java.util.Scanner;

public class perfectSquareno {
    public static void main(String[] args) {
        System.out.println("enter the first no");
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("enter the second number" );
        int b =sc.nextInt();
        System.out.print("the perfect squares between " + a + " and "+ b + " are:");
        for (int i=a;i<b ;i++)
        {
            if(Math.sqrt(i)==(int)(Math.sqrt(i)))
            {
                System.out.print("\t"+i);
            }
        }

    }
}
