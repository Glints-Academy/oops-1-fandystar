
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\n");
        
        // person
        Person ana = new Person("ana", "alamat bukit");
        System.out.println(ana.getData());
        System.out.println("\n");
      
        //  student
        Student student1 = new Student("budi", "alamat dempo");
        System.out.println(student1.getData());
        System.out.println(" ");
        student1.addCourseGrade("mtk", 70);  // add course grade
        student1.addCourseGrade("biologi", 80);
        student1.addCourseGrade("kimia", 100);
        student1.addCourseGrade("fisika", 95);
        student1.printGrades();
        System.out.println("Average Grade : "+student1.getAverageGrade());
        System.out.println("\n");

        // teacher
        Teacher teacher1 = new Teacher("agus", "alamat pantai");
        System.out.println(teacher1.getData()+"\n"); // add course
        System.out.println(teacher1.addCourse("mtk"));
        System.out.println(teacher1.addCourse("kimia"));
        System.out.println(teacher1.addCourse("mtk"));
        System.out.println("\n");
        System.out.println(teacher1.removeCourse("mtk"));
        System.out.println(teacher1.removeCourse("kimia"));
        System.out.println(teacher1.removeCourse("biologi"));
        
    }
}
