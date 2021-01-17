import java.util.ArrayList;

class Student extends Person{
    ArrayList<String> courses  = new ArrayList<String>();
    ArrayList<Integer> grades  = new ArrayList<Integer>();
    String course; 
    int grade ; 
    int numCourses;   
    
    
    Student(String name,String address) {
        super(name,address);
      
    } 

    void addCourseGrade(String course,int grade) {
        this.numCourses  =this.numCourses+1;
        this.course = course;
        this.grade=grade;
        courses.add(this.course);
        grades.add(this.grade);
    }

    void printGrades() {
        System.out.println("Grades : "+grades);
       // System.out.println(numCourses);
    }

    double getAverageGrade() {
        double total =  0;
        for ( int angka : grades) {
            total = total + angka;    
        }
        return (double) Math.round(total/numCourses*100)/100;
    }

    String getData() {
        return "Student : "+super.name+"("+super.address+")";
    }  
}




















