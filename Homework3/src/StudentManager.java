public class StudentManager extends UserManager {
    @Override
    public void showCourses(User user) {
        System.out.println("Those courses taken from "+user.name);
    }
}
