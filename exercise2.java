import java.util.Scanner;

public class exercise2 {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        driving("Mark");
        scan.close();
    }

    static void driving(String driver) {

        System.out.println("Learning how to drive!");
        test(driver);

        String feedback = getFeedBack(driver);

        // Define the base case / stopping condition
        if (feedback.equals("no")) {

            // Do something to reach the goal
            learnMore(driver);

            // Recursive call
            driving(driver);
        } else if (feedback.equals("yes")) {
            result(driver);
        }
    }

    static void test(String driver) {
        System.out.println("Driving...");
    }

    static String getFeedBack(String driver) {
        System.out.println("Did " + driver + " learn how to drive?");

        String feedback = scan.next();

        return feedback;
    }

    static void learnMore(String driver) {
        System.out.print("What should he do to learn how to drive?");
        String variable = scan.next();
        System.out.println("Learning. Added " + variable);
    }

    static void result(String driver) {
        System.out.println(driver + " can now drive!");
    }

}
