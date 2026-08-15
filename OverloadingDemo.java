public class OverloadingDemo {

    static class Student {
        String name;
        int age;

        Student() {
            name = "Unknown";
            age = 0;
        }

        Student(String name) {
            this.name = name;
            age = 18;
        }

        Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        void display() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        }

        void display(String course) {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Course: " + course);
        }

        static void collegeName() {
            System.out.println("College: ABC College");
        }
    }

    public static void main(String[] args) {

        Student.collegeName();

        Student s1 = new Student();
        s1.display();

        Student s2 = new Student("Rahul");
        s2.display();

        Student s3 = new Student("Priya", 20);
        s3.display("BCA");
    }
}