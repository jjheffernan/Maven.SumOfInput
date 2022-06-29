/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;
public class Main {


    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("input number: ");
        int input = scan.nextInt();
        int Asum = 0;
        for (int i = 0; i <= input; i++) {

            Asum = Asum + i;

        }
        System.out.println("Sum = " + Asum);
    }
}
