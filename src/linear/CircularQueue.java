package linear;

public class CircularQueue {
	public int[] data;
	private static final int DEFAULT_SIZE=10;
	int end=0;
	int front =0;
	int size=0;
	public CircularQueue() {
		this(DEFAULT_SIZE);
	}
	public CircularQueue(int size) {
		this.data = new int[size];
	}
	public boolean isFull() {
		return end==data.length;
	}
	public boolean isEmpty() {
		return end==0;
	}
	public boolean insert(int item) {
		if(isFull()) {
			System.out.println("Que is full ");
			return false;
		}
		data[end++] = item;
		end=end%data.length;
		size++;
		
		return true;
	}
}
