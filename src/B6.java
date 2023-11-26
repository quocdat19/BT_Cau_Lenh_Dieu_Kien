import java.util.Scanner;

public class B6 {
    public static void main(String[] args) {
        int cu, moi;
        int soDien;
        double giaDien;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chỉ số công tơ điện đầu tháng: ");
        cu = scanner.nextInt();
        System.out.println("Chỉ số công tơ điện cuối tháng: ");
        moi = scanner.nextInt();

        soDien = moi - cu;

        if(0 <= soDien && soDien < 50){
            giaDien = 10000;
        } else if (50 <= soDien && soDien < 100) {
            giaDien = 15000;
        } else if (100 <= soDien && soDien < 150) {
            giaDien = 20000;
        } else if (150 <= soDien && soDien < 200) {
            giaDien = 25000;
        } else {
            giaDien = 30000;
        }


        double tongTienDien = soDien * giaDien;


        System.out.println("Số điện tiêu thụ trong tháng: " + soDien + " kWh");
        System.out.println("Giá điện: " + giaDien + " VNĐ/kWh");
        System.out.println("Tổng tiền điện: " + tongTienDien + " VNĐ");

    }
}
