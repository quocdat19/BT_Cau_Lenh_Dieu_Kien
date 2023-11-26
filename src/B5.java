import java.util.Scanner;

public class B5 {
    public static void main(String[] args) {
        float a, b, c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("a:");
        a = Float.parseFloat(scanner.nextLine());
        System.out.println("b:");
        b = Float.parseFloat(scanner.nextLine());
        System.out.println("c:");
        c = Float.parseFloat(scanner.nextLine());

        if(a > b + c || b > a + c || c > a + b){
            System.out.println("Đây không phải 3 cạnh của tam giác");
        } else {
            if(a == b && b == c){
                System.out.println("Đây là tam giác đều");
            } else if (a == b || b == c || a == c) {
                System.out.println("Đây là tam giác cân");

            } else if (a*a == b*b + c*c || b*b == a*a + c*c || c*c == a*a + b*b) {
                System.out.println("Đây là tam giác vuông");
            } else {
                System.out.println("Đây là tam giác thường");
            }
        }

    }
}
