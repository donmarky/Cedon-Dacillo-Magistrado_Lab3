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

}