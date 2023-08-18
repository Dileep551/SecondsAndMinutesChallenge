public class Main {
    public static String getDurationString(int seconds){
        if(seconds<=0){
            return "Invalid data for seconds "+ seconds +" must be positive number";
        }

        return (getDurationString(seconds / 60, seconds % 60));
        }

    public static String getDurationString(int minutes, int seconds){

        if(minutes < 0 ){

            return "Invalid data for minutes" + minutes + " must be positive number";
        }
        if(seconds <= 0 || seconds >= 59){

            return "Invalid data for seconds " + seconds + " must be poitive number & less than or equal to 59";
        }

        int hour = minutes / 60;
        int minCal = minutes % 60;

        return hour+"h "+minCal+"m "+seconds+"s ";


    }

    public static void main(String[] args) {
        System.out.println(getDurationString(-1));
        System.out.println(getDurationString(-1, 100));
        System.out.println(getDurationString(10, 10));
        System.out.println(getDurationString(124087));
    }


}