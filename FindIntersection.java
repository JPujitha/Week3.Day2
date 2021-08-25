package week3.Day2.Assignmnets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindIntersection {

	// TODO Auto-generated method stub
	int[] s1 = { 3, 2, 11, 4, 6, 7 };
	int[] s2 = { 1, 2, 8, 4, 9, 7 };

	public void m1() {
		List<Integer> A1 = new ArrayList<Integer>();
		for (int i = 0; i < s1.length; i++) {
			for (int j = 0; j < s2.length; j++) {
				if (s1[i] == s2[j]) {
					A1.add(s1[i]);

				}
			}
		}
		System.out.println("Intersection elements from m1 : " + A1);
	}

	public void m2() {
		List<Integer> A = new ArrayList<Integer>();
		List<Integer> B = new ArrayList<Integer>();

		for (int i = 0; i < s1.length; i++) {
			A.add(s1[i]);
		}
		for (int i = 0; i < s2.length; i++) {
			B.add(s2[i]);
		}
		A.retainAll(B);
		System.out.println("Intersection element from m2 : "+A);

	}

public static void main(String[] args) {
	FindIntersection ob= new FindIntersection();
	ob.m1();
	ob.m2();

}
}
