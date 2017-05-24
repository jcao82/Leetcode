public class TwoSum_1 {

	/***
	 * 题目： Given an array of integers, return indices of the two numbers such
	 * that they add up to a specific target.
	 * 
	 * You may assume that each input would have exactly one solution.
	 * 
	 * Example: Given nums = [2, 7, 11, 15], target = 9,
	 * 
	 * Because nums[0] + nums[1] = 2 + 7 = 9, return [0, 1].
	 * 
	 * 翻译： 给定一个整形数组和一个整数target，返回2个元素的下标，它们满足相加的和为target。
	 * 你可以假定每个输入，都会恰好有一个满足条件的返回结果。
	 * 
	 */

	public static void getIndices1(int[] arry, int target) {

		for (int i = 0; i < arry.length; i++) {
			int num = target - arry[i];

			for (int j = 0; j < arry.length; j++) {
				if (num == arry[j] && (num+arry[i]==target)) {
					System.out.println(i + ", " + j);
				}
			}
		}

	}

	public static void main(String[] args) {
		int nums[] = {2, 21, 11, 7};
		getIndices1(nums,18);
	}
}
