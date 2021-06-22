import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("> ");
		double a = sc.nextDouble();
		System.out.print("> ");
		double b = sc.nextDouble();
		System.out.print("> ");
		double c = sc.nextDouble();
		double result = Math.pow(a, 2)-Math.pow(b-c,2)+Math.log(b*b+1);

		System.out.println("Результат: "+result);


	}

}
