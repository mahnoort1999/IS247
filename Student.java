import java.util.Date;

public class Student {
	private String name;
	private int studentID;
	private String major;
	private double gpa;
	private Date dateObj;
	private Address address;
	private Courses course1;
	
	static int count = 0;
	
	Student(String name) {
		this.name = name;
		dateObj = new Date();
	}

	public Student(String name, int studentID, String major, double gpa, Date dateObj, Address address) {
		this.name = name;
		this.studentID = studentID;
		this.major = major;
		this.gpa = gpa;
		this.dateObj = dateObj;
		this.address = address;
	}
	
	public Student(String name, int studentID, String major, Courses course1) {
		this.name = name;
		this.studentID = studentID;
		this.major = major;
		this.course1 = course1;
	}
	
	Student(){
		
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getStudentID() {
		return studentID;
	}
	
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	
	public String getMajor() {
		return major;
	}
	
	public void setMajor(String major) {
		this.major = major;
	}
	
	public double getGpa() {
		return gpa;
	}
	
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
	public Date getDateObj() {
		return dateObj;
	}
	
	public void setDateObj(Date dateObj) {
		this.dateObj = dateObj;
	}
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Courses getCourse1() {
		return course1;
	}

	public void setCourse1(Courses course1) {
		this.course1 = course1;
	}
	
	
	
	
}
