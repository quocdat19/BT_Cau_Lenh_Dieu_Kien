import java.util.Scanner;

public class B10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lương cơ bản: ");
        int lcb = scanner.nextInt();
        System.out.print("Số ngày công: ");
        int soNgayCongThucTe = scanner.nextInt();
        int luong;
        int ngayDu;

        if( soNgayCongThucTe <= 26)
        {
            luong = lcb * (soNgayCongThucTe / 26);
            System.out.printf("Lương của nhân viên là: %d", luong);
        }else
        {
            ngayDu = soNgayCongThucTe - 26;
            luong = (int) (lcb * (1 + 1.5 * ngayDu));
            System.out.printf("Lương của nhân viên là: %d", luong);
        }
    }
}
