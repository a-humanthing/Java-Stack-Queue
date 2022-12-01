package linear;

public class StackMain {
	public static void main(String[] args) {
		DynamicStack stack = new DynamicStack(4);
		stack.push(4);
		stack.push(16);
		stack.push(3);
 		stack.push(31);
		stack.push(12);
		stack.push(11);
		stack.push(16);
		stack.push(16);
		
		try {
			System.out.println(stack.pop());
			System.out.println(stack.pop());
			System.out.println(stack.pop());
			System.out.println(stack.pop());
			System.out.println(stack.pop());
			System.out.println(stack.pop());
			
			System.out.println("Peek = "+stack.peek());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

		
	}
}
