// Number Guessing Game 

// Libraries
import java.util.Scanner;
import java.util.Random;
import java.util.Locale;

public class App {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    scanner.useLocale(Locale.US);


    // Variables 

    int max = 100;
    int min = 1;
    int randomNum = random.nextInt(min, max+ 1);

     
    // Project title
    System.out.println("---------------------------------");
    System.out.println("Welcome to Number Guessing Game!");

    
    System.out.print("Enter Number between 1-100");
    






    scanner.close();
    }
}
