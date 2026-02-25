
public class PalindroneCheckerApp {

    // Application Constants
    private static final String APP_NAME = "Palindrome Checker Application";
    private static final String VERSION = "1.0";
    private static final String DEVELOPER = "Developer";


    public static void main(String[] args) {

        displayWelcomeMessage();
        displayApplicationDetails();

        System.out.println("\nApplication started successfully.");
    }


    private static void displayWelcomeMessage() {
        System.out.println("=================================================");
        System.out.println("        WELCOME TO PALINDROME CHECKER APP       ");
        System.out.println("=================================================");
    }


    private static void displayApplicationDetails() {
        System.out.println("Application Name : " + APP_NAME);
        System.out.println("Version          : " + VERSION);
        System.out.println("Developer        : " + DEVELOPER);
    }
}