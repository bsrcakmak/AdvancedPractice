package practiceAdvanced.practice07;

import java.util.Random;

public class Q05_Exception_Throws {

    /*
   randomSayi isminde bir method oluşturunuz.
   Bu method içerisinde iki int random sayı oluştursun. (0'dan 10 a kadar)
   Bu iki random sayının toplamını yazdırın.
   Eğer bu iki random sayının toplamı 12 den küçükse "Exception" versin ve mesaj olarak
   ("Sayı 12'den küçük ise hata verir") yazdırın.
     */

    public static void main(String[] args) throws Exception {

        randomSayi();


    }

    public static void randomSayi() throws Exception {

        Random random= new Random();

        while (true){
            int a= random.nextInt(11);
            int b= random.nextInt(11);
            try{
                if (a+b<12){
                   throw new Exception();
                }else {
                    System.out.println(a+"--"+b);
                    System.out.println(a+b);
                    break;
                }
            }catch (Exception e){
                System.out.println(a+" + "+b+ " = "+ (a+b));
                System.out.println("Toplam 12'den kucuk olamaz.");
            }

        }

        // try-catch yaptigimiz icin baska bir class'tan cagirdigimizda
        // class'a throws Exception yapmamiz gerekmeyecek









    }




}
