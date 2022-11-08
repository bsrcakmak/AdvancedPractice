package practiceAdvanced.practice05;

public class Q05_Market_Constructor {

    //Ürün adı, ürün fiyatı ve (varsa) son kullanma tarihlerini yazdıran bir market programı yazınız..

    public static void main(String[] args) {

        Market ekmekObjesi= new Market("Ekmek", 5, 1);

        System.out.println("Urunun Adi: "+ ekmekObjesi.urunAdi+" Urunun Fiyati: "+ ekmekObjesi.urunFiyati+" Son Kullanma Tarihi: "+ ekmekObjesi.sonKullanmaTarihi);


        Market nutellaObjesi2= new Market("Nutella", 45, 20);

        System.out.println("Urunun Adi: "+ nutellaObjesi2.urunAdi+" Urunun Fiyati: "+ nutellaObjesi2.urunFiyati+" Son Kullanma Tarihi: "+ nutellaObjesi2.sonKullanmaTarihi);



        Market bardakObjesi= new Market("Bardak", 50);

        System.out.println("Urunun Adi: "+ bardakObjesi.urunAdi+" Urunun Fiyati: "+ bardakObjesi.urunFiyati+" Son Kullanma Tarihi: "+ bardakObjesi.sonKullanmaTarihi);










    }





}
