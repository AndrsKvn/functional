import java.util.Scanner;

public class konversiSuhu {
    public static void main(String[] args) {
        float farenheit, celcius;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan suhu dalam farenheit: ");
        farenheit = input.nextFloat();
        celcius = (farenheit - 32)*5/9;
        System.out.print("Suhu dalam celcius: "+celcius);

    }
}