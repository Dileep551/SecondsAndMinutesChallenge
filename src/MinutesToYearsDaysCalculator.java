public class MinutesToYearsDaysCalculator {

    public static void printYearsAndDays(long minutes) {

        if (minutes < 0) {
            System.out.println("Invalid value");
        } else {
            if ((minutes > 1440) && (minutes < 525600)) {
                long XX = minutes % 1440;
                long ZZ = minutes / 1440;

                System.out.println(XX + " min = 00 y and " + ZZ + " d");
            } else if (minutes >= 525600) {
                long YY = minutes / 525600;
                long ZZ = (minutes % 525600) / 1440;

                System.out.println(minutes + " min = " + YY + " y and " + ZZ + " d");
            }
            if (minutes <= 1440) {
                System.out.println(minutes + " min = 00 y and 00 d");
            }
        }

    }
    public static void main (String[]args){
        printYearsAndDays(123457);
    }
}