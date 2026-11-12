package Unit_02.Chapter_02.Q_02_02_01;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int number = Integer.parseInt(input);
        if (number % 3 == 0 && number % 5 == 0){
            System.out.println("Fizz Buzz");
        } else if (number % 3 == 0) {
            System.out.println("Fizz");
        } else if (number % 5 == 0) {
            System.out.println("Buzz");
        } else{
            System.out.println(number);}
    }
}
