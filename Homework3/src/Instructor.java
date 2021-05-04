public class Instructor extends  User{
    private String [] givenCourses;


    public Instructor(String name, String email, String password) {
        super(name, email, password);
    }

    public String[] getGivenCourses() {
        return givenCourses;
    }

    public void setGivenCourses(String[] givenCourses) {
        super.setCourses(givenCourses);
    }
}
