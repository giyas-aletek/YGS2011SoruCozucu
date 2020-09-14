package ygs2011soru32;

import java.util.Scanner;

public class Ygs2011Soru32 {

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("kadin degisiklik sayisi gir");
        double Ks= k.nextDouble();
        System.out.println(Ks+" tane kadin degisikliktan sonra kadin otobusu yuzde kaci olur gir pay sonra payda gir");
        double k1=k.nextDouble();
        double k2=k.nextDouble();
        double kOran = k1/k2;
        System.out.println("inan erkek degisiklik sayisi gir");
        double Es= k.nextDouble();
        System.out.println(Es+" tane erkek degisikliktan sonra erkek otobusu yuzde kaci olur pay sonra payda gir");
        double e1 = k.nextDouble(); 
        double e2 = k.nextDouble(); 
        double eOran = e1/e2;
        double d1 = 1.0-kOran;// kadin degisiklikten sonra erkek orani
        double d2= (double)eOran;// erkek degisiklikten sonra erkek orani
        double s =(double) Es; // erkek degisiklik orani
        double y =(double) Ks; // kadin degisiklik orani
        double x= (Math.abs(s)-(d1*y)-(d2*Math.abs(s)))/(d1-d2);// x= yolcu sayisi
        x= Math.ceil(x);
        double kadin= (kOran*(x+Ks))-Ks;
        System.out.println("kadin yolccu sayisi: "+kadin);
        double erkek=(eOran*(x+Es))-Es;
        System.out.println("erkek yolccu sayisi: "+erkek);
        System.out.println("toplam yolcu sayisi: "+x);
        
    }
    
}
