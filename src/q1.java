import datastructures.GenericStack;
import exception.EmptyStackException;
import exception.InvalidInputException;

public class q1 {
    public static void main(String[] args) throws InvalidInputException, EmptyStackException {
        GenericStack<Integer> intStack = new GenericStack<Integer>();
        try {
            intStack.push(1);
        } catch (InvalidInputException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        try {
            intStack.push(null);
        } catch (InvalidInputException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        try {
            intStack.push(3);
        } catch (InvalidInputException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        System.out.println("Stack of integers: ");
        intStack.print();
        try {
            intStack.pop();
        } catch (EmptyStackException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        System.out.println("Stack of integers after pop: ");
        intStack.print();

        GenericStack<String> stringStack = new GenericStack<>();
        try {
            stringStack.push("Hello");
        } catch (InvalidInputException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        try {
            stringStack.push("World");
        } catch (InvalidInputException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        System.out.println("Stack of strings: ");
        stringStack.print();
        try {
            stringStack.pop();
        } catch (EmptyStackException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        try {
            stringStack.pop();
        } catch (EmptyStackException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        try {
            stringStack.pop();
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        
        System.out.println("Stack of strings after pop: " );
        stringStack.print();

        GenericStack<Double> doubleStack = new GenericStack<>();
        doubleStack.push(1.1);
        doubleStack.push(2.2);
        doubleStack.push(3.3);
        System.out.println("Stack of doubles: ");
        doubleStack.print();
        doubleStack.pop();
        System.out.println("Stack of doubles after pop: ");
        doubleStack.print();
    }
}
