import java.util.Scanner;

/**
* The LoggingCompany program gets the length of some logs
* and displays how many of them could fit in a specific truck.
*
* @author Layla Michel
* @version 1.0
* @since 2022-02-17
*/

final class LoggingCompany {
    /**
    * Creating private constructor due to public/default constructor error.
    *
    * @throws IllegalStateException if there is an issue
    */
    private LoggingCompany() {
        throw new IllegalStateException("Utility class");
    }

    /**
    * Displays text to terminal.
    *
    * @param args nothing passed in
    */
    public static void main(String[] args) {
        final Scanner myObj = new Scanner(System.in);
        System.out.print("Enter the length of the logs(m): ");
        final String lengthString = myObj.nextLine();
        final float lengthFloat = Float.parseFloat(lengthString);

        final int maxWeight = 1100;
        final int kgPerMeter = 20;
        final float amount = maxWeight / (kgPerMeter * lengthFloat);
        final int amountInt = (int) amount;
        System.out.println("\n" + amountInt + " logs can fit into the truck.");
        myObj.close();
    }
}
