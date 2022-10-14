import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите координаты 1го вектора");
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();
        System.out.println("Введите координаты 2го вектора");
        Vector a = new Vector(x, y, z);
        int x1 = in.nextInt();
        int y2 = in.nextInt();
        int z3 = in.nextInt();
        Vector b = new Vector(x1, y2, z3);
        System.out.println("Длина первого вектора");
        System.out.println(a.v_length());
        System.out.println("Скалярное произведение 2х векторов");
        System.out.println(a.Scalar(b));
        System.out.println("Векторное произведение векторов");
        System.out.println(a.vectorMultiply(b));
        System.out.println("Сумма 2х векторов");
        System.out.println(a.sum(b));
        System.out.println("Разность");
        System.out.println(a.diff(b));


    }
}

class Vector {
    int x;
    int y;
    int z;

    Vector(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public String toString() {
        return "Vector{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    double v_length() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    int Scalar(Vector v) {
        return v.x * x + v.y * y + v.z * z;
    }

    Vector vectorMultiply(Vector b) {
        return new Vector(y * b.z - z * b.y, z * b.x - x * b.z, x * b.y - y * b.x);
    }

    Vector sum(Vector b) {
        return new Vector(x + b.x, y + b.y, z + b.z);
    }

    Vector diff(Vector b) {
        return new Vector(x - b.x, y - b.y, z - b.z);
    }

    void parametrs() {
        System.out.printf("x: %s \ty: %d\tz: %d\n", x, y, z);
    }

}
