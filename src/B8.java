import java.util.Scanner;

public class B8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập năm: ");
        int year = scanner.nextInt();
        System.out.print("Nhập tháng: ");
        int month = scanner.nextInt();
        System.out.print("Nhập ngày: ");
        int day = scanner.nextInt();

        switch(month)
        {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
            if(day>0 && day <=30)
                System.out.printf("Ngày %d Tháng %d Năm %d hợp lệ", day, month, year);
            else System.out.printf("Ngày %d Tháng %d Năm %d không hợp lệ", day, month, year);
            break;
            case 4: case 6: case 9: case 11:
            if(day>0 && day<=30)
                System.out.printf("Ngày %d Tháng %d Năm %d hợp lệ", day, month, year);
            else System.out.printf("Ngày %d Tháng %d Năm %d không hợp lệ", day, month, year);
            break;
            case 2:
                if(day>0 && day<=28 || day<=29)
                    System.out.printf("Ngày %d Tháng %d Năm %d hợp lệ", day, month, year);
                else System.out.printf("Ngày %d Tháng %d Năm %d không hợp lệ", day, month, year);
                break;
            default: System.out.printf("Ngày %d Tháng %d Năm %d không hợp lệ", day, month, year);
            break;
        }
    }
}

