import java.util.function.UnaryOperator;

public class myclass {
    public static void main(String[] args){
        UnaryOperator<Integer> uo = s -> s * s;
        System.out.print(uo.apply(144));
    }
}
