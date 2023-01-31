public class Main {
    public static void main(String[] args) {

        /* directions:
        An application program where the user enters the price of an item and the program computes shipping costs.
        If the item price is $100 or more, then shipping is free otherwise it is 2% of the price.
        The program should output the shipping cost and the total price.

        Test runs:   (insert the output window copies here for the test runs)
        - valid input less than 100
        - valid input greater than 100
         */

        /* PSEUDOCODE:
        num SHIPPING_PERCENT = 0.02
        num itemPrice
        num shippingCost
        num totalPrice

        output "Enter item price:"
        input itemPrice

        if itemPrice >= 100 then
            totalPrice = itemPrice
            output "You spent over $100, so you get free shipping!"
        else
            shippingCost = itemPrice * SHIPPING_PERCENT
            totalPrice = itemPrice + shippingCost
            output "Shipping: $" + shippingCost
        endIf

        output "Total: $" + totalPrice
        */

        double SHIPPING_PERCENT = 0.02;     // shipping constant
        double itemPrice;                   // item price variable for "input"
        double shippingCost;                // cost of shipping gets stored here unless 0
        double totalPrice;                  // total price gets stored here

        System.out.println("Enter item price:");
        System.out.println("[Imagine the user inputs a price]");
        itemPrice = 101; // this is the pretend input
        System.out.println("Item: $" + itemPrice); // makes test runs clearer

        if (itemPrice >= 100) { // if they spent more than $100, the program doesn't even use the shippingCost var
            totalPrice = itemPrice;
            System.out.println("You spent over $100, so you get free shipping!");
        } else {
            shippingCost = itemPrice * SHIPPING_PERCENT; // if they didn't, shippingCost is 2% of itemPrice
            totalPrice = itemPrice + shippingCost; // totalPrice is the original price + shippingCost
            System.out.println("Shipping: $" + shippingCost); // tell them the cost of shipping
        }

        System.out.println("Total: $" + totalPrice); // regardless of how much they spent, it tells them the total

    }
}