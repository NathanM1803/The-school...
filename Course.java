package inClassWork;

public class Course {
    public Student Student1, Student2, Student3, Student4, Student5;
    public String courseName;
    int count;

public Course(String course){
      courseName = course;
      count = 0;
}

public void addStudent(Student newStudent){


if(count == 0){
    Student1 = newStudent;
    count ++;
}else if(count == 1){
    Student2 = newStudent;
    count ++;
}else if(count == 2){
    Student3 = newStudent;
    count ++;
}else if(count == 3){
    Student4 = newStudent;
    count ++;
}else if(count == 4){
    Student5 = newStudent;
    count ++;
}else{
    System.out.println("Class is already full");
        }
    }
public double average(){
    double average = ((Student1.getAverage() + Student2.getAverage() + Student3.getAverage() + Student4.getAverage() + Student5.getAverage())/5);
    return average;
}
public String printStudents(){
    String a = "";
    a += Student1.getStudentName() + ", ";
    a += Student2.getStudentName() + ", ";
    a += Student3.getStudentName() + ", ";
    a += Student4.getStudentName() + ", ";
    a += Student5.getStudentName() + ", ";
    return a;
    }
}