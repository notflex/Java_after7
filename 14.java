import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int n = 5;
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите 5 строк:");
        String[] ArrayList = new String[n];
        int[] countString = new int[n];
        int min = 0;

        for (int i = 0; i < n; i++){
            ArrayList[i] = scan.nextLine();
            countString[i] = ArrayList[i].length();
        }
        for(int i = 0; i < 1; i++){
            min = countString[i];
            for (int j = 1; j < n; j++){
                if(countString[j] < min){
                    min = j;
                }
            }
            System.out.println("Самые короткие строки");
            for( int j = 0; j < n; j ++){
                if(min == countString[j]){
                    System.out.println(ArrayList[j]);
                }
            }

        }
    }
}

