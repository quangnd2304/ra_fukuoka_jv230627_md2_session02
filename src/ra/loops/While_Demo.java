package ra.loops;

import java.util.Scanner;

public class While_Demo {
    public static void main(String[] args) {
        //Nhập và in ra 10 số lẻ
        //B1: Khai báo và khởi tạo biến để đếm số lẻ đã in cntOdd = 0
        //B2: Sử dụng while với điều kiện là cntOdd<10
        //B3: Nhập số từ bàn phím (number)
        //B4: Kiểm tra number có phải số lẻ không --> lẻ thì in ra và tăng cntOdd 1 đơn vị
        int cntOdd = 0;
        Scanner scanner = new Scanner(System.in);
        while(cntOdd<10){
            System.out.println("Nhập vào số nguyên: ");
            int number = Integer.parseInt(scanner.nextLine());
            if (number%2==1){
                System.out.println(number);
                cntOdd++;
            }
        }
    }
}
