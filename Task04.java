import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int sum = 0;

		
		
		while(true) {
			System.out.print("������� ����� ����� > ");
			if (sc.hasNextInt()) {
				a = sc.nextInt();
				sum = sum + a;
				System.out.println("��������� �������� ����� �������� �����: "+sum);
			} else {
				return;
			}
		}
	
	}

}
