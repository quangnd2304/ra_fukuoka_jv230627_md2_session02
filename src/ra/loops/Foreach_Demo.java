package ra.loops;

public class Foreach_Demo {
    public static void main(String[] args) {
        //In ra các phần tử của mảng
        int[] arrInt = {3, 5, 7, 2, 4, 6};
        System.out.println("Giá trị các phần tử trong mảng là:");
        //Dùng foreach để duyệt mảng
        for (int element : arrInt) {
            System.out.printf("%d\t",element);
        }
    }
}
