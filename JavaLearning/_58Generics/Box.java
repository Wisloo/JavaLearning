package _58Generics;

public class Box<T>{

    T item; // it doesn't know what is stored. T is like thing

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return this.item;
    }
}
