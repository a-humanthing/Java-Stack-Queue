package linear;

public class QueueMain {
	public static void main(String[] args) throws Exception {
		CustomQueue queue = new CustomQueue(4);
		queue.insert(7);
		queue.insert(23);
		queue.insert(3);
		queue.display();
		System.out.println(queue.remove());
		queue.display();
	}
}
