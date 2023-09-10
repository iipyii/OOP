import java.util.Scanner;

public class InputXYWH {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter x y w h: ");
        String input = scanner.nextLine();

        // Split the input string by spaces and store the values in an array
        String[] inputValues = input.split(" ");

        // Make sure the user entered exactly four values
        if (inputValues.length != 4) {
            System.out.println("Please enter four values separated by spaces.");
            return;
        }

        // Parse the input values to the appropriate data types
        try {
            int x = Integer.parseInt(inputValues[0]);
            int y = Integer.parseInt(inputValues[1]);
            int w = Integer.parseInt(inputValues[2]);
            int h = Integer.parseInt(inputValues[3]);

            // Now you have separate variables for x, y, w, and h
            System.out.println("x: " + x);
            System.out.println("y: " + y);
            System.out.println("w: " + w);
            System.out.println("h: " + h);

            // Perform any other operations with the variables as needed
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid input format for one or more variables.");
        }
    }
}
