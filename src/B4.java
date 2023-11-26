import java.util.Scanner;

public class B4 {
    public static void main(String[] args) {
        int a;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Số nguyên cần nhập: ");
        a = scanner.nextInt();

        if(a % 3 == 0 && a % 5 == 0){
            System.out.printf("%d chia hết cho 3 và 5", a);
        }
        else
        {
            System.out.printf("%d không chia hết cho cả 3 và 5", a);
        }


    }
}
