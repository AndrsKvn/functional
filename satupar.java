public class satupar {
    public static void main(String[] args)
    {
        Exercise lambda = (x) -> {
            return x + 1 ;
    };
        System.out.println(lambda.tambah(2));
    }
    public interface Exercise{
        public int tambah(int x);
    };
}

