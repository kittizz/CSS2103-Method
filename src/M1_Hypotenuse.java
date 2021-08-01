//สร้าง Class ชื่อว่า M1_Hypotenuse
public class M1_Hypotenuse {
    //  สร้าง method แบบ static เป็น void ชื่อว่า main เพราะไม่มี return ค่า และ
    // รับค่า parameter string array ชื่อ args
    public static void main(String[] args) {
        // แสดงข้อความ Triangle 1 : รวมกับค่าที่มาจาก method hypotenuse
        // พร้อม parameter 3. กับ, 4.0
        System.out.println("Triangle 1 :" + hypotenuse(3.0, 4.0));

        // แสดงข้อความ Triangle 2 : รวมกับค่าที่มาจาก method hypotenuse
        // พร้อม parameter 5.0 กับ 12.0
        System.out.println("Triangle 2 :" + hypotenuse(5.0, 12.0));

        // แสดงข้อความ Triangle 3 : รวมกับค่าที่มาจาก method hypotenuse
        // พร้อม parameter 8.0 กับ 15.0
        System.out.println("Triangle 3 :" + hypotenuse(8.0, 15.0));
    }

    // สร้าง method แบบ static คืนค่า double ชื่อว่า hypotenuse และ
    // รับค่า parameter double side1 และ double side2
    public static double hypotenuse(double side1, double side2) {
        // จากสูตร a^2 + b^2 = c ^2 ต้องการค่า c
        // นำ side1 ยกกำลังสอง บวกกับ side2 ยกกำลังสอง แล้วนำไปถอดรูทจะได้ค่า c
        return Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
    }
}
