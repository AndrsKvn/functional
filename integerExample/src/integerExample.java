public class integerExample {
    public static void main(String[] args) {
        new Thread(() -> {
            int min, max;
            min = Integer.MIN_VALUE;
            max = Integer.MAX_VALUE;
            System.out.println("Minimal size byte: " + min);
            System.out.println("Maximal size byte: " + max);
        }).start();
    }
}