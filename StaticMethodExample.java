public class StaticMethodExample {
    // Static method
    public static void staticMethod() {
        System.out.println("This is a static method.");
    }

    // Non-static method
    public void nonStaticMethod() {
        System.out.println("This is a non-static method.");
    }

    // Main method to test static and non-static methods
    public static void main(String[] args) {
        // Calling the static method directly using the class name
        StaticMethodExample.staticMethod();

        // Creating an instance to call the non-static method
        StaticMethodExample example = new StaticMethodExample();
        example.nonStaticMethod();
    }
}