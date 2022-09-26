public class doubleExample {
    public static void main(String[] args) {

        new Thread(() ->{
            double min, max, positive, negative;
            min = Double.MIN_VALUE;
            max = Double.MAX_VALUE;
            positive = Float.POSITIVE_INFINITY;
            negative = Float.POSITIVE_INFINITY;
            System.out.println("Minimal size double: "+min);
            System.out.println("Maximal size double: "+max);
            System.out.println("Ukuran Positive double: "+positive);
            System.out.println("Ukuran Negative double: "+negative);

        }).start();
    }
}