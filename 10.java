import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        Train train = new Train();
        train.ride_public_transport();
    }
}

interface Transport_sredstvo{
    void ride();
}

abstract class public_transport {
    void ride_public_transport() {
        System.out.println("I'm riding public transport");
    }
}
class Train extends public_transport implements Transport_sredstvo{

    @Override
    public void ride() {
        System.out.println("I'm riding train");
    }
}
