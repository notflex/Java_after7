import java.util.Arrays;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;


public class main {
    public static void main(String[] args) throws IOException {
        String[] str = new String[5];
        File file = new File("/Users/gorod/Desktop/123.txt");
        FileReader fr = new FileReader(file);
        BufferedReader reader = new BufferedReader(fr);
        for (int i = 0; i < 5; i++) {
            str[i] = reader.readLine();
        }
        print_matrix(str, true);

    }

    static void print_matrix(String[] str, boolean t) {
        int[][] matrix = new int[5][5];
        for (int i = 0; i < 5; i++) {
            String[] line = str[i].split(" ");
            for (int j = 0; j < 5; j++) {
                matrix[i][j] = Integer.parseInt(line[j]);
            }
        }

        if (t) {
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    System.out.print(matrix[j][i] + " ");
                }
                System.out.println();
            }
        } else {
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}


