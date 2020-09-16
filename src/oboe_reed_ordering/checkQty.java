package oboe_reed_ordering;

import java.io.IOException;

public class checkQty {
    static boolean checkQty(int qty) throws IOException {
        if (qty <= 0) {
            throw new IOException("Please enter a number between 1-15");
        }
        else {
            return true;
        }
    }
    
}
