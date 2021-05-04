public class Main {
    public static void main(String[] args) {
        Student student1=new Student("Ali","ali@gmail.com","123124");
        Instructor instructor1=new Instructor("Engin","engin@gmail.com","123412343");

        String [] studentCourses={"Java","C#"};
        student1.setTakenCourses(studentCourses);

        String [] instructorCourses={"Java","C#"};
        instructor1.setGivenCourses(instructorCourses);

        InstructorManager instructorManager=new InstructorManager();
        StudentManager studentManager=new StudentManager();

        for (String course:instructorCourses){
            System.out.println(course);
        }
        instructorManager.showCourses(instructor1);
        for (String course:studentCourses){
            System.out.println(course);
        }
        studentManager.showCourses(student1);
    }
}
