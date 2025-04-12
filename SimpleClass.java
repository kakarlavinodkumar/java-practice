public class SimpleClass {
    private String message;

    // Constructor
    public SimpleClass(String message) {
        this.message = message;
    }

    // Getter for message
    public String getMessage() {
        return message;
    }

    // Setter for message
    public void setMessage(String message) {
        this.message = message;
    }

    // Method to display the message
    public void displayMessage() {
        System.out.println("Message: " + message);
    }

    // Main method to test the class
    public static void main(String[] args) {
        SimpleClass simpleClass = new SimpleClass("Hello, Java!");
        simpleClass.displayMessage();

        simpleClass.setMessage("Updated message!");
        simpleClass.displayMessage();
    }
}