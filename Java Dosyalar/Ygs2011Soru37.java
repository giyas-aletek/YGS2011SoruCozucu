package ygs2011soru37;

import java.util.Scanner;

public class Ygs2011Soru37 {

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("r gir (kucuk yay)");//kucuk yay
        String R = k.next();
        System.out.println("c gir (r'ya artima miktari)");
        String C = k.next();
        System.out.println("yayin Acini gir");
        String A = k.next();
        
        if (R.charAt(0)>='0'&&R.charAt(0)<='9') {
            double r = Double.parseDouble(R);
            double c = Double.parseDouble(C);
            double a = Double.parseDouble(A);
            double kAlan =Math.PI*Math.pow(r, 2)*(a/360.0);
            double bAlan =Math.PI*Math.pow((r+c), 2)*(a/360.0);
            double TaraliAlan = bAlan-kAlan;
            System.out.println("kucuk alan: "+kAlan);
            System.out.println("Buyuk alan: "+bAlan);
            System.out.println("Tarali Alan: "+TaraliAlan);
        }
        else{
            System.out.println("Buyuk Alan = Pi * ( "+R+"+"+C+")^2 *"+A+"/360");
            System.out.println("Kucuk Alan = Pi * "+R+"^2 *"+A+"/360");
            System.out.println("Tarali alan = pi*2*"+C+"*"+A+"*"+R+"*"+"+pi*"+A+"*"+C+"^2  /360");
            
        }
    }
    
}
