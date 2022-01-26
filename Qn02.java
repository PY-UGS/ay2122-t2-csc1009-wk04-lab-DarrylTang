public class Qn02 {
    public static void main(String[] args) {
        StackOfIntegers stack = new StackOfIntegers();

        for (int i=0; i<10 ; i++) {
            stack.push(i);
        }

        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }

        System.out.println("");
        StackOfIntegers stack2 = new StackOfIntegers(5);
        for (int i=20; i<33 ; i++) {
            stack2.push(i);
        }

        System.out.println("Peeking stack: "+stack2.peek());
        System.out.println("Size of stack is "+stack2.getSize());

        while (!stack2.empty()) {
            System.out.print(stack2.pop() + " ");
        }
    }
}
