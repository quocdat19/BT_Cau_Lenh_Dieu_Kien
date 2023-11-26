import java.util.Scanner;

public class B2 {
    public static void main(String[] args) {
        float avgMark;
        float html, css, javascript;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("html: ");
            html = Float.parseFloat(scanner.nextLine());
        }while(html < 0 && html > 10);

        do{
            System.out.println("css: ");
            css = Float.parseFloat(scanner.nextLine());
        }while(css < 0 || css > 10);

        do{
            System.out.println("javascript: ");
            javascript = Float.parseFloat(scanner.nextLine());
        }while(javascript < 0 || javascript > 10);



        avgMark = (html + css + javascript) / 3;

        if (0 <= avgMark && avgMark < 5)
        {
            System.out.println("Xếp loại yếu"+ " Điểm trung bình: "  + avgMark);
        }
        else if (5 <= avgMark && avgMark < 7)
        {
            System.out.println("Xếp loại trung bình"+ " Điểm trung bình: "  + avgMark);
        }
        else if (7 <= avgMark && avgMark < 8)
        {
            System.out.println("Xếp loại khá"+ " Điểm trung bình: "  + avgMark);
        }
        else if (8 <= avgMark && avgMark < 9)
        {
            System.out.println("Xếp loại giỏi" + " Điểm trung bình: " + avgMark);
        }
        else
        {
            System.out.println("Xếp loại xuất sắc" + " Điểm trung bình: "  + avgMark);
        }
    }
}
