package test;

public class StudentMarks extends StudentInfo {
	static int m1,m2,m3,m4,m5;
	public void inputMarks() {
		/*StudentMarks sm=new StudentMarks();
		sm.inputInfo();**/
		System.out.print("Enter marks of 1st subject: ");
		m1=s1.nextInt();
		System.out.print("Enter marks of 2nd subject: ");
		m2=s1.nextInt();
		System.out.print("Enter marks of 3rd subject: ");
		m3=s1.nextInt();
		System.out.print("Enter marks of 4th subject: ");
		m4=s1.nextInt();
		System.out.print("Enter marks of 5th subject: ");
		m5=s1.nextInt();
	}
}