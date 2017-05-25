import java.util.Stack;

public class ValidParentheses {
	/**
	 * Given a string containing just the characters '(', ')', '{', '}', '[' and
	 * ']', determine if the input string is valid.
	 * 
	 * The brackets must close in the correct order, "()" and "()[]{}" are all
	 * valid but "(]" and "([)]" are not. ջ��
	 * ջ����͵�Ӧ�þ�����֤����������Ϊ��Ч�����ţ���һ�������žͱض���һ����������ǰ��
	 * ���������ǿ��Խ������Ŷ�push��ջ�У����������ŵ�ʱ����pop������
	 * �����ﲻ�õ���������ͬ���������ŵ����⣬��Ϊ��Ч�����Ŷ����ջ��ǻ��н��ڵ����Ŷԡ���ջ����({[����һ��]���({������һ��}�����(��
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
