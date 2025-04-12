public class ChildClass extends ParentClass {
    // Method in the child class
    public void childMethod() {
        System.out.println("This is a method in the ChildClass.");
    }

    // Main method to test inheritance
    public static void main(String[] args) {
        ChildClass child = new ChildClass();
        child.parentMethod(); // Calls the inherited method from ParentClass
        child.childMethod();  // Calls the method in ChildClass
    }
}