package Day1;

import java.util.*;

public class Contains_Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 1 };
		System.out.println(containsDuplicate(arr));
	}
	public static boolean containsDuplicate(int[] nums) {
		HashSet<Integer> ll = new HashSet<>();
		for (int i = 0; i < nums.length; i++) {
			if (ll.contains(nums[i])) {
				return true;
			}
			ll.add(nums[i]);
		}
		return false;
	}

}
