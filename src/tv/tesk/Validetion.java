package tv.tesk;

public class Validetion {

    public static int ValidOption(String option, int min, int max) {
        int optionInt = 0;
        while (true) {

            try {
                optionInt = Integer.parseInt(option);
                if (optionInt >= min && optionInt <= max) {
                    return optionInt;
                } else {
                    System.out.println(UI.Red + "Invalid option. Please select a valid option between " + min + " and " + max + "." + UI.Reset);
                    System.out.print("Please select an option: ");
                    option = new java.util.Scanner(System.in).nextLine();
                }

            } catch (NumberFormatException e) {
                System.out.println(UI.Red + "Invalid input. Please enter a number." + UI.Reset);
                System.out.print("Please select an option: ");
                option = new java.util.Scanner(System.in).nextLine();
            }
        }
    }
}
