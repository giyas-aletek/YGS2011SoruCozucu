package ygs2011soru7;

import java.util.Scanner;

public class Ygs2011Soru7 {

    public static int fak(int n) {
        int carp = 1;
        for (int i = 1; i <= n; i++) {
            carp *= i;
        }
        return carp;
    }

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int cevablar[] = new int[5];
        System.out.println("Faktoriyel degeri gir");
        int x = k.nextInt();
        long z = fak(x);
        for (int i = 0; i < 5; i++) {
            char c = (char) (i + 65);
            System.out.println(c + " şıkkı gir");
            int q = k.nextInt();
            cevablar[i] = q;
        }
        //cevablari kucukten buyuge siralamasi icin
        for (int i = 0; i < cevablar.length; i++) {
            for (int j = 0; j < cevablar.length - 1; j++) {
                if (cevablar[j + 1] < cevablar[j]) {
                    int temp = cevablar[j];
                    cevablar[j] = cevablar[j + 1];
                    cevablar[j + 1] = temp;
                }
            }
        }
        //cevablari teker teker kontrol etmek icin
        for (int i = 0; i < cevablar.length; i++) {
            double f = Math.floor(Math.sqrt(z * cevablar[i]));
            if (f == Math.sqrt(z * cevablar[i])) {
                System.out.println("\nx'nin en kucuk alabilecegi deger:" + cevablar[i]);
                break;
            }
        }
    }
}
