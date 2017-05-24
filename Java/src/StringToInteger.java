public class StringToInteger {

	/**
	 * 题目： Implement atoi to convert a string to an integer.
	 * 
	 * Hint: Carefully consider all possible input cases. If you want a
	 * challenge, please do not see below and ask yourself what are the possible
	 * input cases.
	 * 
	 * Notes: It is intended for this problem to be specified vaguely (ie, no
	 * given input specs). You are responsible to gather all the input
	 * requirements up front.
	 * 
	 * 翻译： 实现一个atoi函数来把字符串转换为整型变量。
	 * 
	 * 分析： 这道题的AC率只有13.4%，主要是因为对特殊情况的处理上。具体有这么几种情况需要考虑： 1. 前面的空格 2.
	 * 除去前面的空格后，可以以“+、-、0”开头，需要做对应的处理 3.
	 * 除了起始处可以出现前2种情况提到的非数字字符，其他地方一旦出现，则忽略该字符以及其后的字符 4.
	 * 考虑边界，即是否超出Integer.MAX_VALUE
	 * ，Integer.MIN_VALUE。下面的方案采用long作为临时存储，方便做边界的判断。但是还要考虑是否会超出long的最大值
	 * ，所以笔者采用length长度做初步判断。
	 */

	public static int checkInteger(String str) {
		StringBuilder str1 = new StringBuilder();
		char[] cArr = str.toCharArray();
		boolean negative = false;
		for (int i = 0; i < cArr.length; i++) {
			if (cArr[i] == ' ') {
				continue;
			}
			if(cArr[i]=='-'){
				negative = true;
				continue;
			}
//			if((!Character.isDigit(cArr[i]))){
//				continue;
//			}
			str1.append(cArr[i]);
		}
		int x = Integer.valueOf(str1.toString());
		System.out.println(negative);
		return negative?-x:x;
	}

	public static void main(String[] args) {
		int x = checkInteger("  -0230232");
		System.out.println(x);
	}
}
