
public class Main {

	public static void main(String[] args) {
		//Demonstrate the default constructor
		Tweet t = new Tweet();
		System.out.println(t);
		
		System.out.println(); //Blank line
		
		//Demonstrate the parameterized constructor
		Tweet t2 = new Tweet("My cat is cool", "Mr. Fox");
		System.out.println(t2);

	}

}
