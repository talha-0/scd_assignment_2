import datastructures.GenericStack;

public class q1 {
    public static void main(String[] args) {
        GenericStack<Integer> intStack = new GenericStack<Integer>();
        intStack.push(1);
        intStack.push(2);
        intStack.push(3);
        System.out.println("Stack of integers: " + intStack.toString());
        intStack.pop();
        System.out.println("Stack of integers after pop: " + intStack.toString());

        GenericStack<String> stringStack = new GenericStack<>();
        stringStack.push("Hello");
        stringStack.push("World");
        System.out.println("Stack of strings: " + stringStack.toString());
        stringStack.pop();
        stringStack.pop();
        try {
            stringStack.pop();
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        
        System.out.println("Stack of strings after pop: " + stringStack.toString());

        GenericStack<Double> doubleStack = new GenericStack<>();
        doubleStack.push(1.1);
        doubleStack.push(2.2);
        doubleStack.push(3.3);
        System.out.println("Stack of doubles: " + doubleStack.toString());
        doubleStack.pop();
        System.out.println("Stack of doubles after pop: " + doubleStack.toString());
    }
}