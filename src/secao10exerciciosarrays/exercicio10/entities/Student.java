package secao10exerciciosarrays.exercicio10.entities;

public class Student {
    private String name;
    private double firstSemesterGrade;
    private double secondSemesterGrade;

    public Student(String name, double firstSemesterGrade, double secondSemesterGrade) {
        this.name = name;
        this.firstSemesterGrade = firstSemesterGrade;
        this.secondSemesterGrade = secondSemesterGrade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getFirstSemesterGrade() {
        return firstSemesterGrade;
    }

    public void setFirstSemesterGrade(double firstSemesterGrade) {
        this.firstSemesterGrade = firstSemesterGrade;
    }

    public double getSecondSemesterGrade() {
        return secondSemesterGrade;
    }

    public void setSecondSemesterGrade(double secondSemesterGrade) {
        this.secondSemesterGrade = secondSemesterGrade;
    }

    public boolean isApppoved() {
        double approvedGradeRequired = 6.0;
        double media = (getFirstSemesterGrade() + getSecondSemesterGrade()) / 2;
        if (media >= approvedGradeRequired) return true;
        else return false;
    }
}
