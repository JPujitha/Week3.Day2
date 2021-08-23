package week3.Day2.Assignmnets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,7,6,8};
		Arrays.sort(arr);
		List<Integer> missing= new ArrayList<Integer>();
		int min=arr[0];
		for (int i = 0; i < arr.length; i++)
		{
			if(arr[i]!=min+i)
			{
				System.out.println("Missing value in Array is : "+(min+i));
				break;
			}
		}
	}

}
