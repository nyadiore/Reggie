import java.util.Scanner;

public class SafeInput {

    public static String getRegExString(Scanner pipe, String prompt, String regEx) {
        String retString = "";
        boolean validInput = false;

        do {
            System.out.print(prompt + ": ");
            retString = pipe.nextLine();
            if (retString.matches(regEx)) {
                validInput = true;
            } else {
                System.out.println("Input does not match the required pattern. Please try again.");
            }
        } while (!validInput);

        return retString;
    }
}

