import java.util.Scanner;

public class Sayi {
    public static void main(String[] args) {
        int toplam =0;
        int sayi;
        while (true){
            Scanner sacanner= new Scanner(System.in);
            System.out.println("Sayı giriniz");
            sayi=sacanner.nextInt();
            if (sayi==0){
                System.out.println("0 Sayısını giridiniz. Girilen sayıların toplamı hesaplanıyor...");
                break;
            }
            toplam=toplam+sayi;
        }
        System.out.println("Sayılarının Toplam: " + toplam);
    }
}
