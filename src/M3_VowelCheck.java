import java.util.Arrays;

public class M3_VowelCheck {
    public static void main(String[] args) {
        VowelCheck("apple");
    }

    public static void VowelCheck(String word) {

        for (String ch : word.split("")) {
            if (Arrays.asList(new String[] { "a", "e", "i", "o", "u" }).contains(ch)) {
                System.out.println("There is vowel");
                return;
            }
        }
        System.out.println("There is not vowel");
    }
}