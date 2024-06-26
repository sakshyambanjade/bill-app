public class Burger {
    private int price;
    private Boolean veg;
    private int cheese = 20;
    private int topings = 30;
    private int delivery = 20;
    private int bprice;
    private boolean ischeeseadded = false;
    private boolean istopingsadded = false;
    private boolean isdeliveryadded = false;

    public Burger(Boolean veg) {
        this.veg = veg;
        if (this.veg) {
            this.price = 100;
        } else {
            this.price = 200;
        }
        bprice = this.price;
    }

    public void addcheese() {
        ischeeseadded = true;
        this.price += cheese;
    }

    public void addtopings() {
        istopingsadded = true;
        this.price += topings;
    }

    public void takeaway() {
        isdeliveryadded = true;
        this.price += delivery;
    }

    public void getbill() {
        String bill = "";
        System.out.println("Burger: " + bprice);
        if (ischeeseadded) {
            bill += "Extra cheeses added: " + cheese + "\n";
        }
        if (istopingsadded) {
            bill += "Extra topings added: " + topings + "\n";
        }
        if (isdeliveryadded) {
            bill += "Delivery charges: " + delivery + "\n";
        }
        bill += "Bill: " + this.price + "\n";
        System.out.println(bill);
    }

}