public class Main {
    public static void main(String[] args) {
        Instructor instructor1=new Instructor("Engin",32,"engin@gmail.com");
        Instructor instructor2=new Instructor("Mustafa",29,"mustafa@gmail.com");
        Lecture lecture1=new Lecture("C#",2);
        Lecture lecture2=new Lecture("Java",2);

        lecture1.givenFrom=instructor1.name;
        lecture2.givenFrom=instructor2.name;

        Lecture [] lectures={lecture1,lecture2};

        for (Lecture lecture:lectures){
            System.out.println(lecture.lectureName+" lecture given from "+lecture.givenFrom);
        }



    }
}
