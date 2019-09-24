import java.math.BigInteger;
import java.util.Date;

public class StudentDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address address1 = new Address();
		address1.setStreet1("1345 Hilltop Circle");
		address1.setCity("Baltimore");
		address1.setState("MD");
		address1.setZipcode(21004);
			//above sets street, city, state, zip with values for address1 object
		
		Student johndoe = new Student("John", 1, "IS", 4.0, new Date(), address1); //use address1 object within johndoe object
		
		System.out.println(johndoe.getName());
		System.out.println(johndoe.getStudentID());
		System.out.println(johndoe.getMajor());
		System.out.println(johndoe.getGpa());
		System.out.println(johndoe.getDateObj());
		
		//I want John Doe's address. By accessing the johndoe object, I can use getAddress() method and get all components of it
		//like the street, city, state and zip
		System.out.println(johndoe.getAddress().street1 + " " + johndoe.getAddress().getCity() + ", " +
				johndoe.getAddress().getState() + " " + johndoe.getAddress().getZipcode());
		
		
//Wrapper Practice:
		//Wrapper class wraps around primitive type and provides methods and functionality
		//byte short int long float double char boolean = PRIMITIVE types
		
		int a = 10; //all i can do is print or multiple, subtract etc. a is a primitive variable
		System.out.println(a); // 10
		
		Integer a1 = new Integer(10); //object type
		System.out.println(a1); //10
		
		//with a1, I can use many methods that come from Integer library class
		
		System.out.println(a + a1); //possible and will add it to eachother like normal integers
		System.out.println(a1.compareTo(10)); //a1 = 10. compares that to what is in (). prints 0 to signify true
		
//Converting Types:
		String s = "20";
		String t = "30";
		System.out.println(s+t); //prints 2030 because it concatenates its
		
		int x = Integer.parseInt(s); //converts my string to an int

//BigInteger and BigDecimal to hold big values because normal int and double could have overflow
		BigInteger prac1 = new BigInteger("20000");
		

		
		Courses course1 = new Courses();
		course1.setName("Java Programming 2");
		course1.setId("IS247");
		course1.setProfessor("Professor Mathews");
		
		Student myPractice = new Student("Mahnoor", 1010, "IS", course1);
		//System.out.println(myPractice.getName(), myPractice.getStudentID(), myPractice.getMajor(), 
				//myPractice.getCourse1().getName(), myPractice.getCourse1().getId(), myPractice.getCourse1().getProfessor());
		
		
	}

}
//STUDY FOR EXAM:
//creating a student class array. Pass multiple objects to that course array that goes into Student..
//print student object with multiple courses. e.g. at index of 0 is 1st course and 1st index is 2nd course etc.

