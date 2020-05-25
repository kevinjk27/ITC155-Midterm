import java.util.Scanner;
import java.util.HashMap;

public class StudentGrades {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter a student name: ");
		String studentName = scnr.nextLine();
		System.out.println("Enter new grade: ");
		double studentGrade = scnr.nextDouble();

		HashMap<String, Double> studentGrades = new HashMap<String, Double>();
		// Students' grades (pre-entered)
		studentGrades.put("Harry Rawlins", 84.3);
		studentGrades.put("Stephanie Kong", 91.0);
		studentGrades.put("Shailen Tennyson", 78.6);
		studentGrades.put("Quincy Wraight", 65.4);
		studentGrades.put("Janine Antinori", 98.2);

		if (studentGrades.containsKey(studentName)) {
			HashMap<String, Double> newStudentGrades = new HashMap<String, Double>();
			newStudentGrades.put(studentName, studentGrade);
			System.out.println(studentName + "'s original grade: " + studentGrades.get(studentName));
			System.out.println(studentName + "'s new grade: " + newStudentGrades.get(studentName));
			scnr.close();
		} else {
			studentGrades.put(studentName, studentGrade);
			System.out.println("New Student Added!");
			System.out.println(studentName + "'s new grade: " + studentGrades.get(studentName));
		}

	}
}