package datastructures;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class FirstNonRepeatingStream {
    char count[] = new char[256];
    HashMap<Integer, Character> non_repeating_char;
    Queue<Character> queue;
    public FirstNonRepeatingStream(){
        queue = new LinkedList<>();
        for (int i = 0; i < 256; i++)
            count[i] = 0;
        non_repeating_char = new HashMap<>();
    }
    public void add(char c){
        queue.add(c);
        count[(int) c]++;
        if (count[c]==2)
            non_repeating_char.remove((int)c);
        else if (count[c]==1)
            non_repeating_char.put((int) c,c);
    }

    public void printQueue(){
        System.out.println("Stream: "+queue);
    }

    public char getFirstNonRepeatingChar(){
        if (non_repeating_char.size() == 0)
            return '-';
        return non_repeating_char.values().iterator().next();
    }
}