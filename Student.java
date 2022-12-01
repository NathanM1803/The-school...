package inClassWork;

public class Student{
    private String firstName, lastName;
    private Address homeAddress, schoolAddress; 
    private int test1, test2, test3;

    public Student(String first, String last, Address home,Address school){
       firstName = first;
       lastName = last;
       homeAddress = home;
       schoolAddress = school;
       test1 = test2 = test3 = 0;
    } 

public void setTestScore(int testNumber, int testScore){
   if (testNumber == 1){
      test1 = testScore;
   }else if (testNumber == 2){
      test2 = testScore;
   }else{
      test3 = testScore;
   }
}

public int getTestScore(int testNumber){
   if (testNumber == 1){
      return test1;
   }else if (testNumber == 2){
      return test2;
   }else{
      return test3;
   }
}
public double getAverage(){
   return (double) (test1 + test2 + test3)/3;
}

   public String toString(){

       String result; 
 
       result = firstName + " " + lastName + "\n";
       result += "Home Address:\n" + homeAddress + "\n";
       result += "School Address:\n" + schoolAddress + "\n"; 
       result += "test1: " + test1 + "\n";
       result += "test2: " + test2 + "\n";
       result += "test3: " + test3 + "\n";
       result += "average: " + this.getAverage() + "\n";
 
       return result;
    }
    public String getStudentName(){
      return firstName + " " + lastName;
    }
 }