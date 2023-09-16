package ra.loops;

import java.util.Scanner;

public class DoWhile_Demo {
    public static void main(String[] args) {
        /*
        * Xây dựng chương trình order cho quán ăn sáng
        * 1. Hiển thị menu ăn sáng cho người dùng chọn (lặp vô hạn)
        * 2. Khi người dùng chọn thì sẽ chuyển sang bếp để làm
        * 3. Kết thúc quá trình chọn khi người dùng chọn thoát
        * *************MENU****************
        * 1. Phở bò Kobe
        * 2. Phở gà Việt Nam
        * 3. Xôi trứng
        * 4. Bánh mỳ ốp la
        * 5. Mỳ tôm không người lái
        * 6. Thoát
        * Lựa chọn của bạn:
        * */
        Scanner scanner = new Scanner(System.in);
        //In menu
        do {
            System.out.println("***********MENU****************");
            System.out.println("1. Phở bò Kobe");
            System.out.println("2. Phở gà Việt Nam");
            System.out.println("3. Xôi trứng");
            System.out.println("4. Bánh mỳ ốp la");
            System.out.println("5. Mỳ tôm không người lái");
            System.out.println("6. Thoát");
            System.out.print("Lựa chọn của bạn: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    System.out.println("Bạn vừa chọn phở bò Kobe, mời bạn chọn tiếp");
                    break;
                case 2:
                    System.out.println("Bạn vừa chọn phở gà Việt Nam, mời bạn chọn tiếp");
                    break;
                case 3:
                    System.out.println("Bạn vừa chọn xôi trứng, mời bạn chọn tiếp");
                    break;
                case 4:
                    System.out.println("Bạn vừa chọn bánh mỳ ốp la, mời bạn chọn tiếp");
                    break;
                case 5:
                    System.out.println("Bạn vừa chọn mỳ tôm không người lái, mời bạn chọn tiếp");
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.err.println("Vui lòng chọn từ 1-6");
            }
        }while(true);
    }
}
