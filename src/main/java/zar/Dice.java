package zar;

import java.util.Random;

public class Dice {
    public static void main(String[] args) {
        int zar1, zar2, deneme=1;
        Random random = new Random();
        while (true){
            zar1= random.nextInt(6)+1;
            zar2= random.nextInt(6)+1;
            if (zar1==6 && zar2==6){
                System.out.println("-----\n"+ deneme + "Deneme yaparak zarları 6-6 atmayı başardık.");// döngüyü kırmak için
                break;
            }else {
                System.out.println(deneme + "Deneme \n Atılan ilk Zar: " + zar1 + "Atılan ikinci Zar: "+ zar2);
            }
            deneme++;
        }
    }
}
