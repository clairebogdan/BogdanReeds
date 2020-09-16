package oboe_reed_ordering;

public class Order {
    String name, address, city, state, exp;
    int zip, qty, shipping, totalCost, paymentMethod; 
    
    public Order() {}
    
    public Order(String name, String address, String city, String state, String exp,
                 int zip, int qty, int shipping, int totalCost, int paymentMethod) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.state = state;
        this.exp = exp;
        this.zip = zip;
        this.qty = qty;
        this.shipping = shipping;
        this.totalCost = totalCost;
        this.paymentMethod = paymentMethod;
}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getExp() {
        return exp;
    }

    public void setExp(String exp) {
        this.exp = exp;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public int getShipping() {
        return shipping;
    }

    public void setShipping(int shipping) {
        this.shipping = shipping;
    }

    public int getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(int totalCost) {
        this.totalCost = totalCost;
    }

    public int getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(int paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
    
    public String shippingType(int x) {
        String type;
        if (x == 1) {
          type = "Standard";
          return type;
        }
        if (x == 2) {
            type = "Priority";
            return type;
        }
        return "error";
    }
    
    public String paymentType(int x) {
        String type;
        if (x == 1) {
          type = "Cash";
          return type;
        }
        if (x == 2) {
            type = "Check";
            return type;
        }
        if (x == 3) {
          type = "Venmo";
          return type;
        }
        if (x == 4) {
            type = "CashApp";
            return type;
        }
        if (x == 5) {
          type = "Apple Pay";
          return type;
        }
        return "error";
    }
    
}
