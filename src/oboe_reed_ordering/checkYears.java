/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oboe_reed_ordering;

/**
 *
 * @author clairebogdan
 */
public class checkYears {
    static boolean checkYears(float years) throws Exception {
        if (years < 0) {
            throw new Exception("You cannot play for a negative amount of years");
        }
        return true;
    }
    
    static String yearsExp(float years) {
        if (years <= 1.5) {
            String beginner = "Beginner";
            return beginner;
        }
        if (1.5 < years && years <= 3) {
            String intermediate = "Intermediate";
            return intermediate;
        }
        if (years > 3) {
            String advanced = "Advanced";
            return advanced;
        }
        return "error";
    } 
}
