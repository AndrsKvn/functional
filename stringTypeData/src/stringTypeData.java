public class stringTypeData {
    public static void main(String[] args) {

        new Thread(() ->{
            System.out.println("Contoh menggunakan STRING LITERAL ");
            String sapa = "Selamat Pagi";
            System.out.println("Isi Variable nama adalah: "+sapa);
            System.out.println("Panjang karakter dari variable adalah: "+sapa.length());
            System.out.println("Uppercase Huruf: "+sapa.toUpperCase());
            System.out.println("Lowerrcase Huruf: "+sapa.toLowerCase());
            System.out.println("Kata pagi ada di urutan ke- "+sapa.indexOf("pagi"));
            String nama = "Indriani";
            System.out.println("Gabungan kata menjadi ---> "+ sapa +" "+nama);

        }).start();
    }
}