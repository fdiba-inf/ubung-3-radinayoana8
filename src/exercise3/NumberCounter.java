package exercise3;

import java.util.Scanner;

public class NumberCounter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int positiveCount = 0;
        int negativeCount = 0;
        double sum = 0;

        System.out.print("Enter number: ");
         int number = input.nextInt();

        while (number != 0) {
          if  (number > 0) {
            positiveCount++;
          } else {
            negativeCount++;
          } 
          
          sum = sum + number;

          System.out.print("Enter number: ");
          number = input.nextInt();
        }

        double average = sum / (positiveCount + negativeCount);

         System.out.print("Positive numbers: " + positiveCount);
         System.out.print("Negative numbers: " + negativeCount);
         System.out.print("Sum: " + sum);
         System.out.print("Average: "+ average);
    }
}



          
          



