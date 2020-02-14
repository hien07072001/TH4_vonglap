import java.util.Scanner;

public class DesignMenu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("menu");
        System.out.println("1.ve hinh tam giac");
        System.out.println("2.ve hinh vuong");
        System.out.println("3.ve hinh chu nhat");
        System.out.println("thoat");
        System.out.println("nhap su lua chon cua ban:");
        while (true) {
            int luachon = input.nextInt();
            switch (luachon) {
                case 1:
                    System.out.println("ve hinh tam giac");
                    System.out.println("*****");
                    System.out.println("****");
                    System.out.println("***");
                    System.out.println("**");
                    System.out.println("*");
                    break;
                case 2:
                    System.out.println("ve hinh vuong");
                    System.out.println("****");
                    System.out.println("****");
                    System.out.println("****");
                    System.out.println("****");
                    break;
                case 3:
                    System.out.println("ve hinh chu nhat");
                    System.out.println("*****");
                    System.out.println("*****");
                    System.out.println("*****");
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("khong co lua chon");
                    break;


            }


        }

    }
}
