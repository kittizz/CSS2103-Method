public class M5_ATOB {
    public static void main(String[] args) {
        System.out.println(ATOB(1, 20));
        System.out.println(ATOB(1.0, 20.0));
    }

    public static int ATOB(int a, int b) {
        int answer = 0;
        for (int i = a; i <= b; i++) {
            if (i % 2 != 0) {
                answer += i;
            }
        }
        return answer;
    }

    public static double ATOB(double a, double b) {
        double answer = 0;
        for (double i = a; i <= b; i++) {
            if (i % 2 != 0) {
                answer += i;
            }
        }
        return answer;
    }
}
