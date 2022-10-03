public class satuparcon  {
    public static void main(String[] args)
    {
        Exercise lambda = (x) -> {
            return (x*x*x)-(2*x+5)   ;
    };
        System.out.println(lambda.tambah(2));
    }
    public interface Exercise{
        public int tambah(int x);
    };
}

