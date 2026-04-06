package entities;

import entities.Student;

import java.util.Scanner;

public class GradeCalculator {
    private Student student;
    private Scanner sc = new Scanner(System.in);
    private String studentStatus;
    private int minimumPassingGrade = 60;

    private void showStudentGradeResult(double totalGrade, double missingGrade) {
        System.out.println("FINAL GRADE: " + totalGrade);
        System.out.println(this.studentStatus);

        if (totalGrade < this.minimumPassingGrade) {
            System.out.println("MISSING " + missingGrade);
        }
    }

    private double calculateMissingGrade(double totalGrade) {
        return this.minimumPassingGrade - totalGrade;
    }

    private void calculateFinalGrade() {
        double totalGrade = this.student.grade1 + this.student.grade2 + this.student.grade3;
        double missingGrade = 0;
        if (totalGrade < this.minimumPassingGrade) {
            this.studentStatus = "FAILED";
            missingGrade = this.calculateMissingGrade(totalGrade);
        } else {
            this.studentStatus = "PASS";
        }

        this.showStudentGradeResult(totalGrade, missingGrade);
    }

    public void getStudentGrades() {
        System.out.print("Informe o nome do estudante: ");
        var studentName = this.sc.nextLine();

        System.out.print("Nota 1: ");
        var grade1 = this.sc.nextDouble();

        System.out.print("Nota 2: ");
        var grade2 = this.sc.nextDouble();

        System.out.print("Nota 3: ");
        var grade3 = this.sc.nextDouble();

        this.student = new Student(studentName, grade1, grade2, grade3);

        this.calculateFinalGrade();

        this.sc.close();
    }


}
