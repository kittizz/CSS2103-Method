//สร้าง Class ชื่อว่า M5_ATOB
public class M5_ATOB {
    //  สร้าง method แบบ static เป็น void ชื่อว่า main เพราะไม่มี return ค่า และ
    // รับค่า parameter string array ชื่อ args
    public static void main(String[] args) {
        // แสดงข้อความ จากการเรียกใช้ ATOB ด้วย parameter 1 กับ 20
        System.out.println(ATOB(1, 20));
        // แสดงข้อความ จากการเรียกใช้ ATOB ด้วย parameter 1.0 กับ 20.0
        System.out.println(ATOB(1.0, 20.0));
    }

    // สร้าง method แบบ static คืนค่า int ชื่อ ATOB
    // และ รับค่า parameter int a และ int b
    public static int ATOB(int a, int b) {
        // ประกาศตัวแปรชนิด int ชื่อ asnwer เท่ากับ 0
        int answer = 0;
        // ลูปเรียกจาก a ถึง b
        for (int i = a; i <= b; i++) {
            // นับลำดับที่ลูป มา หารเอาเศษ ถ้าเศาไม่เท่ากับ 0 คือคี่
            if (i % 2 != 0) {
                // รวมค่า i เข้าตัวแปร answer
                answer += i;
            }
        }
        // คืนค่า answer
        return answer;
    }

    // สร้าง method แบบ static คืนค่า double ชื่อ ATOB
    // และ รับค่า parameter double a และ double b
    public static double ATOB(double a, double b) {
        // ประกาศตัวแปรชนิด double ชื่อ asnwer เท่ากับ 0
        double answer = 0;
        for (double i = a; i <= b; i++) {
            // นับลำดับที่ลูป มา หารเอาเศษ ถ้าเศาไม่เท่ากับ 0 คือคี่
            if (i % 2 != 0) {
                // รวมค่า i เข้าตัวแปร answer
                answer += i;
            }
        }
        // คืนค่า answer
        return answer;
    }
}
