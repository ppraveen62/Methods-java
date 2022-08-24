package methods;

public class ex {
	static void method3(String name, int age) {
		System.out.println(name + " age is " +age);
	}
	
	//The void keyword, used in the examples above, indicates that the method should not return a value. 
	//If you want the method to return a value, you can use a primitive data type (such as int, char, etc.)
	//instead of void, and use the return keyword inside the method:
	static int method4(int x, int y) {
		return x+y;
	}

	public static void main(String[] args) {
	method3("ravi",36);
	method3("ajay",23);
	
	System.out.println(method4(10,20));	
	}

}
