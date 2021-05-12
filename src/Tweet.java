
public class Tweet {
	String text;
	String author;
	int likes;

	// Default constructors contain no parameters
	// and set default values for the instance variables
	public Tweet() {
		text = "";
		author = "";
		likes = 0;
	}

	// Parameterized constructors use parameters to
	// initialize the instance variables
	public Tweet(String text, String author) {
		// 'this' allows us to distinguish between the instance variable and
		// parameter of the same name
		this.text = text;
		this.author = author;
		likes = 0;
	}

	public void like() {
		likes++;
		System.out.println("You liked this");
	}

	// Post: appends reply and name to text
	public void addReply(String reply, String name) {
		text += "\n > " + reply + "\n  -" + name;
	}

	// Post: Returns the object as a String
	public String toString() {
		return author + " tweeted \n" + text + "\n" + likes + " likes";
	}

}
