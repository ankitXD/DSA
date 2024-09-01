package Day2;

public class Maximum_Product_Subarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = { 2, 3, -2, 4 };
		System.out.println(maxProduct(nums));
	}

	public static int maxProduct(int[] nums) {
		int n = nums.length;
		int leftProd = 1;
		int rightProd = 1;
		int ans = nums[0];

		for (int i = 0; i < n; i++) {
			leftProd = leftProd == 0 ? 1 : leftProd;
			rightProd = rightProd == 0 ? 1 : rightProd;

			leftProd = leftProd * nums[i];

			rightProd = rightProd * nums[n - 1 - i];

			ans = Math.max(ans, Math.max(leftProd, rightProd));
		}
		return ans;
	}

}
