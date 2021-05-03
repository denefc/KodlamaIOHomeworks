public class LectureManager {
    public String givenLecture(Lecture lecture){
        return "this lecture("+lecture.name+") given from "+lecture.givenFrom;
    }
    public void addLecture(Lecture lecture){
        System.out.println(lecture.name+"added");
    }
    public void deleteLecture(Lecture lecture){
        System.out.println(lecture.name+" deleted");
    }
}
