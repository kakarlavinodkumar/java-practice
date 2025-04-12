public class ConcreteClass extends AbstractClassExample {

    @Override
    public void abstractMethod() {
        System.out.println("Implementation of the abstract method in ConcreteClass.");
    }

    // Main method to test the class
    public static void main(String[] args) {
        ConcreteClass concreteClass = new ConcreteClass();
        concreteClass.abstractMethod(); // Calls the implemented abstract method
        concreteClass.concreteMethod(); // Calls the inherited concrete method
    }
}