import java.util.Scanner;

public class Lab3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int userNum;
		int i;
		char answer = 'Y';

		while ((answer == 'Y') || (answer == 'y')) {
			System.out.println("Enter an integer: ");
			userNum = scan.nextInt();
			int userNumSquared = userNum * userNum;
			int userNumCubed = userNum * userNum * userNum;

			System.out.printf("%-10s %-10s %-10s\n", "Number", "Squared", "Cubed");
			System.out.printf("%-10s %-10s %-10s\n", "=======", "=======", "=======");

			for (i = 1; i < userNum; ++i) {
				System.out.printf("%-10s %-10s %-10s\n", i, i * i, i * i * i);
			}

			System.out.printf("%-10s %-10s %-10s\n", userNum, userNumSquared, userNumCubed);
			
			System.out.println("Continue? (y/n): ");
			answer = scan.next().charAt(0);
		}
	}

}
