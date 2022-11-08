package practiceAdvanced.practice01;

public class Q03_RegexQantifiers {
    public static void main(String[] args) {



        //Bir String değerin belirli sayıda karakter içerip
        // belirli bir karakter ile bitip bitmediğini kontrol eden bir kod yazınız.

        String str="as";
        System.out.println(str.matches(".s")); // true ==> herhangi bir karakter ile baslayip 's' harfi ile bitiyor

        // matches() methodu regex ile calisip String degerin regex ile karsilastirmasini yapar.
        System.out.println(str.matches("..s")); // false ==> 3 karakterli olmadigi icin false verir

        // Bir String değerin ikinci karakterinin
        // belirli bir karakter olup olmadığını kontrol eden bir kod yazınız.

        String str2= "javafgkf";
        System.out.println(str2.trim().matches(".a.*"));  // true ==> '.' dan sonra '*' kullanmak istediginiz kadar karakter olabilir demek
         // 1. karakter herhangi biri, 2. karakter 's' ve sonrasi da onemli degil anlami var.
        // trim() koymamizin sebebi basta ekstra bosluk olursa temizlesin

        // Bir String degerin sadece harf icerip icermedigini kontrol eden bir kod yaziniz
        System.out.println("ca".matches("[a-zA-Z]*"));

        //Bir String değerin belirli bir sayıda belirli karakterleri içerdiğini kontrol eden bir kod yazınız.
        System.out.println("abchd".matches("[a-zA-Z]{5}")); // true ==> 5 karakterli ve hepsi de harf
        System.out.println("abchdX".matches("[a-zA-Z]{5}"));// false ==> 5'ten fazla karakter iceriyor
        System.out.println("1dfgh".matches("[a-zA-Z]{5}")); // false ==> harf disinda karakter iceriyor


        //Bir String değerin belirli karakterleri en az belirli sayıda içerip içermediğini kontrol eden bir kod yazınız.
        System.out.println("1234567".matches("[0-9]{6,}")); // true ==> en az 6 rakam iceriyor
        System.out.println("12345".matches("[0-9]{6,}")); // false ==> 6' dan karakter iceriyor
        System.out.println("12345X".matches("[0-9]{6,}")); // false ==> rakam disi karakter iceriyor

        //Bir String değerin belirli karakterleri en az ve en çok belirli sayıda içerip içermediğini kontrol eden bir kod yazınız.
        System.out.println("abcd123xAc".matches("\\w{7,10}")); // true ==> en fazla 10 karakter(\\w) iceriyor
        // \\w ==> [a-zA-Z0-9_]
        System.out.println("abcd123_".matches("\\w{7,10}")); // true ==> en az 7 karakter(\\w) iceriyor

        // ilk karakter 1, ikinci karekter noktalama işareti ve kalan 8 karakter rakam toplam 10 karakter olmali,
        System.out.println("1?!.12345678".matches("[1][\\p{Punct}]{3}[0-9]*")); // true


        System.out.println("jhksjg".matches("[1][\\p{Punct}]{2,8}"));








    }
}
