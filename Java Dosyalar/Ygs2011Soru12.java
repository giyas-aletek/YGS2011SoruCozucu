package ygs2011soru12;

import java.util.Scanner;

public class Ygs2011Soru12 {
    public static boolean tekMi(){
        return false;
    }

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("x katlarini girin");
        int x=k.nextInt();
        System.out.println("y katlarini girin");
        int y=k.nextInt();
        System.out.println("aradaki islem gir");
        char c = k.next().charAt(0);
        System.out.println("sonuc girin");
        int sonuc = k.nextInt();
        System.out.println(x+"x"+c+y+"y="+sonuc);

        if (sonuc%2!=0) { // sonuc tek oldugunda
            if (x%2==y%2) { // iki sayinin katlari ayni
                if (x%2==0) { // iki sayinin katlari cift ise
                    System.out.println("Yanlis ifade iki sayi katlari cift oldugund sonuc tek cikmaz");
                }
                else{ // iki sayinin katlari tek ise
                    System.out.println("bir sayi tek digeri cift ama hangisi tek hangisi cift bilemeyiz");
                }
            }
            else{
                if (x%2!=0) { //x kati tek y kat cift ise
                    System.out.println("x tektir");
                }
                else{
                    //System.out.println("x tek yada cift");
                }
                if(y%2 != 0){ //y kati tek x kat cift ise
                    System.out.println("Y tektir");
                }
                else{
                    //System.out.println("y tek yada cift");
                }
            }
        }
        else{ // sonuc cift oldugunda
            if (x%2 == y%2) {//iki sayinin katlari ayni ise
                System.out.println("ikisi ayni ya ikisi tek yada ikisi cift");
            }
            else{
                if (x%2==0) {
                    //System.out.println("tek yada cift bilemeyiz");
                }
                else{
                    System.out.println("x cift");
                }
                if (y%2==0) {
                    //System.out.println("tek yada cift bilemeyiz");
                }
                else{
                    System.out.println("y cift");
                }
            }
        }        
    }    
}
