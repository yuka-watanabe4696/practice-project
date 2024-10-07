package method.q02;

public class Introduce {
	// Define the selfIntroduce method
	public void selfIntroduce(String name) {
		// Display the self-introduction using the passed name
		System.out.println("私の名前は" + name + "です。");
	}

	// Main method to execute the program
	public static void main(String[] args) {
		// Create an instance of the Introduce class
		Introduce introduce = new Introduce();

		// Call the selfIntroduce method and pass the name as an argument
		introduce.selfIntroduce("山田");
	}
}
