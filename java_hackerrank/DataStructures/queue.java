
class node{
    int key;
    node next;

    node(int k) {
        key = k;
        next = null;
    }
}

class queue {
    node front, rear;

    queue() {front=rear=null;}

    void enqueue(int k){
        node insert = new node(k);

        if(rear == null){
            front=rear=insert;
        } else {
            rear.next = insert;
            rear = insert;
        }
    }

    node dequeue(){
        if(front==null) return null;

        node retnode = front;
        front = front.next;

        if(front == null)
            rear = null;
        return retnode;
    }

    public static void main(String[] args){
        queue q = new queue();
        q.enqueue(1);
        q.enqueue(5);
        q.enqueue(9);
        q.dequeue();
        System.out.println(q.dequeue().key);
    }
}



