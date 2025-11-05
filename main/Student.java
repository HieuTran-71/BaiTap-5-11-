public class Student extends Person {
    private String id;

    public Student(String id, String fullname, String email) {
        super(fullname, email);
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Student: " + fullname + "(" + email + "), ID: " + id;
    }
}