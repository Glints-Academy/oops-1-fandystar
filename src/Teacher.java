import java.util.ArrayList;

class Teacher extends Person{
    ArrayList<String> courses  = new ArrayList<String>();
    String course; 
    int numCourses;   
    
    
    Teacher(String name,String address) {
        super(name,address);
    } 


    boolean addCourse(String course) {
        this.course = course;
        boolean status = false;
        if (courses.size()==0) {
            courses.add(this.course);
            status=true;
        } else {
            for (String c : courses ) {
                if( c == this.course) {
                    status = false;
                    break;
                } else {
                    this.numCourses  =this.numCourses+1;
                    courses.add(this.course);
                    status = true;
                    break;
                }
            }
        }
        getCoursesAfterAdd();
        return status;
    }
    
    boolean removeCourse(String course) {
        boolean status = false;
        this.course = course;

        if (courses.size()==0) {
           
            status=false;
        } else {
            for (String c : courses ) {
                if( c != this.course) {
                    status = false;
                    break;
                } else {
                    this.numCourses  =this.numCourses-1;
                    courses.remove(this.course);
                    status = true;
                    break;
                }
            }
        }
        getCoursesAfterRemove();;
        return status;
    }
    
    void getCoursesAfterAdd(){
        System.out.println("Courses after Add '"+this.course+"' : "+courses);
    }
    void getCoursesAfterRemove(){
        System.out.println("Courses after Remove '"+this.course+"' : "+courses);
    }
    String getData() {
        return "Teacher : "+super.name+"("+super.address+")";
    }  
}




















