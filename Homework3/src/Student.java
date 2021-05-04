public class Student extends User{
    private String[] takenCourses;


    public Student(String name, String email, String password) {
        super(name, email, password);
    }

    public String[] getTakenCourses() {
        return takenCourses;
    }

    public void setTakenCourses(String[] takenCourses) {
        super.setCourses(takenCourses);
    }
}
