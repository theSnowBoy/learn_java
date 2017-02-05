package algorithmTest.basic.easy_1;

import java.util.Stack;

public class ValidParentheses {

	// ���ϵļ򵥵�д����
	public boolean isValid2(String s) {
		Stack<Character> stack = new Stack<Character>();
		for (char c : s.toCharArray()) {
			if (c == '(')
				stack.push(')');// ����1
			else if (c == '{')
				stack.push('}');
			else if (c == '[')
				stack.push(']');
			else if (stack.isEmpty() || stack.pop() != c)// ����2: �����Ų���ջ����ƥ��϶�ʧ�ܡ�
				return false;
		}
		return stack.isEmpty();
	}

	public boolean isValid(String s) {
		char data[] = s.toCharArray();
		int position = 0;
		Stack<Character> stack = new Stack<>();
		stack.add(data[position]);
		position++;
		while (position < data.length) {
			if (!stack.isEmpty() && canDelete(stack.peek(), data[position])) {
				stack.pop();
				position++;
			} else {
				stack.push(data[position]);
				position++;
			}
		}
		if (stack.isEmpty())
			return true;
		return false;
	}

	public boolean canDelete(Character c1, Character c2) {
		if ((c1 == '(' && c2 == ')') || (c2 == '(' && c1 == ')')) {
			return true;
		} else if ((c1 == '[' && c2 == ']') || (c2 == '[' && c1 == ']')) {
			return true;
		} else if ((c1 == '{' && c2 == '}') || (c2 == '{' && c1 == '}')) {
			return true;
		}
		return false;
	}

}
