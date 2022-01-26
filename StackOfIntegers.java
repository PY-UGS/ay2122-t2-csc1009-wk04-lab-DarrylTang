public class StackOfIntegers {
    int[] elements = new int[16];
    int size;

    public StackOfIntegers() {
    }

    // not sure how to restrain the "capacity" of an array
    public StackOfIntegers(int capacity) {
        int[] elements = new int[capacity];
    }

    public boolean empty(){
        if (this.size <= 0){
            return true;
        } else {
            return false;
        }
    }

    //returns the int at the top of the stack without removing from the stack
    public int peek() {
        return elements[size - 1];
    }

    public void push(int value) {
        this.size++;
        elements[size - 1] = value;
    }

    public int pop() {
        int popped = elements[size - 1];
        this.size--;
        return popped;
    }

    public int getSize() {
        return this.size;
    }

}
