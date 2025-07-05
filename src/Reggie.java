
import java.util.Scanner;


public class Reggie {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String SSN,UCM,menuChoice;
        SSN = SafeInput.getRegExString(in, "What is your SSN?" , "^\\d{3}-\\d{2}-\\d{4}$");
        System.out.println("You said your SSN is: " + SSN);
        UCM = SafeInput.getRegExString(in, "What is your UC Student M Number? ", "^(M|m)\\d{5}$");
        System.out.println("You said your UC Student M number is: " + UCM);
        menuChoice = SafeInput.getRegExString(in, "Would you like to Open, Save, View, or Quit(O/S/V/Q)? ", "^[OoSsVvQq]$");
        menuChoice = menuChoice.toUpperCase();
        switch (menuChoice){
            case "O":
                System.out.println("You chose to open menu choice.");
                break;
            case "S":
                System.out.println("You chose to save menu choice.");
                break;
            case "V":
                System.out.println("You chose to view menu choice.");
                break;
            case "Q":
                System.out.println("You chose to quit menu choice.");
                break;
        }
    }
}
