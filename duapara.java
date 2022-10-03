public class duapara {
    public static void main(String[] args)
    {
        Exercise lambda = (x, y) -> {
            return x + y   ;
    };
        System.out.println(lambda.tambah(5, 6));
    }
    public interface Exercise{
        public int tambah(int x, int y);
    };
}

