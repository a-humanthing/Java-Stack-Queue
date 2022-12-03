package linear;


public class StackLL {

    public static void main(String[] args) {
        StackLL stack = new StackLL();
        stack.push(2);
        stack.push(3);
        stack.push(7);
        stack.push(9);
        stack.display();
    }

    public class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
    }
    Node Top;
    
    public boolean push(int val){
        Node newnode = new Node(val);
        if(Top==null){
            Top=newnode;
            return true;
        }else{
            newnode.next=Top;
            Top=newnode;
            return true;
        }
    }
    public boolean isEmpty(){
        return Top==null;
    }
    public int pop() throws Exception{
        if(isEmpty()){
            throw new Exception("The stack is empty");
        }else{
            int removedItem = Top.data;
            return removedItem;
        }
    }
    public void display() {
        if(isEmpty())return;
        Node current = Top;
        while(current!=null){
            System.out.println(current.data);
            System.out.println("_");
            current=current.next;
        }
    }

}
