public class Student {

    String name;
    int age;
    int schoolNumber;

    public Student(String name, int age, int schoolNumber) {
        this.name = name;
        this.age = age;
        this.schoolNumber = schoolNumber;
    }

    public void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("School Number: " + schoolNumber);
        System.out.println("---------------");
    }

    public static void main(String[] args) {
        Student s1 = new Student("Ravi", 21, 1234);
        Student s2 = new Student("Elvin", 20, 5678);

        s1.showInfo();
        s2.showInfo();
    }
}
