package week3.Day2.Assignmnets;

import java.util.ArrayList;
import java.util.List;

public class ArrayWithoutDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		List<Integer> array=new ArrayList<Integer>();
		List<Integer> Dup=new ArrayList<Integer>();
for (int i = 0; i < arr.length; i++) {
	for (int j = i+1; j < arr.length; j++) {
		if (arr[i]==arr[j]) {
		Dup.add(arr[i]);
}
	}
	array.add(arr[i]);
}
array.removeAll(Dup);
System.out.println("Elements after removing Duplicats : "+array);

	}

}
