import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] dataPoints = new int[100];
        Random rand = new Random();

        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rand.nextInt(100) + 1;
        }

        for (int i = 0; i < dataPoints.length; i++) {
            System.out.print(dataPoints[i]);
            if (i < dataPoints.length - 1) {
                System.out.print(" | ");
            }
        }
        System.out.println();

        int sum = 0;
        for (int num : dataPoints) {
            sum += num;
        }

        double average = (double) sum / dataPoints.length;

        System.out.println("The sum of the values in dataPoints is: " + sum);
        System.out.println("The average of the values in dataPoints is: " + average);

        int userValue = SafeInput.getRangedInt(scanner, "Enter a number between", 1, 100);
        System.out.println("You entered: " + userValue);

        int count = 0;
        for (int num : dataPoints) {
            if (num == userValue) {
                count++;
            }
        }
        System.out.println("The value " + userValue + " was found " + count + " times in the array.");

        int userValue2 = SafeInput.getRangedInt(scanner, "Enter another number between", 1, 100);
        System.out.println("You entered: " + userValue2);

        int position = -1;
        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == userValue2) {
                position = i;
                break;
            }
        }

        if (position != -1) {
            System.out.println("The value " + userValue2 + " was found at array index " + position + ".");
        } else {
            System.out.println("The value " + userValue2 + " was not found in the array.");
        }

        // Find the minimum and maximum values
        int min = dataPoints[0];
        int max = dataPoints[0];

        for (int i = 1; i < dataPoints.length; i++) {
            if (dataPoints[i] < min) {
                min = dataPoints[i];
            }
            if (dataPoints[i] > max) {
                max = dataPoints[i];
            }
        }

        System.out.println("The minimum value in the array is: " + min);
        System.out.println("The maximum value in the array is: " + max);
    }
}
