import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi;
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Üçgenin basamak sayısını Giriniz: ");
        sayi = scanner.nextInt();
        for (int i=1 ; i<= sayi; i++){
            for (int j=1 ; j<= sayi-i ; j++){
                System.out.println(" ");
            }
            for (int k=0; k<2*i-1; k++){
                System.out.println("*");
            }
            System.out.println("\n");
        }

    }
}
