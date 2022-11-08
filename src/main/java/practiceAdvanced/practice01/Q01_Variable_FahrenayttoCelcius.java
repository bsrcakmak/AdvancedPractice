package practiceAdvanced.practice01;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Q01_Variable_FahrenayttoCelcius {
    public static void main(String[] args) {


        // Fahrenheit değeri, Celsius değere çeviren kod yazınız.
        // formül: c = (f-32)*5/9

        Scanner input=new Scanner(System.in);
        System.out.println("Fahrenheit degeri giriniz.");

        double f= input.nextDouble();
        double c= (f-32)*5/9;
        System.out.println(c);  // 22.22222222222222


        //
        NumberFormat numberFormat=new DecimalFormat(".##");  // (constracter) (noktadan sonrasina ## koy demek noktadan sonraki iki haneyi ver demek)
        String formattedC= numberFormat.format(c);  //(String verir)
        System.out.println("formattedC = " + formattedC+1); // formattedC = 22.22


        double doubleC= Double.valueOf(formattedC);
        System.out.println("doubleC = " + doubleC+1);














    }
}
