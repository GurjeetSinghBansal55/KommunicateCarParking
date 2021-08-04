package CarParking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		
		InputToParking input = new InputToParking();
		
		switch (args.length) {
        case 0:
            System.out.println("Please enter 'exit' to quit");
            System.out.println("Please enter the number of Parling Lot");
            // Interactive command-line input/output
            // Run an infinite loop
            for (;;) {
                try {
                    BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
                    String inputString = bufferRead.readLine();
                    if (inputString.equalsIgnoreCase("exit")) {
                        break;
                    } else if ((inputString == null) || (inputString.isEmpty())) {
                        // Do nothing
                    } else {
                        input.inputAction(inputString.trim());
                    }
                } catch(IOException e) {
                    System.out.println("Error in reading the input from console.");
                    e.printStackTrace();
                }
            }
            break;

        default:
            System.out.println("Invalid input.");
    }
	}
}
