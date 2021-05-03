public class Main {
    public static void main(String[] args) {
        Instructor instructor1=new Instructor("Engin","engin@gmail.com",33);
        Instructor instructor2=new Instructor("Mustafa","mustafa@gmail.com",29);

        Lecture lecture1=new Lecture(1,"C#",instructor1.name);
        Lecture lecture2=new Lecture(2,"Java",instructor2.name);

        Lecture [] lectures={lecture1,lecture2};
        for (Lecture lecture:lectures){
            System.out.println(lecture.name);
        }

        Instructor []instructors={instructor1,instructor2};
        for (Instructor instructor:instructors){
            System.out.println(instructor.name);
        }

        LectureManager lectureManager=new LectureManager();
        String givenFrom=lectureManager.givenLecture(lecture1);
        System.out.println(givenFrom);
        lectureManager.addLecture(lecture1);
        lectureManager.deleteLecture(lecture2);
    }
}
