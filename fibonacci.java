//3)To generate Fibonacci series upto the given input number using recursion.
import java.util.Scanner;

public class fibonacci {
    static int a=0,b=1,c;
    public static void main(String[] args) {


        System.out.println("welcome to fibonacci series");
        System.out.println("enter the limit up to which you want to print series");
        Scanner sc= new Scanner(System.in);
        int limit = sc.nextInt();

        fibonacci ob = new fibonacci();
        ob.fibseries(limit);


    }
    void fibseries(int i )
    {
        if(i>=1)
        {
            c=a+b;
            System.out.print("\t"+c);
            a=b;
            b=c;
            fibseries(i-1);
        }
    }

}
