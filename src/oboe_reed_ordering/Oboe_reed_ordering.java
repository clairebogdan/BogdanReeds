package oboe_reed_ordering;
import java.util.Scanner;
import static oboe_reed_ordering.calcCost.calcCost;
import static oboe_reed_ordering.checkQty.checkQty;
import static oboe_reed_ordering.checkYears.checkYears;
import static oboe_reed_ordering.checkYears.yearsExp;

public class Oboe_reed_ordering {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        // Welcome message and quantity question
        System.out.print("Welcome to Bogdan Reeds!\n"
                       + "How many reeds would you like? ");
        
        
        // Confirm that quantity entered is an integer between 1-15
        try {
            int qty = Integer.parseInt(input.nextLine());
            checkQty(qty);
            
            System.out.print("How many years has the oboist been playing? ");
            
            
            // Confirm that the number of years playing is a float 0 or higher
            try {
                float years = Float.parseFloat(input.nextLine());
                checkYears(years);
                String exp = yearsExp(years);
                
                
                // Gather string data for mailing name & address
                System.out.println("What is your full name? ");
                String name = input.nextLine();
                
                System.out.println("What is your street address? ");
                String address = input.nextLine();
                
                System.out.println("What is your city? ");
                String city = input.nextLine();
                
                System.out.println("What is your state? ");
                String state = input.nextLine();
                
                System.out.println("What is your zip code? ");
                
                
                // Confirm that zip code is an integer
                try {
                    int zip = Integer.parseInt(input.nextLine());
                    
                    System.out.println("Would you like (1)standard or "
                            + "(2)priority shipping? (Please enter 1 or 2) ");
                    
                    
                    // Confirm that shipping response is an int
                    try {
                        int shipping = Integer.parseInt(input.nextLine());
                        int totalCost = calcCost(qty, shipping);

                        System.out.println("Your total is $" + totalCost 
                                         + " for " + qty + " reeds."
                                         + "\n\nHow would you like to pay?\n"
                                         + "(1)Cash, (2)Check, (3)Venmo, "
                                         + "(4)CashApp, and (5)Apple Pay "
                                         + "are accepted. ");

                        
                        // Confirm that payment method response is an int
                        try {
                            int paymentMethod = Integer.parseInt(input.nextLine());
                            Order order = new Order(name, address, city, state, exp, 
                                                    zip, qty, shipping, totalCost, 
                                                    paymentMethod);

                            
                            // Order is complete!
                            System.out.println("### ORDER SUMMARY:");
                            System.out.println("### NAME: " + order.name);
                            System.out.println("### ADDRESS: " + order.address);
                            System.out.println("### CITY: " + order.city);
                            System.out.println("### STATE: " + order.state);
                            System.out.println("### ZIP: " + order.zip);
                            System.out.println("### COST: " + order.totalCost);
                            System.out.println("### ORDER: " + order.qty + " reeds, " + order.exp + " level");
                            System.out.println("### SHIPPING: " + order.shippingType(shipping));
                            System.out.println("### PAYMENT: " + order.paymentType(paymentMethod));
                            System.out.println("### Thank you for shopping with Bogdan Reeds!");
                        
                            
////////////////////////// CATCH BLOCKS FOR INVALID INPUTS /////////////////////                            
                       
                        // Payment method input was invalid
                        } catch (Exception e) {
                            System.out.println("Sorry, please enter 1, 2, 3, 4,"
                                             + "or 5 for payment method "
                                             + "options.");
                        }                      
                        
                    // Shipping input was invalid    
                    } catch (Exception e) {
                        System.out.println("Sorry, please enter 1 or 2 for "
                                         + "shipping options.");
                    }
  
                // Zip code was invalid    
                } catch (Exception e) {
                    System.out.println("Sorry, that was not a valid zip code.");
                }
                         
            // Years input was invalid
            } catch (Exception e) {
                System.out.println("Sorry, please enter the years the oboist "
                                 + "has been playing as a whole number or "
                                 + "decimal over 0");
            }
            
        // Quantity input was invalid 
        } catch (Exception e) {
            System.out.println("Sorry, you did not enter a valid input. "
                             + "Please enter a number between 1-15");
        }
    } 
}
