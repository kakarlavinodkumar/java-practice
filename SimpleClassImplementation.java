public class SimpleClassImplementation implements SimpleInterface {

    @Override
    public void display() {
        System.out.println("Displaying from SimpleClassImplementation.");
    }

    // Main method to test the implementation
    public static void main(String[] args) {
        SimpleClassImplementation implementation = new SimpleClassImplementation();
        implementation.display();
    }
}