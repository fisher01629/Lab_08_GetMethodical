import java.util.Scanner;


public class CheckOut {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double itemPrice;
        double totalPrice = 0;
        boolean moreItems;
        boolean done = false;
        do {
            itemPrice = SafeInput.getRangedDouble(in,"What is the price of your item between 50 cents to 10 dollars? ", .5, 10);
            totalPrice += itemPrice;
            moreItems = SafeInput.getYNConfirm(in,"Do you have more items? " );
            System.out.println(moreItems);
            if (moreItems){
                done = false;
            }
            else{
                done = true;
            }
        }while(!done);
        System.out.printf("The total price of your item(s) is: $%,.2f%n", totalPrice );


    }
}

