
public class Task07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 2.7;
		double b = -3.2;
		double c = 4.5;
		
		if (a>=0) {
			a = a*a;
		} else {
			a = Math.pow(a, 4);
		}
		
		if (b>=0) {
			b = b*b;
		} else {
			b = Math.pow(b, 4);
		}
		
		if (c>=0) {
			c = c*c;
		} else {
			c = Math.pow(c, 4);
		}
		
		System.out.println("Результат: a = "+a+"; b = "+b+"; c = "+c);
		

	}

}
