class Fruit { String name; Fruit(String name) { this.name = name; } }
class Apple extends Fruit { Apple() { super("Apple"); } }
class Mango extends Fruit { Mango() { super("Mango"); } }

class FruitBox<T extends Fruit> {
    private java.util.List<T> fruits = new java.util.ArrayList<>();
    public void addFruit(T fruit) { fruits.add(fruit); }
    public void displayFruits() {
        for (T f : fruits) System.out.println(f.name);
    }
}

class FruitTest {
    public static void main(String[] args) {
        FruitBox<Apple> apples = new FruitBox<>();
        apples.addFruit(new Apple());
        apples.displayFruits();

        // FruitBox<Car> invalidBox = new FruitBox<>(); ❌ will not compile
    }
}
