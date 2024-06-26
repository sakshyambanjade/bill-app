public class Main {
    public static void main(String[] args) {
        Burger btype = new Burger(false); // Example for a vegetarian burger
        btype.addcheese();
        btype.addtopings();
        btype.takeaway();
        btype.getbill();
    }
}