package Unit_02.Chapter_03.Q_02_03_04;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int k = scanner.nextInt();
        
        for (int cushion = a; cushion <= b; cushion += k) {
            System.out.println(cushion);
        }
        
        scanner.close();

    }
}
