package practiceAdvanced.practice10;

public class Q05_Varargs_IlkiHaricTopla {

    /*
       Parametrelerinin ilki hariç  karakter sayılarını toplayan ve
       bu toplamı birinci parametrenin karakter sayısıyla çarpan bir method yazınız.
       (indeks ve if statement kullanmayınız)
   */

    public static void main(String[] args) {

        myMethod("Ali", "Veli", "Sally", "Holly");
    }

    public static void myMethod(String a, String... b){

        int toplam=0;
        for (String w: b){
            toplam+= w.length();
        }
        int sonuc = toplam*a.length();
        System.out.println("sonuc = " + sonuc);  //sonuc = 42



    }






}
