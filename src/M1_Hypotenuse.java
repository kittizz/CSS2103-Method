public class M1_Hypotenuse {
    public static void main(String[] args) {
        System.out.println("Triangle 1 :" + hypotenuse(3.0, 4.0));
        System.out.println("Triangle 2 :" + hypotenuse(5.0, 12.0));
        System.out.println("Triangle 3 :" + hypotenuse(8.0, 15.0));
    }

    public static double hypotenuse(double side1, double side2) {
        return Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
    }
}
