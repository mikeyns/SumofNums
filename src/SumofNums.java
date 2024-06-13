import java.util.Scanner;

public class SumofNums {

    public static void main(String args[]) {
        Scanner console = new Scanner(System.in);
        int sum = 0;
        int count = 0;  // contador de números inseridos

        while (count < 10) {
            System.out.print("Enter a number: ");
            int number = console.nextInt();
            sum = sum + number;
            count++;
        }

        System.out.println("The sum of the 10 numbers is " + sum);
        console.close();
    }
}