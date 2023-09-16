package ra.loops;

import java.util.Scanner;

public class While_UngDung {
    public static void main(String[] args) {
        //Nhập các số từ bàn phím, kết thúc nhập khi nhập 0
        //1.Sử dụng vòng lặp while (vô hạn) để nhập dữ liệu
        //2. Nhập dữ liệu number
        //3. Kiểm tra number = 0--> thoát khỏi vòng lặp (break)
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Nhập vào một số:");
            int number = Integer.parseInt(scanner.nextLine());
            if (number==0){
                System.out.println("Chương trình kết thúc");
                break;
            }
        }
    }
}
