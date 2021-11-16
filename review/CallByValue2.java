public class CallByValue2 {
    public static void main(String[] args) {
        Student std = new Student("hjkim");

        System.out.println("std : " + std);
        System.out.println("std.name : " + std.name);

        changeValue2(std);
        System.out.println("std : " + std);
        System.out.println("std.name : " + std.name);
    }

    static void changeValue2(Student student) {
        student = new Student("hj");
        System.out.println("student : " + student);
        System.out.println("student.name : " + student.name);
    }
}