package practiceAdvanced.practice05;

import java.util.Scanner;

public class Q01_Ascii {

    // Kullanıcıdan aldığınız iki karakterin arasında bulunan
    // tüm karakterleri yazdıran bir kod yazınız.


    public static void main(String[] args) {


        Scanner input= new Scanner(System.in);
        System.out.println("Lutfen iki karakter giriniz.");

        char ch1= input.next().charAt(0);
        char ch2= input.next().charAt(0);


        for (char i=ch1; i<ch2; i++){
            System.out.print(i+ " ");
        }

        System.out.println();

        // 2. yol;
        int ilk= Math.min(ch1,ch2);
        int ikinci= Math.max(ch1,ch2);


        for (int j=ilk+1; j<ikinci; j++){
            System.out.print((char)j+ " ");
        }








    }


}
