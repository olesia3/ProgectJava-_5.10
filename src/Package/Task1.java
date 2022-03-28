package Package;
public class Task1 {
	public static void main(String[] args) {
		int a=500;
		int b=500;
		while (a<650) {
			System.out.print(a+" ");
			a=a+10;
		}
		System.out.println("WHILE");
		do {
			System.out.print(b+" ");
			b=b+10;
		}
		while(b<650);
		System.out.println("DO-WHILE");
		
		
		for (int c=500;c<650;c=c+10) {
			System.out.print(c+" ");
		}
		System.out.println("FOR");
		
	}

}
