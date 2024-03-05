package Student_Grade;

import java.util.Scanner;

public class Student_Grade {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter English Marks");
		int a= sc.nextInt();
		System.out.println("Enter Marathi Marks");
		int b= sc.nextInt();
		System.out.println("Enter Hindi Marks");
		int c= sc.nextInt();
		System.out.println("Enter Maths Marks");
		int d= sc.nextInt();
		System.out.println("Enter Science Marks");
		int e= sc.nextInt();

		int total=a+b+c+d+e;
		System.out.println("Total marks:"+total);
		
		double percentage = (double) total/ 5;
		System.out.println("Percentage is:"+percentage);
	
		if(percentage >= 90){
			System.out.println("Excellent: Grade A");
		}else if(percentage < 90 && percentage >= 80){
			System.out.println("Very Good: Grade B");
		}else if(percentage < 80 && percentage >= 70){
			System.out.println("Good: Grade C");
		}else if(percentage < 70 && percentage >= 60){
			System.out.println("Satisfactory: Grade D");
		}else if(percentage < 60 && percentage >= 50){
			System.out.println("Work Hard: Grade E");
		}else if(percentage < 50 && percentage >= 40){
			System.out.println("Just Passed: Grade F");
		}else {
			System.out.println("Failed!");
		}
	}

}
