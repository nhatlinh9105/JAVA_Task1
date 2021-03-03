package Task1;

public class SaleProducts {
    public static void main(String[] args) {
        double shoeprice = 90;
        int shoeqty = 10;
        double shirtprice = 50;
        int shirtqty = 5;
        double jacketprice = 110;
        int jacketqty = 7;
        double dressprice = 70;
        int dressqty = 8;
        double hatprice = 30;
        int hatqty = 5;

        double total = (shoeprice * shoeqty) + (shirtprice * shirtqty) + (jacketprice * jacketqty)
                + (dressprice * dressqty) + (hatprice * hatqty);

        System.out.printf("Total price of all products is: $%.2f", total);
    }
}
