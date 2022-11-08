package practiceAdvanced.practice03;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Q04_DoWhile_TopunSicramasi {
    public static void main(String[] args) {


        /*
 Bir top belirli yükseklikten atılmaktadır. (Scanner ile yuksekligi al)
 Atıldıktan sonra, atıldığı yüksekliğin 3/4 u kadar yerden yukarı doğru zıplamaktadır
 Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
 Bu ana kadar aldigi toplam yolu ve yere vurma sayısını bulan do while code blogu create ediniz.
 */


        Scanner input= new Scanner(System.in);
        System.out.println("Topun birakildigi yuksekligi giriniz.");
        double yukseklik= input.nextDouble();
        double toplamYol=0;
        int vurmaSayisi=0;

        do{
            vurmaSayisi++;
            toplamYol+=yukseklik;
            yukseklik= yukseklik*0.75;
            toplamYol+=yukseklik;

        }while(yukseklik>1);


        System.out.println("Yere vurma sayisi: "+vurmaSayisi);
        System.out.println("Tolam alinan yol: "+toplamYol);


        NumberFormat numberFormat= new DecimalFormat(".#");
        System.out.println(numberFormat.format(toplamYol));
















    }
}
