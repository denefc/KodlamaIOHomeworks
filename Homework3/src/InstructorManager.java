public class InstructorManager extends UserManager{
    @Override
    public void showCourses(User user) {
        System.out.println("Those courses  given from "+user.name);
    }
}
