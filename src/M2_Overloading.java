//สร้าง Class ชื่อว่า M2_Overloading
public class M2_Overloading {
    //  สร้าง method แบบ static เป็น void ชื่อว่า main เพราะไม่มี return ค่า และ
    // รับค่า parameter string array ชื่อ args
    public static void main(String[] args) {
        // เรียกใช้ method zeroCheck พร้อม parameter 1
        zeroCheck(1);
        // เรียกใช้ method zeroCheck พร้อม parameter -1.1
        zeroCheck(-1.1);
    }

    // สร้าง method แบบ static แบบ void ชื่อว่า zeroCheck
    // และ รับค่า parameter int num

    public static void zeroCheck(int num) {
        // ถ้า num มากกว่า
        if (num > 0) {
            // แสดงข้อความ more than zero
            System.out.println("more than zero");

            // อื่น
        } else {
            // แสดงข้อความ more less or equal zero
            System.out.println("more less or equal zero");
        }
    }
    // สร้าง method แบบ static แบบ void ชื่อว่า zeroCheck
    // และ รับค่า parameter double num

    public static void zeroCheck(double num) {
        // ถ้า num มากกว่า
        if (num > 0) {
            // แสดงข้อความ more than zero
            System.out.println("more than zero");

            // อื่น
        } else {
            // แสดงข้อความ more less or equal zero
            System.out.println("more less or equal zero");
        }
    }
}
