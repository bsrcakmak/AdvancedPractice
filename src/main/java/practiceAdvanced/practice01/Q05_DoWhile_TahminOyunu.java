package practiceAdvanced.practice01;

import java.util.Scanner;

public class Q05_DoWhile_TahminOyunu {
    public static void main(String[] args) {

        //0 ile 100 arasında rastgele numara tahmini yapan bir kod yazın.
        //İpucu: Girdiğiniz numara rastgeleNumara'dan küçükse ==> Daha büyük bir numara giriniz.
        //       Girdiğiniz numara rastgeleNumara'dan büyükse ==> Daha küçük bir numara giriniz.
        //       Girdiğiniz numara rastgeleNumara'ya eşitse ==> Tebrikler!!!.


        Scanner input= new Scanner(System.in);
        int sayi;
        int rastgeleSayi= (int)(Math.random()*100)+1;
        System.out.println("rastgeleSayi = " + rastgeleSayi);
        int sayac=0;



        do {
            System.out.println("1-100 arasi bir sayi tahmini girin.");
            sayac++;
            
            sayi= input.nextInt();
            if (sayi==rastgeleSayi){
                System.out.println("Tebrikler!!");
            } else if (sayi<rastgeleSayi) {
                System.out.println("Daha buyuk bir sayi giriniz.");
                System.out.println(10-sayac+ " hakkiniz kaldi!");
            }else {
                System.out.println("Daha kucuk bir sayi giriniz");
                System.out.println(10-sayac+ " hakkiniz kaldi!");
            }
            if (sayac==10){
                System.out.println("Hakkiniz bitti, oyunu kaybettiniz.");

                int secenek= input.nextInt();

                if (secenek==1){
                    sayac=0;
                    rastgeleSayi=(int)(Math.random()*100)+1;
                }else {
                    break;
                }
            }
           
        }while (sayi!= rastgeleSayi);
















    }
}
