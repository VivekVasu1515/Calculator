import java.util.Scanner;

public class Calculator {
    public static double addition(double num1, double num2){
        
        return num1+num2;
    }
    public static double subtraction(double num1, double num2){
        
        return num1-num2;
    }

    public static double multiplication(double num1, double num2){
        
        return num1*num2;
    }

    public static double division(double num1, double num2){
        
        return (double)num1/num2;
    }
    
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st Number : ");
        double num1 = sc.nextDouble();
        System.out.println("Enter the 2st Number : ");
        double num2 = sc.nextDouble();
        System.out.println(division(num1, num2));
        
        sc.close();
    }
}