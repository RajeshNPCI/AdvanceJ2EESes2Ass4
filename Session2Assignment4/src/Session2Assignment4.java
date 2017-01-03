import java.util.Scanner;

public class Session2Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the month number to know no. of days in a month "
				+ "e.g.,January=1, Februrayr=2.......December=12");
		Scanner scanner=new Scanner(System.in);
		int key=scanner.nextInt();
		switch (key) {
		case 1:
			System.out.println(31);
			break;
		case 2:
			System.out.println(28);
			break;
		case 3:
			System.out.println(31);
			break;
		case 4:
			System.out.println(30);
			break;
		case 5:
			System.out.println(31);
			break;
		case 6:
			System.out.println(30);
			break;
		case 7:
			System.out.println(31);
			break;
		case 8:
			System.out.println(31);
			break;
		case 9:
			System.out.println(30);
			break;
		case 10:
			System.out.println(31);
			break;
		case 11:
			System.out.println(30);
			break;
		case 12:
			System.out.println(31);
			break;
		default:
			break;
		}
	}

}
