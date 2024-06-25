public class Burger {
    private int price;
    private Boolean veg;

    public Burger(Boolean veg) {
        this.veg = veg;
        if (this.veg) {
            this.price = 100;
        } else {
            this.price = 200;
        }
    }

    public void getBurgerPrice() {
        System.out.println(this.price);
    }
}
