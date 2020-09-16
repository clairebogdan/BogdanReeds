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
}
