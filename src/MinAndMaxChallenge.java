import java.util.Scanner;

public class MinAndMaxChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

        while(true) {
            System.out.println("Enter number: ");
            boolean isNextNumber = scanner.hasNextInt();
            if (isNextNumber) {
                int number = scanner.nextInt();

                if (number > max)
                    max = number;
                if (number < min)
                    min = number;
            } else
                break;

            scanner.nextLine();
        }
        System.out.println("Min is " + min + ". Max is " + max);
        scanner.close();
    }
}
