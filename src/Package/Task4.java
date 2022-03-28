package Package;
public class Task4 {
	public static void main(String[] args) {
		// 10*9*8*7*6*5*4*3*2*1=10!
		int f = 1;
		for(int i=1; i<=10; i++) {
			f = f*i;
		}
		System.out.println("Факторіал числа 10 = "+f);
		
		int b=1;
		int a=1;
		while(a<=10) {
			b=b*a;
			a++;
		}
		System.out.print("Факторіал числа 10 = "+b);
	}
}
