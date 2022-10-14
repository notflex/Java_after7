import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        String namepg = in.nextLine();
        String surnamepg = in.nextLine();
        double mark = in.nextDouble();
        Student Misha = new PostGraduateStudent(namepg, surnamepg, mark);
        System.out.println(Misha.getScholarship());
    }
}

class Student {
    String name;
    String surname;
    double mark;
    Student(String name, String surname, double mark){
        this.name = name;
        this.surname = surname;
        this.mark = mark;
    }
    double getScholarship(){
        if (mark == 5){
            return 80;
        }
        else return 40;
    }
}
class PostGraduateStudent extends Student{
    PostGraduateStudent(String name, String surname, double mark) {
        super(name, surname, mark);
    }

    public double getScholarship(){
        if (mark == 5){
            return 150;
        }
        else if(mark>5){
            return 0;
        }
            return 100;
    }
}
