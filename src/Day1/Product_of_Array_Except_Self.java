package Day1;

public class Product_of_Array_Except_Self {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4 };
		int[] l = productExceptSelf(arr);
		for (int i = 0; i < l.length; i++) {
			System.out.print(l[i] + " ");
		}
	}

	public static int[] productExceptSelf(int[] nums) {
		int n = nums.length;
		int[] left = new int[n];
		int[] right = new int[n];
		left[0] = 1;
		right[n-1] = 1; 
		for (int i = 1; i < n; i++) {
			left[i] = left[i-1] * nums[i-1];
		}
		for (int i = n-2; i >= 0; i--) {
			right[i] = right[i+1] * nums[i+1];
		}
		for (int i = 0; i < n; i++) {
			left[i] = left[i] * right[i];
		}
		return left;
	}

}
