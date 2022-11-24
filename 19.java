import java.util.*;

public class myclass {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
       ArrayDeque<Integer> line = new ArrayDeque<Integer>();
        System.out.println("Введите количество чисел:");
        int a = scan.nextInt();
        System.out.println("Введите числа");
        int[] chisla = new int[a];
        for (int i = 0; i < a; i++){
            chisla[i] = scan.nextInt();
        }
        for (int j = a - 1; j >= 0;j--){
            if(j%2 != 0){
                line.addLast(chisla[j]);
            }
        }
        while(line.peek()!= null){
            System.out.print(line.pop() + " ");
        }
    }
}
