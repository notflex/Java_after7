import java.util.*;

public class myclass {
    public static void main(String[] args){
       Integer[] strings = new Integer[500000];
       Random r = new Random();
       for(int i = 0; i < strings.length; i++){
           strings[i] = r.nextInt(100);
       }

       LinkedList<Integer> integerLinkedList = new LinkedList<>(Arrays.asList(strings));
        System.out.println("LinkedList");
        long stop;
        long start = System.nanoTime();
       for(int i = 0; i < 100000; i++){
           System.out.print(integerLinkedList.get(r.nextInt(500000)) + " ");
       }
        stop = System.nanoTime();
        System.out.print("Время Linkedlist:");
       System.out.println(stop - start);
        ArrayList<Integer> integerArrayList = new ArrayList<>(Arrays.asList(strings));
        System.out.println("ArrayList");
       start = System.nanoTime();
        for(int i = 0; i < 100000; i++){
            System.out.print(integerArrayList.get(r.nextInt(500000)) + " ");
        }
       stop = System.nanoTime();
        System.out.print("Время Array list:");
       System.out.println(stop - start);
    }
}
