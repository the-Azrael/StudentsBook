import java.util.Objects;

public class Student {
    private static final String DELIMITER = " ";

    private String fio;
    private String group;
    private String studentId;

    public Student(String fio, String group, String studentId) {
        this.fio = fio;
        this.group = group;
        this.studentId = studentId;
    }

    public Student(String string) throws NotEnoughDataException {
        String[] data = string.split(DELIMITER);
        if (data.length < 3) {
            throw new NotEnoughDataException();
        }
        this.fio = data[0];
        this.group = data[1];
        this.studentId = data[2];
    }

    public String getFio() {
        return fio;
    }

    public String getGroup() {
        return group;
    }

    public String getStudentId() {
        return studentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(studentId, student.studentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId);
    }

    @Override
    public String toString() {
        return this.fio + ", " + this.group + ", " + this.studentId;
    }
}
