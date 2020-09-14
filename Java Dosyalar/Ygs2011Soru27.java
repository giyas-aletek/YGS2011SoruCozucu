package ygs2011soru27;

import java.util.Scanner;

public class Ygs2011Soru27 {

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("toplam top sayisi gir");
        int topSayisi=k.nextInt();        
        System.out.println("1. torbadaki kirmizi top sayisi gir");
        int k1=k.nextInt();//3        
        System.out.println("1. torbadaki beyaz top sayisi gir");
        int k2=k.nextInt();//1        
        System.out.println("2. torbadaki kirmizi top sayisi gir");
        int k3=k.nextInt();//1        
        System.out.println("2. torbadaki beyaz top sayisi gir");
        int k4=k.nextInt();//1
        System.out.println("iki torbadan kirmizi top cekme olasiligi gir pay sonra payda");
        double pay=k.nextInt();
        double payda=k.nextInt();
        double oran =pay/payda;
        double X=0.0,Y=0.0;
        double x2,y2;
        for (double x = (k1+k2); x <= (topSayisi -(k3+k4)); x=x+1.0) {
            for (double y = (k3+k4); y <= (topSayisi -(k1+k2)); y=y+1.0) {
                if ((k1/x)*(y/(topSayisi-x))==oran && X==0.0) {
                    X=x;
                    Y=y;
                    break;
                }
            }
        }
        x2= topSayisi-X;        
        y2=x2-Y;
        System.out.println("---------");
        System.out.println("1. torpa top sayisi: "+X);
        System.out.println("2. torpa top sayisi: "+x2);
        System.out.println("-------------------");
        System.out.println("1. torpa kirmizi top sayisi: "+k1);
        System.out.println("1.torpa beyaz top sayisi: "+(X-k1));
        System.out.println("----------------------------");
        System.out.println("2. torpa kirmizi top sayisi: "+Y);        
        System.out.println("2.torpa beyaz top sayisi: "+y2);
        System.out.println("----------------------");
        
    }
    
}
