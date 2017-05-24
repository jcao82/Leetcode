public class StringToInteger {

	/**
	 * ��Ŀ�� Implement atoi to convert a string to an integer.
	 * 
	 * Hint: Carefully consider all possible input cases. If you want a
	 * challenge, please do not see below and ask yourself what are the possible
	 * input cases.
	 * 
	 * Notes: It is intended for this problem to be specified vaguely (ie, no
	 * given input specs). You are responsible to gather all the input
	 * requirements up front.
	 * 
	 * ���룺 ʵ��һ��atoi���������ַ���ת��Ϊ���ͱ�����
	 * 
	 * ������ ������AC��ֻ��13.4%����Ҫ����Ϊ����������Ĵ����ϡ���������ô���������Ҫ���ǣ� 1. ǰ��Ŀո� 2.
	 * ��ȥǰ��Ŀո�󣬿����ԡ�+��-��0����ͷ����Ҫ����Ӧ�Ĵ��� 3.
	 * ������ʼ�����Գ���ǰ2������ᵽ�ķ������ַ��������ط�һ�����֣�����Ը��ַ��Լ������ַ� 4.
	 * ���Ǳ߽磬���Ƿ񳬳�Integer.MAX_VALUE
	 * ��Integer.MIN_VALUE������ķ�������long��Ϊ��ʱ�洢���������߽���жϡ����ǻ�Ҫ�����Ƿ�ᳬ��long�����ֵ
	 * �����Ա��߲���length�����������жϡ�
	 */

	public static int checkInteger(String str) {
		StringBuilder str1 = new StringBuilder();
		char[] cArr = str.toCharArray();
		boolean negative = true;
		for (int i = 0; i < cArr.length; i++) {
			if (cArr[i] == ' ') {
				continue;
			}
			if(cArr[i]=='+'){
				negative = false;
				continue;
			}
//			if((!Character.isDigit(cArr[i]))){
//				continue;
			//���string�з�����
//			}
			str1.append(cArr[i]);
		}
		int x = Integer.valueOf(str1.toString());
		return negative?-x:x;
	}

	public static void main(String[] args) {
		System.out.println(checkInteger("  -23433  23213  "));
		
	}
}
