import java.util.Stack;

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

	public static void solution(String str) {

		char[] arr = str.toCharArray();
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < arr.length; i++) {
			if ((arr[i] == '(') || (arr[i] == '[') || (arr[i] == '{')) {
				stack.push(arr[i]);
			}
		}
		for (int i = arr.length - 1; i >= 0; i--) {
			
		}

//		stack.pop();
		System.out.println(stack);
	}

	public static void main(String[] args) {
		String str = "()[]{}";
		String str1 = "([)]";
		String str2 = "([{}])]";

		solution(str2);
	}

}
