import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	//Input
		System.out.println("Enter a value:");	//asking for input
		int num = sc.nextInt();					//reading input
//		Create new object to access methods of class Sequence
		Sequence visual = new Sequence();
//		Invoke method from Sequence class
		visual.One(num);
		visual.Two(num);
		visual.Three(num);
		visual.Four(num);
		visual.Five(num);
		visual.Six(num);
	}
}
