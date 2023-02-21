public class Food {
    private boolean isSpicy;
    private int quantity;
    private String origin;
    private boolean isSweet;

    public Food(boolean isSpicy, int quantity, String origin, boolean isSweet) {
        this.isSpicy = isSpicy;
        this.quantity = quantity;
        this.origin = origin;
        this.isSweet = isSweet;
    }

    public void printInfo() {
        System.out.println("Is Spicy: " + isSpicy);
        System.out.println("Quantity: " + quantity);
        System.out.println("Origin: " + origin);
        System.out.println("Is Sweet: " + isSweet);
    }
}

public class Chinese extends Food {
    public Chinese(boolean isSpicy, int quantity, boolean isSweet) {
        super(isSpicy, quantity, "China", isSweet);
    }
}

public class Italian extends Food {
    public Italian(boolean isSpicy, int quantity, boolean isSweet) {
        super(isSpicy, quantity, "Italy", isSweet);
    }
}

public class Indian extends Food {
    public Indian(boolean isSpicy, int quantity, boolean isSweet) {
        super(isSpicy, quantity, "India", isSweet);
    }
}