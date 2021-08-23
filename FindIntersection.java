package week3.Day2.Assignmnets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] s1={3,2,11,4,6,7};
		int[] s2={1,2,8,4,9,7};
		Arrays.sort(s1);
		Arrays.sort(s2);
		List<Integer> A1= new ArrayList<Integer>();
		for (int i = 0; i < s1.length; i++) {
			for (int j = 0; j < s2.length; j++) {
				if (s1[i]==s2[j]) {
					A1.add(s1[i]);
				}
			}
		}
		System.out.println("Intersection elements are : "+A1);
	}

}
