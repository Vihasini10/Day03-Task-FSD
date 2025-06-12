package basic;

	import java.util.Scanner;

	class Student {
	    String name;
	    int rollNo;
	    String course;
	    double marks;

	    Student(String name, int rollNo, String course, double marks) {
	        this.name = name;
	        this.rollNo = rollNo;
	        this.course = course;
	        this.marks = marks;
	    }

	    void displayStudent() {
	        System.out.println("Name   : " + name);
	        System.out.println("Roll No: " + rollNo);
	        System.out.println("Course : " + course);
	        System.out.println("Marks  : " + marks);
	        System.out.println("---------------------------");
	    }
	}

	public class StudentManagement {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("How many students do you want to add? ");
	        int n = sc.nextInt();
	        sc.nextLine(); // Consume newline

	        Student[] students = new Student[n];

	        for (int i = 0; i < n; i++) {
	            System.out.println("\nEnter details for Student " + (i + 1));
	            System.out.print("Name: ");
	            String name = sc.nextLine();

	            System.out.print("Roll No: ");
	            int rollNo = sc.nextInt();
	            sc.nextLine(); // Consume newline

	            System.out.print("Course: ");
	            String course = sc.nextLine();

	            System.out.print("Marks: ");
	            double marks = sc.nextDouble();
	            sc.nextLine(); // Consume newline

	            students[i] = new Student(name, rollNo, course, marks);
	        }

	        // Display all students
	        System.out.println("\n--- Student Details ---");
	        for (Student s : students) {
	            s.displayStudent();
	        }

	        sc.close();
	    }
	}


