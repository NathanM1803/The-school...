package inClassWork;

public class StudentBody{
   public static void main(String[] args)
   {
//School
      Address school = new Address("800 Lancaster Ave.", "Villanova","PA", 19085);
//Courses
      Course danceEducation = new Course("Dance Education");
      Course videoEditing = new Course("Video Editing");
//John     
      Address jHome = new Address("21 Jump Street", "Blacksburg","VA", 24551);
      Student john = new Student("John", "Smith", jHome, school);
      john.setTestScore(1, 57);
      john.setTestScore(2, 69);
      john.setTestScore(3, 84);
//Marsha     
      Address mHome = new Address("123 Main Street", "Euclid", "OH",44132);
      Student marsha = new Student("Marsha", "Jones", mHome, school); 
      marsha.setTestScore(1, 92);
      marsha.setTestScore(2, 87);
      marsha.setTestScore(3, 78);
//Gwen
      Address gHome = new Address("180", "Dallas", "Texas", 78254);
      Student gwen = new Student("Gwen", "Stacy", gHome, school);
      gwen.setTestScore(1, 99);
      gwen.setTestScore(2,100);
      gwen.setTestScore(3, 95);
//Miles
      Address miHome = new Address("510 willbur ave", "Brooklyn", "New York", 69420);
      Student miles = new Student("Miles", "Morales", miHome, school);
      miles.setTestScore(1, 89);
      miles.setTestScore(2, 92);
      miles.setTestScore(3, 89);
//Steve
      Address sHome = new Address("178th st", "San Francisco", "California", 27815);
      Student steve = new Student("Steve", "Rodgers", sHome, school);
      steve.setTestScore(1, 78);
      steve.setTestScore(2, 74);
      steve.setTestScore(3, 76);
//Nuggets
      Address nHome = new Address("456 road rd", "Southing", "Conneticut", 06015);
      Student nuggets = new Student("Nuggets", "ThugHunter", nHome, school);
      nuggets.setTestScore(1, 76);
      nuggets.setTestScore(2, 84);
      nuggets.setTestScore(3, 4);
//Raj
      Address rHome = new Address("127 Greene Hill", "Narraganset", "Rhode Island", 78247);
      Student raj = new Student("Raj", "Rajchelor", rHome, school);
      raj.setTestScore(1, 92);
      raj.setTestScore(2, 52);
      raj.setTestScore(3, 2);
//Haven
      Address hHome = new Address("451 Burlington", "Bristol", "Conneticut", 06010);
      Student haven = new Student("Haven", "Miller", hHome, school);
      haven.setTestScore(1, 72);
      haven.setTestScore(2, 65);
      haven.setTestScore(3, 82);
//Jesus
      Address jeHome = new Address("123 coming ave", "bethleham", "Jerusalem", 78463);
      Student jesus = new Student("Jesus", "Christ", jeHome, school);
      jesus.setTestScore(1, 100);
      jesus.setTestScore(2, 100);
      jesus.setTestScore(3, 100);
//Alyssa
      Address aHome = new Address("128 Main St", "Anapolis", "Maryland ", 87634);
      Student alyssa = new Student("Alyssa", "Ginger", aHome, school);
      alyssa.setTestScore(1, 84);
      alyssa.setTestScore(2, 93);
      alyssa.setTestScore(3, 71);

//Enrollment
      danceEducation.addStudent(john);
      danceEducation.addStudent(marsha);
      danceEducation.addStudent(gwen);
      danceEducation.addStudent(miles);
      danceEducation.addStudent(steve);
      videoEditing.addStudent(nuggets);
      videoEditing.addStudent(raj);
      videoEditing.addStudent(haven);
      videoEditing.addStudent(jesus);
      videoEditing.addStudent(alyssa);
//System Out Stuff
      System.out.println(john);
      System.out.println();
      System.out.println(marsha);
      System.out.println();
      System.out.println(gwen);
      System.out.println();
      System.out.println(miles);
      System.out.println();
      System.out.println(steve);
      System.out.println();
      System.out.println(nuggets);
      System.out.println();
      System.out.println(raj);
      System.out.println();
      System.out.println(haven);
      System.out.println();
      System.out.println(jesus);
      System.out.println();
      System.out.println(alyssa);
      System.out.println();
      System.out.println(danceEducation.printStudents());
      System.out.println();
      System.out.println(videoEditing.printStudents());
      System.out.println();
      System.out.println(danceEducation.average());
      System.out.println();
      System.out.println(videoEditing.average());
      System.out.println();
   }
}