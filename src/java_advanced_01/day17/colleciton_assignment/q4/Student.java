package java_advanced_01.day17.colleciton_assignment.q4;

public class Student implements Comparable<Student> {
    public String id;
    public int score;

    public Student (String id, int score) {
        this.id = id;
        this.score = score;
    }

    @Override
    public int compareTo(Student o) {
        if (this.score == o.score) return 0;
        else if (this.score > o.score) return 1;
        return -1;
    }
}
