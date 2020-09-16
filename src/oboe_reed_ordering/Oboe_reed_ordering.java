package oboe_reed_ordering;
import java.util.Scanner;
import static oboe_reed_ordering.calcCost.calcCost;
import static oboe_reed_ordering.checkQty.checkQty;
import static oboe_reed_ordering.checkYears.checkYears;

public class Oboe_reed_ordering {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        // Welcome message and quantity recorded
        System.out.print("Welcome to Bogdan Reeds!\n"
                       + "How many reeds would you like? ");
        
        // Make sure the quantity entered is an integer between 1-15
        try {
            int qty = Integer.parseInt(input.nextLine());
            checkQty(qty);
            
            System.out.print("How many years has the oboist been playing? ");
            
            
            // Make sure the number of years playing is a float 0+
            try {
                float years = Float.parseFloat(input.nextLine());
                checkYears(years);
                
                System.out.println("What is your full name? ");
                String name = input.nextLine();
                
                System.out.println("What is your street address? ");
                String address = input.nextLine();
                
                System.out.println("What is your city? ");
                String city = input.nextLine();
                
                System.out.println("What is your state? ");
                String state = input.nextLine();
                
                System.out.println("What is your zip code? ");
                int zip = Integer.parseInt(input.nextLine());
                
                System.out.println("Would you like (1)standard or (2)priority "
                               + "shipping? (Please enter 1 or 2) ");
                int shipping = Integer.parseInt(input.nextLine());
                
                int totalCost = calcCost(qty, shipping);
                
                System.out.println("Your total is $" + totalCost + 
                                   "\n\nHow would you like to pay?\n"
                                 + "(1)Cash, (2)check, (3)Venmo, (4)CashApp, "
                                 + "and (5)Apple Pay are accepted. ");
                
                int paymentMethod = Integer.parseInt(input.nextLine());
                
                
                Order order = new Order(name, address, city, state, zip, shipping, totalCost, paymentMethod);
                
                System.out.println("Thank you for shopping with Bogdan Reeds!");
                System.out.println(order);
                
                
            
            // Years input was not valid
            } catch (Exception e) {
                System.out.println("Sorry, please enter the years the oboist "
                                 + "has been playing as a whole number or "
                                 + "decimal over 0");
            }
            
        // Quantity input was not valid 
        } catch (Exception e) {
            System.out.println("Sorry, you did not enter a valid input. "
                             + "Please enter a number between 1-15");
        }
        
    
    } 
}
