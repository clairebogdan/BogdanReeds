package oboe_reed_ordering;

public class calcCost {
    
    static int standard = 5;
    static int priority = 8;
    
    static int calcCost(int qty, int shipping) {
        if (shipping == 1) {
            int standardCost;
            standardCost = standard + (qty * 25);
            return standardCost;
        }
        if (shipping == 2) {
            int priorityCost;
            priorityCost = priority + (qty * 25);
            return priorityCost;
        }
        return 0;
    }
}
