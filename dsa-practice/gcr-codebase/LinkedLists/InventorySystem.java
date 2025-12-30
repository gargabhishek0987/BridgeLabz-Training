class Item {
    int id;
    String name;
    int quantity;
    double price;
    Item next;

    Item(int id, String name, int quantity, double price) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.next = null;
    }
}

class Inventory {

    Item head;

    // 1️⃣ Add item   end
    void addItem(int id, String name, int quantity, double price) {
        Item newItem = new Item(id, name, quantity, price);

        if (head == null) {
            head = newItem;
            return;
        }

        Item temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newItem;
    }

  void display() {
     Item temp = head;

        while (temp != null) {
            System.out.println(
                    "ID: " + temp.id +
                            ", Name: " + temp.name +
                            ", Qty: " + temp.quantity +
                            ", Price: " + temp.price);
            temp = temp.next;
        }
    }

    void searchById(int id) {
        Item temp = head;

        while (temp != null) {
            if (temp.id == id) {
                System.out.println("Item Found: " + temp.name);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item Not Found");
    }

    void updateQuantity(int id, int newQty) {
        Item temp = head;

        while (temp != null) {
            if (temp.id == id) {
                temp.quantity = newQty;
                System.out.println("Quantity Updated");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item Not Found");
    }

    void removeItem(int id) {

        if (head == null)
            return;

        if (head.id == id) {
            head = head.next;
            System.out.println("Item Removed");
            return;
        }

        Item temp = head;
        while (temp.next != null && temp.next.id != id) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Item Not Found");
        } else {
            temp.next = temp.next.next;
            System.out.println("Item Removed");
        }
    }

    void totalValue() {
        double total = 0;
        Item temp = head;

        while (temp != null) {
            total += temp.price * temp.quantity;
            temp = temp.next;
        }

        System.out.println("Total Inventory Value = " + total);
    }
}

public class InventorySystem {
    public static void main(String[] args) {

        Inventory inv = new Inventory();

        inv.addItem(101, "Laptop", 5, 50000);
        inv.addItem(102, "Mouse", 10, 500);
        inv.addItem(103, "Keyboard", 7, 1500);

        System.out.println("Inventory List:");
        inv.display();

        System.out.println("\nSearch Item:");
        inv.searchById(102);

        inv.updateQuantity(101, 8);

        inv.totalValue();

        inv.removeItem(103);

        System.out.println("\nAfter Removal:");
        inv.display();
    }
}

