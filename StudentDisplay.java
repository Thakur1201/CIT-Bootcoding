package test;

public class StudentDisplay extends StudentMarks{
	public static void main(String[] args) {
		StudentDisplay d1=new StudentDisplay();
		d1.inputInfo();
		d1.inputMarks();
		int total=m1+m2+m3+m4+m5;
		float avg=total/5;
		float per=100*total/500;
		System.out.println("Total marks scored: "+total);
		System.out.println("Average: "+avg);
		System.out.println("Percentage: "+per);
	}
}
