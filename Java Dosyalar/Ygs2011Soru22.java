package ygs2011soru22;

import java.util.Scanner;

public class Ygs2011Soru22 {

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("sirayla kac kadin kac gunde bitirir");
        int kSayisi=k.nextInt();
        int kSure=k.nextInt();
        System.out.println("sirayla kac erkek kac gunde bitirir");
        int eSayisi =k.nextInt();
        int eSure = k.nextInt();
        System.out.println("sirayla kac kadin kac erkek birlikte calisacak");
        int kadin=k.nextInt();
        int erkek=k.nextInt();
        double X=(kSayisi*kSure)/kadin;
        double Y=(eSayisi*eSure)/erkek;
        System.out.println(kadin+" kadin bu isi "+X+" gunde bitirir");
        System.out.println(erkek+" erkek bu isi "+ Y +" gunde bitirir");
        double z = 1/X + 1/Y;
        System.out.println("Ayni isi birlikte yaparsa 1 gunde isin "+z+"% yapmis olurlar");
        z=1/z;
        System.out.println(kadin+" kadin ve "+erkek+"erkek bu isi "+z+" gunde bitirirler");
    }
    
}
