import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeFulltime fulltime = new EmployeeFulltime();
        EmployeeParttime parttime = new EmployeeParttime();

        while (true) {
            System.out.println("-----Menu-----");
            System.out.println("1. Hiển thị danh sách nhân viên");
            System.out.println("2. Thêm mới nhân viên");
            System.out.println("3. Tính lương nhân viên fulltime");
            System.out.println("4. Tính lương nhân viên parttime");
            System.out.println("5. Hiển thị danh sách nhân viên fulltime có lương thấp hơn mức lương trung bình");
            System.out.println("6. Tính tổng lương nhân viên parttime");
            System.out.println("0. Thoát");
            System.out.println("Mời chọn chức năng: ");

            int choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    Manager.show();
                    break;
                case 2:
                    Manager.add();
                    System.out.println("Đã thêm nhân viên!");
                    break;
                case 3:

            }
        }
    }
}
