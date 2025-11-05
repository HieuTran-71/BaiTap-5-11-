public class Teacher extends Person {
    private String id;
    private String title;

    public Teacher( String fullname, String email, String id, String title) {
        super(fullname, email);
        this.id = id;
        this.title = title;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Teacher: " + fullname + " (" + email + "), ID: " + id + ", Title: " + title;
    }
}
