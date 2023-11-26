import java.util.Scanner;

public class B7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Nhập năm: ");
        int year = scanner.nextInt();

        System.out.print("Nhập tháng: ");
        int month = scanner.nextInt();
        int soNgay = -1;
        if (month >= 1 && month <= 12) {
            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                soNgay = 31;
            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                soNgay = 30;
            } else {
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    soNgay = 29;
                } else {
                    soNgay = 28;
                }
            }

            System.out.println("Tháng " + month + " năm " + year + " có " + soNgay + " ngày.");
        } else {
            System.out.println("Tháng không hợp lệ. Vui lòng nhập tháng từ 1 đến 12.");
        }
    }
}
