package HelloWorld;

public class App {

	public static void main(String[] args) {
		Boolean isWriting = false;
		String output = "N/A";
		HelloWorld hw = new HelloWorld();
		if (isWriting) {
			output = "Hello World!";
		} else if (!isWriting) {
			output = "There is nothing to see here";
			Cat c = new Cat("Jess", true, Breed.TABBY);
			output = c.toString();
		}
		hw.printFunction(output);
	}
}
