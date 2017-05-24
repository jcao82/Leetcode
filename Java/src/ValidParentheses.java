public class ValidParentheses {
	/**
	 * Given a string containing just the characters '(', ')', '{', '}', '[' and
	 * ']', determine if the input string is valid.
	 * 
	 * The brackets must close in the correct order, "()" and "()[]{}" are all
	 * valid but "(]" and "([)]" are not. 栈法
	 * 栈最典型的应用就是验证配对情况，作为有效的括号，有一个右括号就必定有一个左括号在前面
	 * ，所以我们可以将左括号都push进栈中，遇到右括号的时候再pop来消掉
	 * 。这里不用担心连续不同种类左括号的问题，因为有效的括号对最终还是会有紧邻的括号对。如栈中是({[，来一个]变成({，再来一个}，变成(。
	 */

	public static boolean solution(String str) {

		return false;
	}
}
