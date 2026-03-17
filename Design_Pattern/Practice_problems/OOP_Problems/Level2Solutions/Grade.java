package Design_Pattern.Practice_problems.OOP_Problems.Level2Solutions;

public class Grade {
    private int math, science, english;

    public void inputMarks(int m, int s, int e) {
        this.math = m;
        this.science = s;
        this.english = e;
    }

    public double calculateAverage() {
        return (math + science + english) / 3.0;
    }

    public String determineGrade() {
        double avg = calculateAverage();
        if (avg >= 90) return "A";
        else if (avg >= 80) return "B";
        else if (avg >= 70) return "C";
        else if (avg >= 60) return "D";
        else return "F";
    }
}
