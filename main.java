package returnStatements;

public class main {

	public static void main(String[] args) {
printAMessage();
	
int sum = add(5,4);
System.out.println(sum);
	
		
	}

	public static void printAMessage() {
		System.out.println("This is our first method");	
	
	}

	public static int add(int a, int b) {
		System.out.println(a + b);
		return b;
	}
	
	
	
}

