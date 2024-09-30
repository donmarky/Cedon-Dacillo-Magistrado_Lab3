import java.util.Scanner;

public class Clock {

    // Method to convert seconds to minutes
    public double SecondstoMinutes(int seconds) {
        return seconds / 60.0; // 1 minute = 60 seconds
    }

    // Method to convert seconds to hours
    public double SecondstoHours(int seconds) {
        return seconds / 3600.0; // 1 hour = 3600 seconds
    }

    // Method to convert minutes to seconds
    public int MinutestoSeconds(int minutes) {
        return minutes * 60; // 1 minute = 60 seconds
    }

    // Method to convert minutes to hours
    public double MinutestoHours(int minutes) {
        return minutes / 60.0; // 1 hour = 60 minutes
    }

    // Method to convert hours to seconds
    public int HourstoSeconds(int hours) {
        return hours * 3600; // 1 hour = 3600 seconds
    }

    // Method to convert hours to minutes
    public int HourstoMinutes(int hours) {
        return hours * 60; // 1 hour = 60 minutes
    }

    public static void main(String[] args) {
        Clock clock = new Clock(); // Create an instance of Clock
        Scanner scanner = new Scanner(System.in); // Scanner for user input
        char continueConversion;

        do {
            // Display conversion options
            System.out.println("[1] Seconds to Minutes");
            System.out.println("[2] Seconds to Hours");
            System.out.println("[3] Minutes to Seconds");
            System.out.println("[4] Minutes to Hours");
            System.out.println("[5] Hours to Seconds");
            System.out.println("[6] Hours to Minutes");
            System.out.println(); // Blank line after options
            System.out.print("Choose the Conversion: ");
            int choice = scanner.nextInt(); // Get user choice

            // Prompt user for value to convert
            System.out.print("Enter the Value: ");
            int value = scanner.nextInt();

            // Perform conversion based on user choice
            switch (choice) {
                case 1:
                    System.out.println("Seconds to Minutes: " + clock.SecondstoMinutes(value));
                    break;
                case 2:
                    System.out.println("Seconds to Hours: " + clock.SecondstoHours(value));
                    break;
                case 3:
                    System.out.println("Minutes to Seconds: " + clock.MinutestoSeconds(value));
                    break;
                case 4:
                    System.out.println("Minutes to Hours: " + clock.MinutestoHours(value));
                    break;
                case 5:
                    System.out.println("Hours to Seconds: " + clock.HourstoSeconds(value));
                    break;
                case 6:
                    System.out.println("Hours to Minutes: " + clock.HourstoMinutes(value));
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            // Ask user if they want to continue
            System.out.print("Do you want to convert time (Y/N): ");
            continueConversion = scanner.next().charAt(0);
            System.out.println("*****************************************");
            System.out.println(); // Blank line after asterisk

        } while (Character.toUpperCase(continueConversion) == 'Y'); // Repeat if 'Y'

        scanner.close(); // Close the scanner to avoid resource leak
    }

}