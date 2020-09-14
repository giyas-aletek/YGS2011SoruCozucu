package ygs2011soru17;

import java.util.Scanner;

public class Ygs2011Soru17 {

    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.println("k kat sayisi gir");
        int k=klavye.nextInt();
        System.out.println("ikinci sayiyi gir");
        int sayi=klavye.nextInt();
        System.out.println("hangi sayinin kati oldugunu gir");
        int z=klavye.nextInt();
        System.out.println("ust sinir belirle");
        int ustSinir=klavye.nextInt();
        int kSayisi=0;
        for (int i = 0; i < ustSinir; i++) {
            if ((k*i+sayi)%z==0) {
                kSayisi++;
            }
        }
        System.out.println(kSayisi);
        
    }
    
}
