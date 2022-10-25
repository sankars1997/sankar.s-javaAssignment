 // 1) To convert  the input temperature value in Fahrenheit into celsius.
import java.util.Scanner;

public class temparatureConvertor {
    public static void main(String[] args) {
        float temp;
        float celsius;
        System.out.println("welcome to temparature convertor");
        System.out.println("please enter the temparature in fahrenheit you want to convert to celsius:");
        Scanner sc=new Scanner(System.in);
        temp = sc.nextFloat();
        celsius = ((temp -32)*5)/9;
        System.out.println(celsius + " °C");


    }
}
