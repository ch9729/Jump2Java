package example_startJava;

public class Score {

    public static void main(String[] args) {
        Student student = new Student();
        student.math = 96;
        student.science = 88;
        student.english = 76;

        System.out.println("수학: " + student.math);
        System.out.println("과학: " + student.science);
        System.out.println("영어: " + student.english);
    }

    public static class Student{
        int math;
        int english;
        int science;
    }
}
