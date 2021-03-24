package do_while_loop_ii;
import java.util.Scanner;
public class Do_While_Loop_II {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    int num1, num2, ans=1, i=1;
    
    System.out.print("Enter your number 1: ");
    num1 = input.nextInt();
    
    System.out.print("Enter your number 2: ");
    num2 = input.nextInt();
    
    do
    {
       i++;
    	ans=ans*num1;
    
    }while (i<=num2);
    System.out.println(num1 +" raised to the power of "+ num2 +" is " + ans);
    
    }
}
    
    
