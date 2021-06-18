/** This program takes three numbers as the user input and prints their order.
 * @author (Fikri Şan Köktaş)
 * @version (28 November 2020)*/
import java.util.Scanner;
public class KFS_IncreasingNumbers_Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int num1, num2, num3;
        System.out.print("Enter three numbers from 1 to 10: ");
        num1=input.nextInt(); //takes user input
        num2=input.nextInt(); //takes user input
        num3=input.nextInt(); //takes user input
        if (num1<num2 && num2<num3) //condition for increase
        {
            System.out.println("Three numbers are in an increasing order"); 
        }
        else if (num1>num2 && num2>num3)//condition for decrease
        { 
            System.out.println("Three numbers are in a decreasing order");
        } 
        else 
        {
            System.out.println("The numbers are not in an order");
        }
    }
}
