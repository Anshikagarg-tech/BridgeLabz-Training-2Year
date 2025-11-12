import java.util.*;

abstract class WarehouseItem { String name; WarehouseItem(String n){ name = n; } }
class Electronics extends WarehouseItem { Electronics(String n){ super(n); } }
class Groceries extends WarehouseItem { Groceries(String n){ super(n); } }
class Furniture extends WarehouseItem { Furniture(String n){ super(n); } }

class Storage<T extends WarehouseItem> {
    private List<T> items = new ArrayList<>();
    void addItem(T item){ items.add(item); }
    List<T> getItems(){ return items; }
}

class Warehouse {
    public static void displayAllItems(List<? extends WarehouseItem> list) {
        for(WarehouseItem item : list)
            System.out.println(item.name);
    }

    public static void main(String[] args) {
        Storage<Electronics> e = new Storage<>();
        e.addItem(new Electronics("TV"));
        e.addItem(new Electronics("Laptop"));

        displayAllItems(e.getItems());
    }
}
