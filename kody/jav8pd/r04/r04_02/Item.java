package r04.r04_02;

import java.util.Objects;

public class Item {
    private String description;
    private double price;
        
    public Item(String description, double price) {
        this.description = description;
        this.price = price;
    }

    public boolean equals(Object otherObject) {
        // Szybki test by sprawdziæ czy obiekty s¹ identyczne
        if (this == otherObject) return true;
        // Musi zwróciæ false jeœli jawny parametr to null
        if (otherObject == null) return false;
        // Sprawdza czy otherObject to Item
        if (getClass() != otherObject.getClass()) return false;
        // Test czy zmienne instancji maj¹ identyczne wartoœci
        Item other = (Item) otherObject;
        return Objects.equals(description, other.description)
            && price == other.price;
    }
    
    public int hashCode() {
        return Objects.hash(description, price);
    }
}