package test;

public class StudentDisplay extends StudentMarks{
	public static void main(String[] args) {
		StudentDisplay d1=new StudentDisplay();
		d1.inputInfo();
		d1.inputMarks();
		int total=m1+m2+m3+m4+m5;
		float avg=total/5;
		float per=(total/500)*100;
		System.out.print("Total marks scored: "+total);
		System.out.print("Average: "+avg);
		System.out.print("Percentage: "+per);
	}
}