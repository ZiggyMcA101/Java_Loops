package do_while_loop_i;
import java.util.Scanner;
public class Do_While_Loop_I {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int num1, num2, sum;
    
    System.out.print("Enter the first number: ");
    num1 = input.nextInt();
    
    System.out.print("Enter the second number: ");
    num2 = input.nextInt();
    
    sum = num1+num2;
    
    System.out.println("The sum is "+sum);
    System.out.println();
    
    do
    {
        System.out.print("Enter the first number: ");
    num1 = input.nextInt();
    
    System.out.print("Enter the second number: ");
    num2 = input.nextInt();
    
    sum = num1+num2;
    
    System.out.println("The sum is "+sum);
    System.out.println();
    } while(num1 >0);
    
    do
    {
        System.out.print("Enter the first number: ");
    num1 = input.nextInt();
    
    System.out.print("Enter the second number: ");
    num2 = input.nextInt();
    
    sum = num1+num2;
    
    System.out.println("The sum is "+sum);
    System.out.println();
    } while(num2 >0);
    
    }
        
}
    

