package function;
/*
 * If the hour hand is on 5 and the minute hand is on 12,
 *  what is the angle between them?
 */

 public class ClockAngle {
    public static double getAngle(int hour, int minutes) {
        double hourAngle = 0.5 * (60 * hour + minutes);
        double minuteAngle = 6 * minutes;
        double angle = Math.abs(hourAngle - minuteAngle);
        return Math.min(360 - angle, angle); // smaller angle
    }

    public static void main(String[] args) {
        int hour = 5, minutes = 0;
        double angle = getAngle(hour, minutes);
        System.out.println("Angle between hour and minute hand: " + angle + " degrees");
    }
}