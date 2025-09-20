public class Time {

    /*
    Converts the number of minutes to a formatted string indicating
    the number of hours and minutes.
     */
    public static String convert(int minutes) {

        if (minutes < 0) return "Invalid";

        int hours = minutes / 60;
        int mins = minutes % 60;
        if (hours == 0) {
            return mins + " minutes";
        }
        else {
            if (mins == 0) {
                if (hours == 1) {
                    return "1 hour";
                }
                else return hours + " hours";
            }
            else if (mins == 1) {
                if (hours == 1) {
                    return "1 hour and 1 minute";
                }
                else return hours + " hours and 1 minute";

            }
            else {
                if (hours == 1) {
                    return "1 hour and " + mins + " minutes";
                } else return hours + " hours and " + mins + " minutes";
            }
        }
    }
}

