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
    int realName = 0;
    int max = 100;
    int min = 1;
    int randomNum = random.nextInt(min, max+ 1);

     
    // Project title
    System.out.println("---------------------------------");
    System.out.println("Welcome to Number Guessing Game!");
    System.out.println("Enter Number Between 1-100");

    // Loops and Statements
    while( !(randomNum == realName ) ){
        System.out.print("Enter a guess:");
        realName = scanner.nextInt();
        
        if( realName > 100 || realName < 0){
            System.out.println("PLS Enter Number Between 1-100");
        }
        if( realName > randomNum){
            System.out.println("HIGH");
        }else if( realName < randomNum ){
            System.out.println("LOW");
        }
    }


    System.out.println("great");
    scanner.close();
    }
}
