package ra.loops;

import java.util.Scanner;

public class For_Demo {
    public static void main(String[] args) {
        //Nhập vào 1 số nguyên dương từ bàn phím (number), in ra các số chẵn trong khoảng 1-number
        //B1: Nhập 1 số nguyên dương
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào một số nguyên dương:");
        int number = scanner.nextInt();
        //B2: Dùng vòng lặp for(i) duyệt các số từ 1-number
        System.out.printf("Các số chẵn trong khoảng 1-%d là:\n",number);
        for (int i = 1; i <= number; i++) {
            //B3: Kiểm tra i có phải số chẵn hay không (if) --> chẵn thì in ra
            if (i%2==0){
                System.out.printf("%d\t",i);
            }
        }
    }
}
