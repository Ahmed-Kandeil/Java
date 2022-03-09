package hello.world;
import java.util.Scanner;
/**
 * @author Ahmed Kandil
 * @since 5-3-2022
 * @version 1.0
 */
public class MaxNumber {
    public static void main(String[] args)
    {
      int numberOne, numberTwo, numberThree;
      Scanner input = new Scanner(System.in);
      System.out.println("Enter The First Number :");
      numberOne = input.nextInt();
      System.out.println("Enter The Second Number :");
      numberTwo = input.nextInt();
      System.out.println("Enter The Thrid Number :");
      numberThree = input.nextInt();
      if (numberOne > numberTwo)
      {
          if (numberOne > numberThree)
          {
              System.out.println("The First Number Is The Biggest One !!!");
          }
      }
      else if (numberTwo > numberThree) 
      {
          System.out.println("The Second Number Is The Biggest One !!!");
      }
      else
      {
          System.out.println("The Thrid Number Is The Biggest One !!!");
      }
    }
}