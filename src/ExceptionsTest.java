import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class ExceptionsTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] ints = {1,2,3,4,5};

        System.out.print("Podaj index: ");
        try {
            //Kod mogący wywołać wyjątek
            System.out.println(ints[scanner.nextInt()]);
        //Sekcja odpowiedzialna za reagowanie
        }catch (Exception exception){
            //Powoduje wypisanie stacktrace
            exception.printStackTrace();
            System.out.println("Podaj mniejszy zakres");
        }

        System.out.println("hehe wyjście");


//        try {
//            Files.write(new File("").toPath(), "asd".getBytes(), StandardOpenOption.CREATE_NEW);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        try {
            inMyProgram(5, 0);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static double inMyProgram(int a, int b) throws IOException {
        System.out.println("Witaj w kalkulatorze 2.0!");

            return divide(a, b);

    }


    // TA METODA ZNAJDUJE SIE W API
    public static int divide(int a, int b) throws IOException{
        if(b == 0) {
            throw new IOException("Nie dziel cholero przez 0!");
        }
        return a / b;
    }
}
