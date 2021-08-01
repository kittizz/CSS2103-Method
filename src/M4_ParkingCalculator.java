//สร้าง Class ชื่อว่า M4_ParkingCalculator
public class M4_ParkingCalculator {
    //  สร้าง method แบบ static เป็น void ชื่อว่า main เพราะไม่มี return ค่า และ
    // รับค่า parameter string array ชื่อ args
    public static void main(String[] args) {
        // แสดงข้อความ จากการเรียกใช้ method ParkingCalculator ด้วย parameter 0 กับ 27
        System.out.println(ParkingCalculator(0, 27));
        // แสดงข้อความ จากการเรียกใช้ method ParkingCalculator ด้วย parameter 1 กับ 0
        System.out.println(ParkingCalculator(1, 0));
        // แสดงข้อความ จากการเรียกใช้ method ParkingCalculator ด้วย parameter 1 กับ 32
        System.out.println(ParkingCalculator(1, 32));
        // แสดงข้อความ จากการเรียกใช้ method ParkingCalculator ด้วย parameter 2 กับ 0
        System.out.println(ParkingCalculator(2, 0));
        // แสดงข้อความ จากการเรียกใช้ method ParkingCalculator ด้วย parameter 3 กับ 0
        System.out.println(ParkingCalculator(3, 0));
    }

    // สร้าง method แบบ static คืนค่า int ชื่อ ParkingCalculator
    // และ รับค่า parameter int hour และ int minute
    public static int ParkingCalculator(int hour, int minute) {
        // ถ้า hour น้อยกว่าหรือเท่ากับ 1
        if (hour <= 1) {
            // ถ้า hour เท่ากับ 0
            if (hour == 0) {
                // คืนค่า 0
                return 0;
            }
            // ถ้า minute เท่ากับ 0
            if (minute == 0) {
                // คืนค่า 0
                return 0;
            }
        }

        // ถ้า minute มากกว่า 0
        if (minute > 0) {
            // เพิ่มชั่วโมงไปอีก 1
            hour++;
        }

        // นำชั่วโมงคูณ 30 เท่ากับค่าจอดรถ
        return hour * 30;
    }
}
