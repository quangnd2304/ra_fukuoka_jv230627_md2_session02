package ra.decisionMarking;

import java.util.Scanner;

public class SwitchCase_Demo {
    public static void main(String[] args) {
        //Nhập vào một số từ 0-9, phiên âm số vừa nhập
        //B1: Nhập vào một số nguyên 0-9
        //1. Khởi tạo đối tượng Scanner
        Scanner scanner = new Scanner(System.in);
        //2. Thông báo nhập số nguyên
        System.out.println("Nhập vào một số nguyên 0-9:");
        //3. Lấy dữ liệu nhập lưu vào biến (number) --> sử dụng phương thức nextLine()--> int
        int number = Integer.parseInt(scanner.nextLine());
        //B2: Sử dụng switch...case phiên âm số
        //1. switch(number)
        //2. sử dụng 9 case - 1 default
        switch (number){
            case 0:
                System.out.printf("%d phiên âm: Không\n",number);
                break;
            case 1:
                System.out.printf("%d phiên âm: Một\n",number);
                break;
            case 2:
                System.out.printf("%d phiên âm: Hai\n",number);
                break;
            case 3:
                System.out.printf("%d phiên âm: Ba\n",number);
                break;
            case 4:
                System.out.printf("%d phiên âm: Bốn\n",number);
                break;
            case 5:
                System.out.printf("%d phiên âm: Năm\n",number);
                break;
            case 6:
                System.out.printf("%d phiên âm: Sáu\n",number);
                break;
            case 7:
                System.out.printf("%d phiên âm: Bảy\n",number);
                break;
            case 8:
                System.out.printf("%d phiên âm: Tám\n",number);
                break;
            default:
                System.out.printf("%d phiên âm: Chín\n",number);
        }
    }
}
