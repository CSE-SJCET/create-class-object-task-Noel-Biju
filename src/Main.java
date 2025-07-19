class Student{
	String name;
	int rollNumber;
	char grade;
     public void displayDetails(){
		System.out.println("Name:\t"+name);
		System.out.println("Roll NO:\t"+rollNumber);
		System.out.println("Grade:\t"+grade);
	}
}
public class Main {
      public static void main(String[] args) {
          Student student = new Student();
		student.name="Noel Biju";
		student.rollNumber=59;
		student.grade='A';
		student.displayDetails();
    }
}
