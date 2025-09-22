package _44GettersAndSetters;

public class Car {

    private final String model; // final means you cannot change it
    private String color; // we cannot access this outside of car class
    private int price; // but there is a way around that

    Car(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }
    String getModel() {
        return this.model;
    }
    String getColor() {
        return this.color;
    }
    /*int getPrice() {
        return this.price;
    }*/
    String getPrice() {
        return "$" + this.price;
    }
    void setColor(String color) {
        this.color = color;
    }
    void setPrice(int price){
        if(price < 0) {
            System.out.println("Price can't be less than 0");
        } else {
            this.price = price;
        }
    }
}
