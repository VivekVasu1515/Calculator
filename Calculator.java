import java.util.Scanner;

public class Calculator {
    public static void addition(int num1, int num2){
        int sum = num1+num2;
        System.out.println(sum);
    }
    public static void subtraction(int num1, int num2){
        int sub = num1-num2;
        System.out.println(sub);
    }

    public static void multiplication(int num1, int num2){
        int product = num1*num2;
        System.out.println(product);
    }

    public static void division(int num1, int num2){
        float div = (float)num1/num2;
        System.out.println(div);
    }
    
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st Number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter the 2st Number : ");
        int num2 = sc.nextInt();
        division(num1, num2);
        
        sc.close();
    }
}