package ra.decisionMarking;

import java.util.Scanner;

public class IfElse_Demo {
    public static void main(String[] args) {
        //Nhập vào một số nguyên từ bàn phím, in ra số dư trong phép chia 5
        //B1: Nhập một số nguyên từ bàn phím chứa vào biến number
        //1. Khởi tạo đối tượng Scanner
        Scanner scanner = new Scanner(System.in);
        //2. Thông báo nhập dữ liệu
        System.out.println("Nhập một số nguyên:");
        //3. Sử dụng phương thức nextInt --> numnber
        int number = scanner.nextInt();
        //B2: In ra số dư trong phép chia 5 (if-elseif-else)
        //Sử dụng 1 if - 3 else if - 1 else
        if (number%5==0){
            System.out.printf("%d chia hết cho 5\n",number);
        } else if (number%5==1) {
            System.out.printf("%d chia 5 dư 1\n",number);
        } else if (number%5==2) {
            System.out.printf("%d chia 5 dư 2\n",number);
        } else if (number%5==3) {
            System.out.printf("%d chia 5 dư 3\n",number);
        }else{
            System.out.printf("%d chia 5 dư 4\n",number);
        }
    }
}
