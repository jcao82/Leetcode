public class TwoSum_1 {

	/***
	 * ��Ŀ�� Given an array of integers, return indices of the two numbers such
	 * that they add up to a specific target.
	 * 
	 * You may assume that each input would have exactly one solution.
	 * 
	 * Example: Given nums = [2, 7, 11, 15], target = 9,
	 * 
	 * Because nums[0] + nums[1] = 2 + 7 = 9, return [0, 1].
	 * 
	 * ���룺 ����һ�����������һ������target������2��Ԫ�ص��±꣬����������ӵĺ�Ϊtarget��
	 * ����Լٶ�ÿ�����룬����ǡ����һ�����������ķ��ؽ����
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
