public class main {
    public static void main(String[] args) throws Exception {
            try(SampleClass sc1 = new SampleClass()){
                sc1.do_smth();
            }
        }
    }

#отдельный файл
public class SampleClass implements AutoCloseable {
    public void do_smth() {
        System.out.println("Вызван метод класса");
    }

    @Override
    public void close() throws Exception {
        System.out.println("Объект отработал, высвобождаем ресурсы.");
    }


}
