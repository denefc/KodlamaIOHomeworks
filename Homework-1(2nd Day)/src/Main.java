public class Main {
    public static void main(String[] args) {
        Instructor instructor1=new Instructor("Engin",32,"engin@gmail.com");
        Instructor instructor2=new Instructor("Mustafa",29,"mustafa@gmail.com");
        Lecture lecture1=new Lecture("C#",1,instructor1.name);
        Lecture lecture2=new Lecture("Java",2,instructor2.name);
        LectureManager lectureManager=new LectureManager();


        Lecture [] lectures={lecture1,lecture2};
        Instructor []instructors={instructor1,instructor2};

        for (Lecture lecture:lectures){
            System.out.println(lecture.lectureName);
        }
        for (Instructor instructor:instructors){
            System.out.println(instructor.name);
        }

        lectureManager.addToLecture(lecture1);
        lectureManager.deleteToLecture(lecture2);

    }
}
