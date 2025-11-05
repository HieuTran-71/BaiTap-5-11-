public class KLTN<T extends Person, V extends Person> {
    private V student;
    private T advisor;
    private String fullname;

    public KLTN(V student, T advisor, String fullname) {
        this.student = student;
        this.advisor = advisor;
        this.fullname = fullname;
    }

    public V getStudent() {
        return student;
    }

    public T getAdvisor() {
        return advisor;
    }

    public String getFullname() {
        return fullname;
    }

    @Override
    public String toString() {
        return "KLTN: " + fullname + "\n" +
                "Student: " + student.toString() + "\n" +
                "Advisor: " + advisor.toString();
    }
}
