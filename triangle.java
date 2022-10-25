//2)programm to generate a triangle.
import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        System.out.println("enter the limit upto which the triangle has to be printed");
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        for (int i=1; i<=limit;i++)
        {
            for (int j=1;j<=i; j++) {
                System.out.print(i);

            }
            System.out.println();
        }


    }
}
