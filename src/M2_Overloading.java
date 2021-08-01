public class M2_Overloading {
    public static void main(String[] args) {
        zeroCheck(1);
        zeroCheck(-1);
    }

    public static void zeroCheck(int num) {
        if (num > 0) {
            System.out.println("more than zero");
        } else {
            System.out.println("more less or equal zero");
        }
    }

    public static void zeroCheck(double num) {
        if (num > 0) {
            System.out.println("more than zero");
        } else {
            System.out.println("more less or equal zero");
        }
    }
}
