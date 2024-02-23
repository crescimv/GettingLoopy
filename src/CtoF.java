import java.util.Scanner;

public class CtoF {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //declarations
        double tempC;
        boolean validInput = false;

        //prompts user input
        System.out.println("Input temperature in degrees celsius");

        //do while loop checks if the user input is valid or not. If valid the loop ends, if invalid, prompts user to enter a number
        do {
            if (input.hasNextDouble()) {
                validInput = true;
            } else {
                System.out.println("Invalid input, please enter a number");
                input.next();
            }

    } while (!input.hasNextDouble());

        //takes the valid user input and assigns it to the tempC variable
        tempC = input.nextDouble();

    //celsius to fahrenheit process
    double tempF = (tempC * 9/5) + 32;
    System.out.println("The temperature in degrees fahrenheit is " + tempF);

    //checks if temperature is freezing or boiling
    if (tempC>=100) {
        System.out.println("The temperature has reached boiling point!");
    }
        if (tempC<=0) {
            System.out.println("The temperature has reached freezing point!");
        }
        }
    }
