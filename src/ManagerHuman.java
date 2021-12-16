import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class ManagerHuman implements Manager{
    private Student[] students;
    public ManagerHuman(Student[] students, int index) {
        this.students = students;
        this.index = index;
    }


    private int index = 0;
    @Override
    public void createHuman(Student student) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi");
        int age = scanner.nextInt();
        System.out.println("Nhập điểm trung bình");
        int avg = scanner.nextInt();
        System.out.println("Nhập id");
        int id = scanner.nextInt();
    }

    @Override
    public void displayName() {
        for (Student student: students) {
          if (student!=null) {
              System.out.println(student);
          }
        }
    }

    @Override
    public void addHuman(Student student) {
        if (index == students.length) {
            students = Arrays.copyOf(students,students.length *2);
        }
        students[index] = student;
        index ++;
    }

    @Override
    public void findHuman(String name) {
        System.out.println("Nhập tên bạn muốn tìm");
        for (Student student: students) {
            if (student!=null && student.getName().equals(name) ) {

            }
        }
    }

    @Override
    public void deleteHuman() {
        System.out.println("Nhập vào tên bạn muốn xóa");
        for (Student student: students) {

        }
    }

    @Override
    public void editHuman() {
        System.out.println("Nhập vào người bạn muốn xóa");
        for (Student student : students) {

        }

    }

    @Override
    public void sortHuman() {
       Arrays.sort(students, new Comparator<Student>() {
           @Override
           public int compare(Student o1, Student o2) {
            if (o1 != null && o2 !=null) {
                if (o1.getAvgPoint() > o2.getAvgPoint()) {
                    return -1;
                }else if (o1.getAvgPoint() < o2.getAvgPoint()) {
                    return 1;
                }
                else return 0;
            }else {
                return 0;
            }
           }
       });
    }

    @Override
    public void totalAvg() {

    }
}
