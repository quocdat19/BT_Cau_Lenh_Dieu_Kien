import java.util.Scanner;

public class B9 {
    public static void main(String[] args) {
        int a, b ,c;
        Scanner scanner = new Scanner(System.in);
        System.out.print("a: ");
        a = scanner.nextInt();
        System.out.print("b: ");
        b = scanner.nextInt();
        System.out.print("c: ");
        c = scanner.nextInt();

        int x;

        if(a>b){
            x=a;
            a=b;
            b=x;
        }
        if(a>c){
            x=a;
            a=c;
            c=x;
        }
        if(b>c){
            x=b;
            b=c;
            c=x;
        }

        System.out.println("Thứ tự tăng dần của dãy là: " + a + b + c);
    }
}
