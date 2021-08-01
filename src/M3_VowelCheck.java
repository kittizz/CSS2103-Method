
//นำคลาส java.util.Arrays มาใช้
import java.util.Arrays;

//สร้าง Class ชื่อว่า M3_VowelCheck
public class M3_VowelCheck {
    //  สร้าง method แบบ static เป็น void ชื่อว่า main เพราะไม่มี return ค่า และ
    // รับค่า parameter string array ชื่อ args
    public static void main(String[] args) {
        // เรียกใช้ method VowelCheck พร้อม parameter apple
        VowelCheck("apple");

        // เรียกใช้ method VowelCheck พร้อม parameter hmmm
        VowelCheck("hmmm");

    }

    // สร้าง method แบบ static แบบ void ชื่อ VowelCheck
    // และ รับค่า parameter String word
    public static void VowelCheck(String word) {
        // ลูปข้อความจากตัวแปร word ทีละตัว และเปลี่ยนค่าเป็นพิมพ์เล็กทุกตัว
        for (String ch : word.toLowerCase().split("")) {
            // แปลง array String a e i o u ไปเป็น List แล้วเช็คว่า ถ้าตัวแปร ch มีอยู่ใน
            // array นี้ให้คือค่าจริง
            if (Arrays.asList(new String[] { "a", "e", "i", "o", "u" }).contains(ch)) {
                // แสดงข้อความ There is vowe
                System.out.println("There is vowel");
                return;
            }
        }
        // แสดงข้อความ There is not vowe
        System.out.println("There is not vowel");
    }
}