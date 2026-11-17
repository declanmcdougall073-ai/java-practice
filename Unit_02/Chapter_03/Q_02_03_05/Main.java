package Unit_02.Chapter_03.Q_02_03_05;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int intput = scanner.nextInt();
        for (int count = intput; count >= 1; count--){
        System.out.println(count);
        } System.out.println("Lift off! We have lift off! Good luck Luna!");
        scanner.close();
    }
}