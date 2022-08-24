package methods;

public class moreparam {
	
	static void checkage(int age,String name) {
		if (age>18) {
			System.out.println(name+" your age is " +age +" greater than 18");
		}else {
			System.out.println(name+" your age is " +age +" under 18");
		}
	}

	public static void main(String[] args) {
		checkage(26,"kiran");
		checkage(17,"ravi");

	}

}
