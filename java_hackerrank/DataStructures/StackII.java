
class nodes{
    int key;
    nodes next;

    nodes(int k) {
        key = k;
        next = null;
    }
}

public class StackII {
    nodes top;
    StackII(){top=null;}

    void push(int k){
        nodes temp = new nodes(k);
        if(top == null){
            top = temp;
        } else {
            temp.next = top;
            top = temp;
        }
    }

    nodes pop() {
        if(top == null) return null;
        else {
            nodes temp = top;
            top = temp.next;
            return temp;
        }
    }

    public static void main(String[] args){
        StackII s= new StackII();
        s.push(5);
        s.push(9);
        nodes temp;
        temp = s.pop();
        if(temp != null) System.out.println(temp.key);
        temp = s.pop();
        if(temp != null) System.out.println(temp.key);
    }
}
