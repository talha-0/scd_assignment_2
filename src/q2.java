import datastructures.FirstNonRepeatingStream;

public class q2 {
    public static void main(String[] args) {
        FirstNonRepeatingStream stream = new FirstNonRepeatingStream();
        stream.add('a');
        stream.add('b');
        stream.add('a');
        stream.printQueue();
        System.out.println("First non-repeating character: " + stream.getFirstNonRepeatingChar());
        stream.add('b');
        stream.printQueue();
        System.out.println("First non-repeating character: " + stream.getFirstNonRepeatingChar());
        FirstNonRepeatingStream stream2 = new FirstNonRepeatingStream();
        stream2.add('a');
        stream2.add('b');
        stream2.add('b');
        stream2.printQueue();
        System.out.println("First non-repeating character: " + stream2.getFirstNonRepeatingChar());
    }
}
