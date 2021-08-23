package week3.Day2.Assignmnets;

import java.util.ArrayList;
import java.util.List;

public class DuplicateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn java basics as part of java sessions in java week1 sessions";
		String[] str = text.split(" ");
		List<String> A = new ArrayList<String>();
		List<String> D = new ArrayList<String>();
		for (int i = 0; i < str.length; i++) {
			if (A.contains(str[i])) {
				D.add(str[i]);
			} 
			else {
				A.add(str[i]);
			}
		}
		System.out.println(A);
	}
}
