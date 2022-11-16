package practiceAdvanced.practice10;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Q3_TextOkuma {

    //Bir text dosyasındaki 3. satırın kelime sayısını veren bir kod yazınız.

    public static void main(String[] args) throws IOException {


        BufferedReader file = new BufferedReader(new FileReader("C:/Users/Administrator/IdeaProjects/practice103-104-105/src/main/java/practiceAdvanced/practice10/File"));
        file.readLine();
        file.readLine();
        String line3 = file.readLine();
        System.out.println(line3);

        String[] arr= line3.split(" ");
        System.out.println(Arrays.toString(arr));
        System.out.println(arr.length);
        // System.out.println(file.readLine());



        // Son satiri okutma
        String line = null;
        while (file.readLine() != null) {
            line = file.readLine();
        }
        System.out.println(line);








    }
}
