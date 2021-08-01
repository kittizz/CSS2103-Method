public class M4_ParkingCalculator {
    public static void main(String[] args) {
        System.out.println(ParkingCalculator(0, 27));
        System.out.println(ParkingCalculator(1, 0));
        System.out.println(ParkingCalculator(1, 32));
        System.out.println(ParkingCalculator(2, 0));
        System.out.println(ParkingCalculator(3, 0));
    }

    public static int ParkingCalculator(int hour, int minute) {
        if (hour <= 1) {
            if (hour == 0) {
                return 0;
            }
            if (minute == 0) {
                return 0;
            }
        }
        if (minute > 0) {
            hour++;
        }

        return hour * 30;
    }
}
