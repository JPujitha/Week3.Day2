package week3.Day2.Assignmnets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {3,2,11,4,6,7};
		List<Integer> A=new ArrayList<Integer>();
		for (int i = 0; i < data.length; i++) {
			A.add(data[i]);
		}
		Collections.sort(A);
		int l=A.size();
		System.out.println("Second Largest number is : "+(A.get(l-2)));
	}

}
