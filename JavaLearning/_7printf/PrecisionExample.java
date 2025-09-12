package _7printf;

public class PrecisionExample {
    public static void main(String[] args) {
        double price1 = 67.8912, price2 = 98.9312, price3 = 120.98929, cost;

        System.out.printf("The price for the pizza is %.3f, while the water costs around %.2f, while the toy costs %.2f\n", price1, price2, price3);

        cost = price1 + price2 + price3;
        System.out.printf("The total cost is %.2f", cost);



    }
}
