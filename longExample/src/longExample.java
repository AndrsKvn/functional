public class longExample {
    public static void main(String[] args) {
        new Thread (() -> {
            long min, max;
            min = Long.MIN_VALUE;
            max = Long.MAX_VALUE;
            System.out.println("Minimal size byte: " + min);
            System.out.println("Maximal size byte: " + max);
        }).start();
    }
}