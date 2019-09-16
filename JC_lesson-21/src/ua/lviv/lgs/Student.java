package ua.lviv.lgs;

public class Student {

	@StudentAnnotation("Use for student name")
	public String name;
	@StudentAnnotation("Use for student age")
	public int age;
	@StudentAnnotation("Use for student last name")
	private String lastName;
	@StudentAnnotation("Use for student course")
	private int course;
	@StudentAnnotation("Use for student priffesion")
	private String proffesion;

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public Student() {
		super();
	}

	public Student(String name, int age, String lastName, int course, String proffesion) {
		super();
		this.name = name;
		this.age = age;
		this.lastName = lastName;
		this.course = course;
		this.proffesion = proffesion;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getCourse() {
		return course;
	}

	public void setCourse(int course) {
		this.course = course;
	}

	public String getProffesion() {
		return proffesion;
	}

	public void setProffesion(String proffesion) {
		this.proffesion = proffesion;
	}

	public void changeUniversity(String name, String lastName) {
		System.out.println("Student " + name + " " + lastName + " transfered to another university");
	}

	public void changeCourse(String name, String lastName, int course) {
		System.out.println("Student " + name + " " + lastName + " transfered to the " + course + "th course");
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", lastName=" + lastName + ", course=" + course
				+ ", proffesion=" + proffesion + "]";
	}
}
