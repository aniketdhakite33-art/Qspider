import java.util.Scanner;

class AverageSpeed {
    public static void main(String[] args) {

        double distanceKm = 14;
        double timeMinutes = 45;
        double timeSeconds = 30;

       
        double distanceMiles = distanceKm * 0.621371;

        
        double timeHours = (timeMinutes + (timeSeconds / 60)) / 60;

        
        double speedMph = distanceMiles / timeHours;

        System.out.println("Average speed : " + speedMph + " miles per hour");
    }
}