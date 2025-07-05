import java.util.Scanner;

public class DevTest {
  public static void main(String[] args) {
    prettyHeader("hello");
    Scanner in = new Scanner(System.in);
    String name = getNonZeroLenString(in, "Enter your name");
    System.out.println("Hello " + name);
    int number = getInt(in, "Enter a number");
    System.out.println("You entered: " + number);
    double decimal = getDouble(in, "Enter a decimal");
    System.out.println("You entered: " + decimal);
    int ranged = getRangedInt(in, "Enter a number between 1 and 10", 1, 10);
    System.out.println("You entered: " + ranged);
    double rangedDecimal = getRangedDouble(in, "Enter a decimal between 1.0 and 10.0", 1, 10);
    System.out.println("You entered: " + rangedDecimal);
    boolean ynConfirm = getYNConfirm(in, "Are you sure?");
    System.out.println("You entered: " + ynConfirm);
    String SSN = getRegExString(in, "Enter your SSN", "\\d{3}-\\d{2}-\\d{4}");
    System.out.println("You said your SSN is: " + SSN);
  }


  /**
   * @param pipe   a Scanner opened to read from System.in
   * @param prompt prompt for the user
   * @return a String response that is not zero length
   */
  public static String getNonZeroLenString(Scanner pipe, String prompt) {
    String retString = ""; // Set this to zero length. Loop runs until it isn't
    do {
      System.out.print("\n" + prompt + ": "); // show prompt add space
      retString = pipe.nextLine();
    } while (retString.length() == 0);


    return retString;


  }


  public static int getInt(Scanner pipe, String prompt) {
    int retValue = 0;
    String trash = "";
    boolean done = false;
    do {
      System.out.print("\n" + prompt + ": ");
      if ((pipe.hasNextInt())) {
        retValue = pipe.nextInt();
        pipe.nextLine();
        done = true;
      } else {
        trash = pipe.nextLine();
        System.out.println("You must enter a valid number not: " + trash);
      }
    } while (!done);
    return retValue;
  }


  public static double getDouble(Scanner pipe, String prompt) {
    double retValue = 0;
    String trash = "";
    boolean done = false;
    do {
      System.out.print("\n" + prompt + ": ");
      if ((pipe.hasNextDouble())) {
        retValue = pipe.nextDouble();
        pipe.nextLine();
        done = true;
      } else {
        trash = pipe.nextLine();
        System.out.println("You must enter a valid number not: " + trash);
      }
    } while (!done);
    return retValue;
  }


  public static int getRangedInt(Scanner pipe, String prompt, int low, int height) {
    int retValue = 0;
    String trash = "";
    boolean done = false;
    do {
      System.out.print("\n" + prompt + ": ");
      if (pipe.hasNextInt()) {
        retValue = pipe.nextInt();
        pipe.nextLine();
        if (retValue > low || retValue < height)
          done = true;
        else
          System.out.println("\nNumber is out of range [" + low + "," + height + "] not: " + retValue);
      } else {
        trash = pipe.nextLine();
        System.out.println("You must enter a valid number not: " + trash);
      }
    } while (!done);
    return retValue;
  }
  public static double getRangedDouble(Scanner pipe, String prompt, int low, int height){
    double retValue = 0;
    String trash = "";
    boolean done = false;
    do
    {
      System.out.print("\n" + prompt + ": ");
      if (pipe.hasNextDouble())
      {
        retValue = pipe.nextDouble();
        pipe.nextLine();
        if(retValue > low || retValue < height)
          done = true;
        else
          System.out.println("\nNumber is out of range [" + low + "," + height + "] not: " + retValue);
      }else {
        trash = pipe.nextLine();
        System.out.println("You must enter a valid number not: " + trash);
      }
    }while(!done);
    return retValue;
  }
  public static boolean getYNConfirm(Scanner pipe, String prompt)
  {
    String retValue = "";
    String trash = "";
    boolean ynConvert = false;
    boolean done = false;
    do
    {
      System.out.print("\n" + prompt + "[yY/nN]: ");
      if (pipe.hasNextLine()) {
        retValue = pipe.nextLine();
        if (retValue.equalsIgnoreCase("Y")) {
          ynConvert = true;
          done = true;
        } else if (retValue.equalsIgnoreCase("N")) {
          ynConvert = false;
          done = true;
        } else
          System.out.println("You must enter a valid response [yY/nN] not: " + retValue);
      }
    }while(!done);
    return ynConvert;
  }
  public static String getRegExString(Scanner pipe, String prompt, String regExPattern){
    String value = "";
    boolean gotAValue = false;
    do{
      System.out.print("\n" + prompt + ": ");
      value = pipe.nextLine();
      if(value.matches(regExPattern))
        gotAValue = true;
      else
        System.out.println("\nInvalid input: " + value);
    }while(!gotAValue);
    return value;
  }
  public static void prettyHeader(String msg){
    int totalWidth = 60;
    int border = 3;
    int centerSpace = totalWidth - 2 * border;
    int leftSpace = (centerSpace - msg.length())/2;
    for(int r=0;r<totalWidth;r++){
      System.out.print("*");
    }
    System.out.println();
    System.out.print("***");
    for(int r=0;r<leftSpace; r++){
      System.out.print(" ");
    }
    System.out.print(msg);
    for(int r=1; r<centerSpace - leftSpace - msg.length() + 1;r++){
      System.out.print(" ");
    }
    System.out.println("***");
    for(int r=0;r<totalWidth;r++){
      System.out.print("*");
    }
  }


}

