package geek.java.concepts;
import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args) {
	// write your code here
        System.out.print("Enter the value: ");
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        switch (day){
            case 1:
                System.out.println("Today is Monday");
                break;
            case 2:
                System.out.println("Today is Tuesday");
                break;
            case 3:
                System.out.println("Today is Wednesday");
                break;
            case 4:
                System.out.println("Today is Thursday");
                break;
            case 5:
                System.out.println("Today is Friday");
                break;
            case 6:
                System.out.println("Today is Saturday");
                break;
            case 7:
                System.out.println("Today is Sunday");
                break;
            default:
                System.out.println("Selection did not match any of the day.");

        }
    }
}
