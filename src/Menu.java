import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng");
        int size = scanner.nextInt();
        Human[] humans = new Human[size];
        ManagerHuman managerHuman  = new ManagerHuman(humans);

        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1. Tạo danh sách");
            System.out.println("2. Hiển thị danh sách");
            System.out.println("3. Thêm một người vào danh sách");
            System.out.println("4. Tìm vị trí một người trong danh sách");
            System.out.println("5. Xóa một ng trong danh sách theo mã");
            System.out.println("6. Sửa thông tin một ng theo mã");
            System.out.println("7. Sắp xếp theo điểm trung bình");
            System.out.println("8. Tính tổng điêm");
            System.out.println("Nhập lựa chọn của bạn");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    managerHuman.createHuman(new Student());
                    break;
                case 2:
                    managerHuman.displayName();
                    break;
                case 3:
                    managerHuman.findHuman("ha");
                    break;
                case 4:
                    managerHuman.deleteHuman();
                    break;
                case 7:
                    managerHuman.sortHuman();
            }

        }while (choice!=0);
    }

}
