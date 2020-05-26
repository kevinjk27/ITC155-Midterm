import java.util.Scanner;
import java.util.ArrayList;

public class PhotoLineups {
	// TODO: Write method to create and output all permutations of the list of
	// names.

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		ArrayList<String> nameList = new ArrayList<String>();
		ArrayList<String> permList = new ArrayList<String>();
		String name;

		// TODO: Read in a list of names; stop when -1 is read. Then call recursive
		// method.
	}
	
	public static void allPermutations(ArrayList<String> permList, ArrayList<String> nameList) {
		System.out.println("Enter names, separated by a space. -1 to exit");
		String name = scnr.next();

		while (!name.equals("-1")) {
		nameList.add(name);
		name = scnr.next();
		}
	}

}
