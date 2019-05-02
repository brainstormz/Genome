

import java.util.ArrayList;
import java.util.Scanner;

public class DNAMotif {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		String pattern = sc.next();
		motif(input, pattern);

	}

	public static ArrayList<Integer> motif(String input, String pattern) {
		ArrayList<Integer> indexes = new ArrayList<>();
		for (int index = 0; index < input.length(); index++) {
			if (input.charAt(index) == pattern.charAt(0)) {
				boolean match = true;
				for (int i = 1; i < pattern.length(); i++) {
					if (index + i < input.length()) {
						if (input.charAt(index + i) != pattern.charAt(i)) {
							match = false;
							break;
						}
					}
					else if (index + i > input.length())
					{
						match = false;
						break;
					}
				}
				if (match) {
					indexes.add(index);
				}
			}
		}
		for (int i : indexes) {
			System.out.print(i + 1 + " ");
		}
		return indexes;
	}
}
