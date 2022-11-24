package collections;

import java.util.HashMap;
import java.util.Scanner;

public class KullaniciBilgileriMap {

    public static void main(String[] args) {

     /* 1- Kullanıcıdan bir kişinin kimlik numarasını(4 haneli), tam ismini, adresini , telefonunu alın.
        2- Kimlik numarasını key olarak, diğer bilgileri value olarak bir mape depolayın
        3- Kimlik numarasını girerek kullanıcını bilgilerini ekrana yazdırın
        4- Tüm kullanicilarin isimlerini ekrana yazdıralım
     */

        HashMap<Integer,HashMap<String,String>> kisiListesi = new HashMap<>();
        Scanner input = new Scanner(System.in);

        String secim="";

        do{
            HashMap<String,String> kisiBilgileri = new HashMap<>();
            System.out.println("Adinizi soyadinizi giriniz");
            kisiBilgileri.put("Tam isim",input.nextLine()); // kullanicidan alinan isim direk map'e atandi
            System.out.println("Adresinizi giriniz");
            kisiBilgileri.put("Adres", input.nextLine());
            System.out.println("Telefon numaranizi giriniz");
            kisiBilgileri.put("Telefon", input.nextLine());

            System.out.println("Lutfen kimlik no giriniz");
            kisiListesi.put(input.nextInt(), kisiBilgileri); // TC'yi kisi listesine ekledik

            input.nextLine(); // DUMMY
            // Loop icerisinde art arda nexLine kullanildiginda Scanner bag olusturur  ve satir atlama yapar,
            // bunu engellemek icin nexLine() lar bittikten sonra tazdirma oncesinde
            // input.nextLine(); // DUMMY olusturulur.

            System.out.println("Kisi bilgileri: "+kisiBilgileri);
            System.out.println("Kisi Listesi: "+kisiListesi);
            System.out.println("Devam etmek istiyor musunuz E/H");
            secim = input.nextLine();

        }while (secim.equalsIgnoreCase("E"));

        System.out.println("Gormek istediginiz kisinin TC numarasini giriniz.");

        System.out.println(kisiListesi.get(input.nextInt()));


    }
}
