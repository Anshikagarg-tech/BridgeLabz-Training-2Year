import java.util.*;

class Cart<T> {
    private List<T> items = new ArrayList<>();

    public void addItem(T item) { items.add(item); }
    public void removeItem(T item) { items.remove(item); }
    public void displayItems() {
        System.out.println("Cart contains: " + items);
    }
}

class GenericCartDemo {
    public static void main(String[] args) {
        Cart<String> electronicsCart = new Cart<>();
        electronicsCart.addItem("Laptop");
        electronicsCart.addItem("Mobile");

        Cart<String> clothingCart = new Cart<>();
        clothingCart.addItem("T-Shirt");
        clothingCart.addItem("Jeans");

        electronicsCart.displayItems();
        clothingCart.displayItems();
    }
}
