public class arrayExample {
    public static void main(String[] args) {
        new Thread(() ->{
            String[] fruits = {"Apple", "Grape", "Watermelon", "Banana"};
            System.out.println("Isi dari array ke-1: " +fruits[0]);
            System.out.println("Isi dari array ke-1: " +fruits[1]);

        }).start();

    }
}