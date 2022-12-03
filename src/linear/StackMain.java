package linear;

public class StackMain {
	public static void main(String[] args) {
		CustomStack stack = new CustomStack(4);
		stack.push(4);
		stack.push(16);
		stack.push(3);
 		stack.push(31);
		try {
			stack.display();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		stack.push(12);
		stack.push(11);
		stack.push(16);
		stack.push(16);
		
		try {
			System.out.println(stack.pop());
			
			
			System.out.println("Peek = "+stack.peek());
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}

		
	}
}
