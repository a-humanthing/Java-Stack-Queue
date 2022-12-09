package linear;

public class Runner {
    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue();
        System.out.println(cq.insert(1));
        cq.insert(3);
        cq.insert(2);
        cq.insert(19);
        cq.insert(19);
        System.out.println(cq.isFull());
    }
    

}
