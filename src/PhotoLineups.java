import java.util.Scanner;
import java.util.ArrayList;

public class PhotoLineups {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		ArrayList<String> nameList = new ArrayList<String>(); // contains all the names from user input
		ArrayList<String> permList = new ArrayList<String>();
		String name;

		System.out.println("Enter names, separated by a space. -1 to exit");
		name = scnr.next();

		while (!name.contains("-1")) {
			nameList.add(name);
			name = scnr.next();
		}
		allPermutations(permList, nameList);
		scnr.close();
	}

	public static void allPermutations(ArrayList<String> permList, ArrayList<String> nameList) {

		int i;
		int size = nameList.size();

		// base case

		if (size == 0) {
			for (i = 0; i < permList.size(); ++i) {
				System.out.print(permList.get(i) + " ");
			}
			System.out.println();
			
		} 
		else { // recursive case
			for (i = 0; i < size; ++i) { // looping nameList

				// create the arraylist for the premutations
				ArrayList<String> newPerms = new ArrayList<String>(permList);

				// add the items from the nameList to the permsList
				newPerms.add(nameList.get(i));

				// create a new names ararylist
				ArrayList<String> newNames = new ArrayList<String>(nameList);

				// remove the name at current index
				newNames.remove(i);

				// do the same with the new namelist recursively until base case is reached
				allPermutations(newPerms, newNames);
			}
		}
	}
}
