class ProductCategory {}
class BookCategory extends ProductCategory {}
class ClothingCategory extends ProductCategory {}
class GadgetCategory extends ProductCategory {}

class Product<T extends ProductCategory> {
    String name;
    double price;
    Product(String name, double price) {
        this.name = name; this.price = price;
    }
}

class Discount {
    public static <T extends Product<?>> void applyDiscount(T product, double percentage) {
        product.price -= product.price * (percentage / 100);
        System.out.println(product.name + " discounted price: " + product.price);
    }

    public static void main(String[] args) {
        Product<BookCategory> book = new Product<>("Java Programming", 500);
        Product<ClothingCategory> shirt = new Product<>("Shirt", 800);
        applyDiscount(book, 10);
        applyDiscount(shirt, 20);
    }
}
