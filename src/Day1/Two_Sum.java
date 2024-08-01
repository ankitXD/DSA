package Day1;

public class Two_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 2, 7, 11, 15 };
		int target = 9;
		int[] arr = twoSum(nums, target);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static int[] twoSum(int[] nums, int target) {
		int[] res = new int[2];
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					res[0] = i;
					res[1] = j;
				}
			}
		}
		return res;
	}

}
