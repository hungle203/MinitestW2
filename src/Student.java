public class Student extends Human{
   private int avgPoint;
   private int id;

   public Student() {
   }

    public Student(int avgPoint,int id) {
        this.avgPoint = avgPoint;
    }

    public Student(String name, int age, int avgPoint,int id) {
        super(name, age);
        this.avgPoint= avgPoint;
    }

    public int getAvgPoint() {
        return avgPoint;
    }

    public void setAvgPoint(int avgPoint) {
        this.avgPoint = avgPoint;
    }

    @Override
    public String toString() {
        return "Student{" +
                "avgPoint=" + avgPoint +
                ", id=" + id +
                '}';
    }
}
