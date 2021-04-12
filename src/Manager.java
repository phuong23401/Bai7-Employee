import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Manager {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Employee> employeeList = new ArrayList<>();

    static {
        EmployeeFulltime nv1 = new EmployeeFulltime(1, "a", 19, "1", "aaa", 50000, 20000, 500000);
        EmployeeFulltime nv2 = new EmployeeFulltime(2, "b", 19, "2", "bbb", 50000, 20000, 600000);
        EmployeeParttime nv3 = new EmployeeParttime(3, "c", 20, "3", "ccc", 45.5);
        EmployeeParttime nv4 = new EmployeeParttime(4, "d", 20, "4", "ddd", 50);
        employeeList.add(nv1);
        employeeList.add(nv2);
        employeeList.add(nv3);
        employeeList.add(nv4);
    }

    public static void show() {
        for (Employee employee : employeeList) {
            System.out.println(employee.toString());
        }
    }

    public static void add() {
        int id = inputId();
        String name = inputName();
        int age = inputAge();
        String phoneNum = inputPhoneNum();
        String email = inputEmail();

        Employee employee = new Employee(id, name, age, phoneNum, email) {
            @Override
            public int payRollSalary() {
                return 0;
            }
        };
        employeeList.add(employee);
    }

    public static int inputId() {
        System.out.print("Nhập id nhân viên: ");
        while (true) {
            try {
                int id = Integer.parseInt(scanner.nextLine());
                return id;
            } catch (Exception e) {
                System.out.println("Id không hợp lệ. Vui lòng nhập lại!");
            }
        }
    }

    public static String inputName() {
        System.out.print("Nhập tên nhân viên: ");
        return scanner.nextLine();
    }

    public static int inputAge() {
        System.out.print("Nhập tuổi nhân viên: ");
        while (true) {
            try {
                int age = Integer.parseInt(scanner.nextLine());
                return age;
            } catch (Exception e) {
                System.out.println("Tuổi không hợp lệ. Vui lòng nhập lại!");
            }
        }
    }

    public static String inputPhoneNum() {
        System.out.print("Nhập số điện thoại nhân viên: ");
        return scanner.nextLine();
    }

    public static String inputEmail() {
        System.out.print("Nhập email nhân viên: ");
        return scanner.nextLine();
    }

    public static int payRollFulltime(int id) {
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getId() == id) {

            }
        }
    }
}
